package com.sist.homework;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;
import java.awt.event.MouseListener;


public class GoodsTestDBPreparedStatement extends JFrame {
	
	JTextField jtf_no;		//상품번호를 입력받기 위한 입력상자
	JTextField jtf_item;	//상품명을 입력받기 위한 입력상자
	JTextField jtf_qty;		//수량을 입력받기 위한 입력상자
	JTextField jtf_price;	//가격을 입력받기 위한 입력상자
	
	JTable table;				//모든 상품목록을 엑셀과 같은 모양으로 보여주기 위한 테이블을 선언(JTable은 Vector받음)
	Vector colNames;			//테이블의 컬럼이름을 위한 벡터를 선언
	Vector<Vector> rowData;		//테이블의 데이터를 위한 벡터를 선언
	
	
	//수정할 상품번호,상품이름,상품수량,상품가격을 매개변수로 전달받아 데이터베이스에 수정하는 메소드 정의
	public void updateGoods(int no,String item,int qty,int price) {
		String sql = "update goods set item=?,qty=?,price=? where no=?";
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			//1.jdbc드라이버를 메모리로 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//2.DB 서버에 연결
			String url = "jdbc:oracle:thin:@localhost:1521:XE";
			String user = "c##sist";
			String pwd = "sist";
			conn = DriverManager.getConnection(url, user, pwd);
			
			//3.Statement 객체를 생성
			pstmt = conn.prepareStatement(sql);
			
			
			pstmt.setString(1, item);
			pstmt.setInt(2, qty);
			pstmt.setInt(3, price);
			pstmt.setInt(4, no);
			
			//4.데이터베이스 명령을 실행
			int re = pstmt.executeUpdate();
			
			//나머지 일처리
			if(re == 1) {
				System.out.println("상품수정에 성공하였습니다.");
				printGoods();
			}else {
				System.out.println("상품수정에 실패하였습니다.");
			}
			
			
		} catch (Exception e) {
			System.out.println("예외발생:"+e.getMessage());
		}finally {
			try {
				if(conn != null) {
					conn.close();
				}
				if(pstmt != null) {
					pstmt.close();
				}
			}catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	
	
	
	public void deleteGoods(int no) {
		
		String sql = "delete goods where no=?";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "c##sist", "sist");
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, no);
			
