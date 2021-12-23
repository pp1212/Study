package com.sist.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.sist.db.ConnectionProvider;
import com.sist.vo.BoardVO;

import oracle.jdbc.proxy.annotation.Pre;

public class BoardDAO {
	public static int pageSIZE = 10;		//한 화면에 보여줄 레코드의 수
	public static int totalRecord;			//전체 레코드의 수
	public static int totalPage;			//전체 페이지의 수
	
	//(검색어가 온다면 검색어를 기준으로)전체 레코드의 수를 반환하는 메소드 정의
	public int getTotalRecord(String searchColum,String keyword) {
		int n = 0;
		String sql = "select count(*) from board ";
		if(keyword != null) {
			sql += " where " + searchColum + " like '%"+keyword+"%'";
		}
		
		try {
			Connection conn = ConnectionProvider.getConnection();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			if(rs.next()) {
				n = rs.getInt(1);
			}
			ConnectionProvider.close(conn, stmt, rs);
		} catch (Exception e) {
			System.out.println("예외발생:"+e.getMessage());
		}
		return n;
	}
	
	
	//조회수 증가 메소드
	public void updateHit(int no) {
		String sql = "update board set hit=hit+1 where no=?";
		try {
			Connection conn = ConnectionProvider.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, no);
			pstmt.executeUpdate();	//re로 반환 안 함
			ConnectionProvider.close(conn, pstmt);
		}catch (Exception e) {
			System.out.println("예외발생:"+e.getMessage());
		}
	}
	
	//자동으로 no가 매겨지도록 하는 메소드
	public int getNextNo() {
		int no = 0;
		String sql = "select nvl(max(no),0)+1 from board";
		try {
			Connection conn = ConnectionProvider.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				no = rs.getInt(1);
			}
			ConnectionProvider.close(conn, pstmt, rs);
		} catch (Exception e) {
			System.out.println("예외발생:"+e.getMessage());
		}
		return no;
	}
	
	
	public int insertBoard(BoardVO b) {
		int re = -1;
		String sql = "insert into board values(?,?,?,?,?,sysdate,0,?,?,?,?,?)";
//		int no = getNextNo();			//답글 작성할 때 번호 붙이는 것 때문에 여기서 자동으로 번호 매겨주는 것 못 씀
		try {
			Connection conn = ConnectionProvider.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, b.getNo());
			pstmt.setString(2, b.getTitle());
			pstmt.setString(3, b.getWriter());
			pstmt.setString(4, b.getPwd());
			pstmt.setString(5, b.getContent());
			pstmt.setString(6, b.getFname());
			pstmt.setLong(7, b.getFsize());
			
			pstmt.setInt(8, b.getB_ref());
			pstmt.setInt(9, b.getB_level());
			pstmt.setInt(10, b.getB_step());
			
			re = pstmt.executeUpdate();
			ConnectionProvider.close(conn, pstmt);
			
		} catch (Exception e) {
			System.out.println("예외발생:"+e.getMessage());
		}
		return re;
	}
	
	
	public int updateBoard(BoardVO b) {
		int re = -1;
		String sql = "update board set title=?,content=?,fname=?,fsize=? where no=? and pwd=?";
		try {
			Connection conn = ConnectionProvider.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, b.getTitle());
			pstmt.setString(2, b.getContent());
			pstmt.setString(3, b.getFname());
			pstmt.setLong(4, b.getFsize());
			pstmt.setInt(5, b.getNo());
			pstmt.setString(6, b.getPwd());
			re = pstmt.executeUpdate();
			ConnectionProvider.close(conn, pstmt);
			
		} catch (Exception e) {
			System.out.println("예외발생:"+e.getMessage());
		}
		return re;
	}
	
	
	public int deleteBoard(int no,String pwd) {
		int re = -1;
		
		try {
			Connection conn = ConnectionProvider.getConnection();
			String sql = "delete board where no=? and pwd=?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, no);
			pstmt.setString(2, pwd);
			re = pstmt.executeUpdate();
			ConnectionProvider.close(conn, pstmt);
			
		} catch (Exception e) {
			System.out.println("예외발생:"+e.getMessage());
		}
		return re;
	}
	
	
	//여기서 목록을 보여주기 때문에 페이징처리 여기서 하면 됨 
	public ArrayList<BoardVO> listBoard(int pageNUM, String orderColum, String searchColum, String keyword){
		totalRecord = getTotalRecord(searchColum,keyword);			//전제 레코드 수 반환 메소드
		totalPage = (int)Math.ceil(totalRecord/(double)pageSIZE);	//double로 반환해서 int로 바꿔야 전체 페이지 수가 4->5가 됨
		System.out.println("전체레코드 수 : "+totalRecord);
		System.out.println("전체페이지 수 : "+totalPage);
		
		int start = (pageNUM-1)*BoardDAO.pageSIZE + 1;
		int end = start + BoardDAO.pageSIZE - 1;
		
		System.out.println("start:"+start);
		System.out.println("end:"+end);
		
		ArrayList<BoardVO> list = new ArrayList<BoardVO>();
		
		try {
			Connection conn = ConnectionProvider.getConnection();
			
			String sql2 = "select * from board";
			//검색어가 왔냐
			if(keyword != null) {
				sql2 += " where " + searchColum + " like '%"+keyword+"%'";
			}
			
			String sql = "select no,title,writer,pwd,content,regdate,hit,fname,fsize,b_ref,b_level,b_step from ( "
					+ "	select rownum n,no,title,writer,pwd,content,regdate,hit,fname,fsize,b_ref,b_level,b_step "
					+ "	from ("+sql2+" order by b_ref desc, b_step)) "
					+ "	where n between ? and ?";
			
			//orderColum이 null이아니면 이 sql로 (컬럼이름은 ? 못함, 값만 ? 할 수 있음 -> ""이걸 끊고 변수 적고 +로 연결)
			if(orderColum != null) {
				sql = "select no,title,writer,pwd,content,regdate,hit,fname,fsize,b_ref,b_level,b_step from ( "
						+ "	select rownum n,no,title,writer,pwd,content,regdate,hit,fname,fsize,b_ref,b_level,b_step "
						+ "	from ("+sql2+" order by "+orderColum+")) "
						+ "	where n between ? and ?";
			}
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, start);
			pstmt.setInt(2, end);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				list.add(new BoardVO(
						rs.getInt(1), 
						rs.getString(2), 
						rs.getString(3), 
						rs.getString(4), 
						rs.getString(5), 
						rs.getDate(6), 
						rs.getInt(7), 
						rs.getString(8), 
						rs.getLong(9),
						rs.getInt(10),
						rs.getInt(11),
						rs.getInt(12)));
			}
			ConnectionProvider.close(conn, pstmt, rs);
			
		} catch (Exception e) {
			System.out.println("예외발생:"+e.getMessage());
		}
		return list;
	}
	
	
	public BoardVO getBoard(int no) {
		BoardVO b = null;
		
		try {
			Connection conn = ConnectionProvider.getConnection();
			String sql = "select * from board where no=?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, no);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				b = new BoardVO(
						rs.getInt(1), 			//글번호
						rs.getString(2), 		//글제목
						rs.getString(3), 		//작성자
						rs.getString(4), 		//글암호
						rs.getString(5), 		//글내용
						rs.getDate(6), 			//등록일
						rs.getInt(7), 			//조회수
						rs.getString(8), 		//파일명
						rs.getLong(9),			//파일크기
						rs.getInt(10),			//b_ref
						rs.getInt(11),			//b_level
						rs.getInt(12));			//b_step
			}
			ConnectionProvider.close(conn, pstmt, rs);
			
		} catch (Exception e) {
			System.out.println("예외발생:"+e.getMessage());
		}
		return b;
	}


	public void updateStep(int b_ref, int b_step) {
		// TODO Auto-generated method stub
		String sql = "update board set b_step = b_step + 1 where b_ref=? and b_step > ?";
		try {
			Connection conn = ConnectionProvider.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, b_ref);
			pstmt.setInt(2, b_step);
			pstmt.executeUpdate();
			ConnectionProvider.close(conn, pstmt);
		} catch (Exception e) {
			System.out.println("예외발생:"+e.getMessage());
		}
	}
}
