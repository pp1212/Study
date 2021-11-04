package com.sist.goods;

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
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;

public class GoodsTestDBMethod extends JFrame {
	
	JTextField jtf_no;		//��ǰ��ȣ�� �Է¹ޱ� ���� �Է»���
	JTextField jtf_item;	//��ǰ���� �Է¹ޱ� ���� �Է»���
	JTextField jtf_qty;		//������ �Է¹ޱ� ���� �Է»���
	JTextField jtf_price;	//������ �Է¹ޱ� ���� �Է»���
	
	JTable table;						//��� ��ǰ����� ������ ���� ������� �����ֱ� ���� ���̺��� ����(JTable�� Vector����)
	Vector colNames;			//���̺��� �÷��̸��� ���� ���͸� ����
	Vector<Vector> rowData;		//���̺��� �����͸� ���� ���͸� ����
	
	//�����ͺ��̽��� �����Ͽ� goods���̺��� ��� ��ǰ�� �о�ͼ�(�˻��Ͽ�,��ȸ�Ͽ�) 
	//���̺� ����ϴ� �޼ҵ� ����
	public void printGoods() {
		
		//���ο� ��ǰ�� ����Ͽ� ����Ͽ� ȣ��� �� ������
		//rowData�� ���� ������ �����
		rowData.clear();
		
		//�����ͺ��̽��� �����Ͽ� ������ ��ɾ�
		String sql = "select * from goods order by no";
		
		//�����ͺ��̽� ����� �ʿ��� �������� ����
		Connection conn = null;		//DB������ ������ ���� ����
		Statement stmt = null;		//�����ͺ��̽� ����� �����ϱ� ���� ����
		ResultSet rs = null;		//�о�� �����͸� ��� ���� ����
		
		try {
			//1.jdbc����̹��� �޸𸮷� �ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//2.DB������ ����
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "c##sist", "sist");
			
			//3.Statement��ü ����
			stmt = conn.createStatement();
			
			//4.�����ͺ��̽� ����� ����
			//		����ϴ� �޼ҵ� �ΰ���
			//			int re = executeUpdate(String sql)	==>�ڷḦ �߰�,����,����
			//			ResultSet rs = executeQuery(String sql)	==>�ڷḦ �о�� ��
			rs = stmt.executeQuery(sql);
			
			//5.��ó���� ��
			//�˻��� �ڷᰡ �ִ¸�ŭ �ݺ� �����Ͽ� �� �྿ �о�ͼ� �װ��� ���ͷ� �����
			//�� ���͸� ���̺��� �ڷḦ ���� rowData�� ����
			//ResultSet�� ������� Ư�� ���ڵ带 ����Ű�� Ŀ���� ����
			//�� Ŀ���� �� �྿ �Ű��ִ� �޼ҵ尡 next()
			//�޼ҵ�� ������ ���ڵ尡 �־ ���������� �Ű����� true�� ��ȯ
			//������ ���ڵ尡 ���̻� ��� �Ű����� ������ false�� ��ȯ
			//�׷��� ���� ResultSet�� ����� ��� �о ó���Ϸ��� ������ ���� while�� �̿�
			while(rs.next()) {
				//���� Ŀ���� �ٶ󺸰� �ִ� ���ڵ��� �Ӽ����� �о���� ���ؼ��� �ڷ����� ����
				//get~~()�� �����
				//�÷��� ���� ���ڿ��̶�� getString()�� �̿�
				//�÷��� ���� �������̶�� getInt()�� �̿�
				//�̶� �Ű������� �÷��� �ε����� �÷��̸��� ���ڿ��� ����
				//���⼭ �ε����� 1���� ����
				int no = rs.getInt(1);
				String item = rs.getString(2);
				int qty = rs.getInt(3);
				int price = rs.getInt(4);
				
				//���͸� �ϳ� ����� �� ���Ϳ� no,item,qty,price�� ��´�
				Vector v = new Vector();
				v.add(no);
				v.add(item);
				v.add(qty);
				v.add(price);
				
				
				//�� ���͸� rowData�� ����				
				rowData.add(v);
				
				//�ٲ� �������� ���̺��� �ٽ� �׸�
				//ó�� ���̺��� ���鶧���� rowData���Ͱ� ����־���
				//���߿� ���̺��� �������� rowData�� �ٲ� �ڷḦ �����ϱ� ���ؼ���
				//updateUI�� ȣ���ؾ� ��
				table.updateUI();
				
			}
			
		} catch (Exception e) {
			System.out.println("���ܹ߻�:"+e.getMessage());
		}finally {
			try {
				
				//����ߴ� �ڿ����� �ݾ���
				if(rs != null) {
					rs.close();
				}
				
				if(stmt != null) {
					stmt.close();
				}
				
				if(conn != null) {
					conn.close();
				}
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	
	
	public void insertGoods(int no,String item,int qty,int price) {
		
		String sql = "insert into goods values("+no+",'"+item+"',"+qty+","+price+")";
		
		//finally������ ������ �� �ֵ��� Connection�� Statement
		//������ try �ٱ��� ����
		Connection conn = null;
		Statement stmt = null;
		
		try {
			//1.jdbc����̹��� �޸𸮷� �ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//2.DB������ ����
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "c##sist", "sist");
			
			//3.�����ͺ��̽� ����� ������ �� �ִ� Statement ��ü�� ����
			stmt = conn.createStatement();
			
			//4.�����ͺ��̽� ����� ����
			int re = stmt.executeUpdate(sql);
			
			if(re == 1) {
				System.out.println("��ǰ��Ͽ� �����Ͽ����ϴ�.");
				jtf_no.setText("");
				jtf_item.setText("");
				jtf_qty.setText("");
				jtf_price.setText("");
				
				//��ǰ����� �����ϸ� ���̺��� ������ �ٽ� �о������ �޼ҵ� ȣ��
				printGoods();
			}else {
				System.out.println("��ǰ��Ͽ� �����Ͽ����ϴ�.");
			}
			
			
			
		} catch (Exception ex) {
			System.out.println("���ܹ߻�:"+ex.getMessage());
		}finally {
			
			try {
				//5.����ߴ� �ڿ��� �ݾ���
				
				if(stmt != null) {
					stmt.close();
				}
				
				if(conn != null) {
					conn.close();
				}
			}catch (Exception ex) {
				// TODO: handle exception
			}
		}
	}
	
	
	public GoodsTestDBMethod() {	
		
		//���̺� �� Į���̸��� ���� ���͸� �����ϰ� �ڷḦ �߰�
		colNames = new Vector();
		colNames.add("��ǰ��ȣ");
		colNames.add("��ǰ�̸�");
		colNames.add("��ǰ����");
		colNames.add("��ǰ�ܰ�");
		
		//���̺� �� ���� �����͵��� ��� ���� ���͸� �����ϰ� �ڷḦ �߰�
		rowData = new Vector<Vector>();
		
		
		//Į���̸��� �ִ� colNAmes���Ϳ� ���������Ͱ� �ִ� rowData���͸� ���� ������ ���� ȭ���� ���̺��� ����
		table = new JTable(rowData,colNames);
		
		//���̺��� �ڷᰡ �ʹ� ���Ƽ� �� ȭ�鿡 ������ ���� �� �ڵ����� ��ũ���� ����� �ִ� ��ũ������ ����
		JScrollPane jsp = new JScrollPane(table);
		
		
		jtf_no = new JTextField();
		jtf_item = new JTextField();
		jtf_qty = new JTextField();
		jtf_price = new JTextField();
	
		//�Է»��ڵ�� ������ �Է��ؾ� �ϴ��� �����ϴ� �󺧵��� ��� ���� �г� ����
		JPanel p =new JPanel();
		p.setLayout(new GridLayout(4,2));
		
		//�󺧰� �Է»���(�ؽ�Ʈ�ʵ�)���� �гο� ���ʴ�� ����
		p.add(new JLabel("��ǰ��ȣ:"));
		p.add(jtf_no);
		p.add(new JLabel("��ǰ�̸�:"));
		p.add(jtf_item);
		p.add(new JLabel("��ǰ����:"));
		p.add(jtf_qty);
		p.add(new JLabel("��ǰ�ܰ�:"));
		p.add(jtf_price);
		
		//"�߰�"�۾��� ������ ��ư�� ����
		JButton btn_add = new JButton("�߰�");
		
		//"���"�۾��� ������ ��ư�� ����
		JButton btn_list = new JButton("���");
		
		//��ư���� ���� �г��� ����
		JPanel p2 = new JPanel();
		p2.add(btn_add);
		p2.add(btn_list);
		
		//�Է»��ڵ��� �ִ� �гΰ� ��ư�� �ִ� �г��� ��� ���� �г� ����
		JPanel p_center = new JPanel();
		
		p_center.setLayout(new BorderLayout());
		p_center.add(p,BorderLayout.CENTER);
		p_center.add(p2,BorderLayout.SOUTH);
		
		//�������� ����� �Է»��ڿ� ��ư�� ��� �ִ� p_center �г��� ����
		add(p_center, BorderLayout.CENTER);
		
		
		//���̺��� ��� �ִ� ��ũ������ �������� �Ʒ��ʿ� ����
		add(jsp,BorderLayout.SOUTH);
		
		
		
		//�������� ���α���,���α��̸� �����ϰ� ȭ�鿡 �����ֵ��� ����
		setSize(800,600);
		setVisible(true);
		
		//â�� ������ ���α׷��� �����ϵ��� ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//"���"��ư�� ������ 
		//�����ͺ��̽� �����Ͽ� ��� ��ǰ����� �о�ͼ� ���̺� ����ϴ� �޼ҵ� ȣ��
		btn_list.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				printGoods();
			}});
		
		
		
		//"�߰�"��ư�� ������ ����ڰ� �Է��� ��ǰ��ȣ,��ǰ�̸�,��ǰ����,��ǰ��������
		//�����ͺ��̽� ���̺� �ڷḦ �߰�
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
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//InsertGoods��ü ����
		new GoodsTestDBMethod();
	}

}