			int re = pstmt.executeUpdate();
			if(re == 1) {
				System.out.println("상품을 삭제하였습니다.");
				printGoods();
				jtf_no.setText("");
				jtf_item.setText("");
				jtf_qty.setText("");
				jtf_price.setText("");
			}else {
				System.out.println("삭제에 실패하였습니다.");
			}
			
		} catch (Exception e) {
			System.out.println("예외발생:"+e.getMessage());
		}finally {
			try {
				if(conn != null) {
					conn.close();
				}
				if(pstmt != null) {
					pstmt.close();
				}
			}catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	
	
	//추가할 상품번호,상품명,수량,단가를 매개변수로 전달받아 데이터베이스에 추가하는 메소드를 정의
	public void insertGoods(int no,String item,int qty,int price) {
		
		String sql = "insert into goods(no,item,qty,price) values(?,?,?,?)";
		
		//finally에서도 접근할 수 있도록 Connection과 Statement
		//변수를 try 바깥에 선언
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			//1.jdbc드라이버를 메모리로 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//2.DB서버에 연결
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "c##sist", "sist");
			
			//3.데이터베이스 명령을 실행할 수 있는 Statement 객체를 생성
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, no);
			pstmt.setString(2, item);
			pstmt.setInt(3, qty);
			pstmt.setInt(4, price);
			
			//4.데이터베이스 명령을 실행
			int re = pstmt.executeUpdate();
			
			if(re == 1) {
				System.out.println("상품등록에 성공하였습니다.");
				jtf_no.setText("");
				jtf_item.setText("");
				jtf_qty.setText("");
				jtf_price.setText("");
				
				//상품등록을 성공하면 테이블의 내용을 다시 읽어오도록 메소드 호출
				printGoods();
			}else {
				System.out.println("상품등록에 실패하였습니다.");
			}
			
			
			
		} catch (Exception ex) {
			System.out.println("예외발생:"+ex.getMessage());
		}finally {
			
			try {
				//5.사용했던 자원을 닫아줌
				
				if(pstmt != null) {
					pstmt.close();
				}
				
				if(conn != null) {
					conn.close();
				}
			}catch (Exception ex) {
				// TODO: handle exception
			}
		}
	}
	
	
	//데이터베이스에 연결하여 goods테이블의 모든 상품을 읽어와서(검색하여,조회하여) 
	//테이블에 출력하는 메소드 정의
	public void printGoods() {
		
		//새로운 상품을 등록하여 계속하여 호출될 수 있으니
		//rowData를 먼저 깨끗이 비워줌
		rowData.clear();
		
		//데이터베이스에 연결하여 실행할 명령어
		String sql = "select * from goods order by no";
		
		//데이터베이스 연결과 필요한 변수들을 선언
		Connection conn = null;		//DB서버에 연결을 위한 변수
		PreparedStatement pstmt = null;		//데이터베이스 명령을 실행하기 위한 변수
		ResultSet rs = null;		//읽어온 데이터를 담기 위한 변수
		
		try {
			//1.jdbc드라이버를 메모리로 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//2.DB서버에 연결
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "c##sist", "sist");
			
			//3.Statement객체 생성
			pstmt = conn.prepareStatement(sql);
			
			//4.데이터베이스 명령을 실행
			//		사용하는 메소드 두가지
			//			int re = executeUpdate(String sql)	==>자료를 추가,수정,삭제
			//			ResultSet rs = executeQuery(String sql)	==>자료를 읽어올 때
			rs = pstmt.executeQuery();
			
			//5.일처리를 함
			//검색한 자료가 있는만큼 반복 실행하여 한 행씩 읽어와서 그것을 벡터로 만들어
			//그 벡터를 테이블의 자료를 위한 rowData에 담음
			//ResultSet의 결과에서 특정 레코드를 가리키는 커서가 있음
			//이 커서를 한 행씩 옮겨주는 메소드가 next()
			//메소드는 다음의 레코드가 있어서 성공적으로 옮겨지면 true를 반환
			//다음에 레코드가 더이상 없어서 옮겨지지 않으면 false를 반환
			//그래서 보통 ResultSet의 결과를 모두 읽어서 처리하려면 다음과 같이 while문 이용
			while(rs.next()) {
				//현재 커서가 바라보고 있는 레코드의 속성값을 읽어오기 위해서는 자료형에 따라
				//get~~()를 사용함
				//컬럼의 값이 문자열이라면 getString()을 이용
				//컬럼의 값이 정수형이라면 getInt()를 이용
				//이때 매개변수로 컬럼의 인덱스나 컬럼이름을 문자열로 전달
				//여기서 인덱스는 1부터 시작
				int no = rs.getInt(1);
				String item = rs.getString(2);
				int qty = rs.getInt(3);
				int price = rs.getInt(4);
				
				//벡터를 하나 만들고 그 벡터에 no,item,qty,price를 담는다
				Vector v = new Vector();
				v.add(no);
				v.add(item);
				v.add(qty);
				v.add(price);
				
				
				//그 벡터를 rowData에 담음				
				rowData.add(v);
				
				//바뀐 내용으로 테이블을 다시 그림
				//처음 테이블을 만들때에는 rowData벡터가 비어있었음
				//나중에 테이블의 데이터인 rowData에 바뀐 자료를 적용하기 위해서는
				//updateUI를 호출해야 함
				table.updateUI();
				
			}
			
		} catch (Exception e) {
			System.out.println("예외발생:"+e.getMessage());
		}finally {
			try {
				
				//사용했던 자원들을 닫아줌
				if(rs != null) {
					rs.close();
				}
				
				if(pstmt != null) {
					pstmt.close();
				}
				
				if(conn != null) {
					conn.close();
				}
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	
	
	
	
	
	
	
	public GoodsTestDBPreparedStatement() {	
		
		//테이블에 들어갈 칼럼이름을 위한 벡터를 생성하고 자료를 추가
		colNames = new Vector();
		colNames.add("상품번호");
		colNames.add("상품이름");
		colNames.add("상품수량");
		colNames.add("상품단가");
		
		//테이블에 들어갈 실제 데이터들을 담기 위한 벡터를 생성하고 자료를 추가
		rowData = new Vector<Vector>();
		
		
		//칼럼이름이 있는 colNAmes벡터와 실제데이터가 있는 rowData벡터를 갖고 엑셀과 같은 화면의 테이블을 생성
		table = new JTable(rowData,colNames);
		
		//테이블의 자료가 너무 많아서 한 화면에 보이지 않을 때 자동으로 스크롤을 만들어 주는 스크롤팬을 생성
		JScrollPane jsp = new JScrollPane(table);
		
		
		jtf_no = new JTextField();
		jtf_item = new JTextField();
		jtf_qty = new JTextField();
		jtf_price = new JTextField();
	
		//입력상자들과 무엇을 입력해야 하는지 설명하는 라벨들을 담기 위한 패널 생성
		JPanel p =new JPanel();
		p.setLayout(new GridLayout(4,2));
		
		//라벨과 입력상자(텍스트필드)들을 패널에 차례대로 담음
		p.add(new JLabel("상품번호:"));
		p.add(jtf_no);
		p.add(new JLabel("상품이름:"));
		p.add(jtf_item);
		p.add(new JLabel("상품수량:"));
		p.add(jtf_qty);
		p.add(new JLabel("상품단가:"));
		p.add(jtf_price);
		
		//"추가"글씨가 쓰여진 버튼을 만듬
		JButton btn_add = new JButton("추가");
		
		//"목록"글씨가 쓰여진 버튼을 만듬
		JButton btn_list = new JButton("목록");
		
		//"수정"글씨가 쓰여진 버튼을 만듬
		JButton btn_update = new JButton("수정");
		
		//"삭제"글씨다 쓰여진 버튼을 만듬
		JButton btn_delete = new JButton("삭제");
		
		//버튼들을 담을 패널을 생성
		JPanel p2 = new JPanel();
		p2.add(btn_add);
		p2.add(btn_list);
		p2.add(btn_update);
		p2.add(btn_delete);
		
		//입력상자들이 있는 패널과 버튼이 있는 패널을 담기 위한 패널 생성
		JPanel p_center = new JPanel();
		
		p_center.setLayout(new BorderLayout());
		p_center.add(p,BorderLayout.CENTER);
		p_center.add(p2,BorderLayout.SOUTH);
		
		//프레임의 가운데에 입력상자와 버튼을 담고 있는 p_center 패널을 담음
		add(p_center, BorderLayout.CENTER);
		
		
		//테이블을 담고 있는 스크롤팬을 프레임의 아래쪽에 담음
		add(jsp,BorderLayout.SOUTH);
		
		
		
		//프레임의 가로길이,세로길이를 설정하고 화면에 보여주도록 설정
		setSize(800,600);
		setVisible(true);
		
		//창을 닫으면 프로그램도 종료하도록 설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		//"수정"버튼을 누르면
		//수정할 상품의 번호,이름,수량,가격을 텍스트필드로부터 읽어와서 
		//그것을 메소드에게 전달하여 수정하도록 함
		btn_update.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				int no = Integer.parseInt(jtf_no.getText());
				String item = jtf_item.getText();
				int qty = Integer.parseInt(jtf_qty.getText());
				int price = Integer.parseInt(jtf_price.getText());
				
				updateGoods(no, item, qty, price);
			}});
		
		
		//"삭제"버튼을 누르면 
		//텍스트필드의 삭제할 상품번호를 갖고와서 삭제를 위한 메소드 호출
		btn_delete.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int no = Integer.parseInt(jtf_no.getText());
				
				deleteGoods(no);
			}});
		
		
		//"목록"버튼을 누르면 
		//데이터베이스 연결하여 모든 상품목록을 읽어와서 테이블에 출력하는 메소드 호출
		btn_list.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				printGoods();
			}});
		
		
		
		//"추가"버튼을 누르면 사용자가 입력한 상품번호,상품이름,상품수량,상품가격으로
		//데이터베이스 테이블에 자료를 추가
		btn_add.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				int no = Integer.parseInt(jtf_no.getText());
				String item = jtf_item.getText();
				int qty = Integer.parseInt(jtf_qty.getText());
				int price = Integer.parseInt(jtf_price.getText());
				
				insertGoods(no, item, qty, price);
			
			}});
		
		
		
		
		//테이블에 마우스이벤트를 등록하여 선택한 행의 상품의 정보를 각각의 입력상자에 출력
		table.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				int index = table.getSelectedRow();
				
				//rowData의 index번째의 벡터를 꺼내 옴
				Vector vr = rowData.get(index);
				
				//그 벡터의 요소를 차례로 입력상자에 출력
				jtf_no.setText(vr.get(0)+"");
				jtf_item.setText(vr.get(1)+"");
				jtf_qty.setText(vr.get(2)+"");
				jtf_price.setText(vr.get(3)+"");
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}});
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//InsertGoods객체 생성
		new GoodsTestDBPreparedStatement();
	}

}
