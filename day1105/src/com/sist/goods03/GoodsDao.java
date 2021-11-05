package com.sist.goods03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Vector;

public class GoodsDao {
	
	//�����ͺ��̽��� �����Ͽ� ��� ��ǰ����� �о�ͼ� ��ȯ�ϴ� �޼ҵ� ����
	//select * from goods
	//��ǰ ���ڵ� �ϳ��ϳ��� GoodsVo�� �����ϰ�
	//�̰͵��� ��� ArrayList�� ��Ƽ� ��ȯ�Ϸ��� ��
	public ArrayList<GoodsVo> listGoods(){
		ArrayList<GoodsVo> list = new ArrayList<GoodsVo>();
		
			//�����ͺ��̽��� �����Ͽ� ������ ��ɾ�
			String sql = "select * from goods order by no";
			
			//�����ͺ��̽� ����� �ʿ��� �������� ����
			Connection conn = null;		//DB������ ������ ���� ����
			//Statement stmt = null;		//�����ͺ��̽� ����� �����ϱ� ���� ����
			PreparedStatement pstmt = null;
			ResultSet rs = null;		//�о�� �����͸� ��� ���� ����
			
			try {				
				Class.forName("oracle.jdbc.driver.OracleDriver");				
				conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "c##sist", "sist");
				pstmt = conn.prepareStatement(sql);				
				rs = pstmt.executeQuery();				
				while(rs.next()) {					
					int no = rs.getInt(1);
					String item = rs.getString(2);
					int qty = rs.getInt(3);
					int price = rs.getInt(4);
					
					//���ڵ��� ������ GoodsVo ��ü�� ����� list�� ���
					//�����ӿ��� "���"���߸� ������ �� �� �޼ҵ带 ȣ���ؼ� ����
					list.add(new GoodsVo(no, item, qty, price));
					
				}
				
			} catch (Exception e) {
				System.out.println("���ܹ߻�:"+e.getMessage());
			}finally {
				try {
					
					//����ߴ� �ڿ����� �ݾ���
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
		
		return list;
	}
	
	
	
	public int updateGoods(GoodsVo g) {
		int re = -1;
		
		//String sql = "update goods set item='"+item+"',qty="+qty+",price="+price+" where no="+no;
		String sql = "update goods set item=?,qty=?,price=? where no=?";
		Connection conn = null;
		//Statement stmt = null;
		//sql��ɾ� �ȿ� ?�� �ִ� ��� Statement�� �ļ�Ŭ������ PreparedStatement�� �����
		PreparedStatement pstmt = null;
		try {
			//1.jdbc����̹��� �޸𸮷� �ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//2.DB ������ ����
			String url = "jdbc:oracle:thin:@localhost:1521:XE";
			String user = "c##sist";
			String pwd = "sist";
			conn = DriverManager.getConnection(url, user, pwd);
			
			//3.Statement ��ü�� ����
			//stmt = conn.createStatement();
			//PreparedStatement �����ÿ� ?�� �ִ� �̸� ����� ���� ��ɾ �Ű������� �����ؾ� ��
			pstmt = conn.prepareStatement(sql);
			
			//PreparedStatement��ü�� �������� ���� ?�� ���ʴ�� ���� �����ؾ� ��
			pstmt.setString(1, g.getItem());
			pstmt.setInt(2, g.getQty());
			pstmt.setInt(3, g.getPrice());
			pstmt.setInt(4, g.getNo());
			
			//4.�����ͺ��̽� ����� ����
			//PreparedStatement ��ü �����ÿ� �̹� sql�� ���޵Ǿ���
			//�׸��� ������ ������ ?���� ����� �����̱� ������
			//executeUpdate �� ���� sql�� �������� �ʾƾ� ��
			//���� ���⼭ �Ű������� sql�� �����ϰ� �Ǹ� ?���� �������� ���� ���·� ����� �����ϰ� ��
			re = pstmt.executeUpdate();
			
			
			
			
		} catch (Exception e) {
			System.out.println("���ܹ߻�:"+e.getMessage());
		}finally {
			try {
				if(pstmt != null) {
					pstmt.close();
				}
				if(conn != null) {
					conn.close();
				}
			}catch (Exception e) {
				// TODO: handle exception
			}
		}
		return re;
	}
	
	
	
	public int deleteGoods(int no) {
		int re = -1; 
		
		//String sql = "delete goods where no=" + no;
		String sql = "delete goods where no=?";
		
		Connection conn = null;
		//Statement stmt = null;
		PreparedStatement pstmt = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "c##sist", "sist");
			//stmt = conn.createStatement();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, no);
			
			re = pstmt.executeUpdate();
			
			
		} catch (Exception e) {
			System.out.println("���ܹ߻�:"+e.getMessage());
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
		return re;
	}
	
	
	//�߰��� ��ǰ��ȣ,��ǰ��,����,�ܰ��� �Ű������� ���޹޾� �����ͺ��̽��� �߰��ϴ� �޼ҵ带 ����
	public int insertGoods(GoodsVo g) {
		int re = -1;	//�ƹ� ����� ���� ��
		
		//String sql = "insert into goods values("+no+",'"+item+"',"+qty+","+price+")";
		String sql = "insert into goods values(?,?,?,?)";
		
		//finally������ ������ �� �ֵ��� Connection�� Statement
		//������ try �ٱ��� ����
		Connection conn = null;
		//Statement stmt = null;
		PreparedStatement pstmt = null;
		
		try {
			//1.jdbc����̹��� �޸𸮷� �ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//2.DB������ ����
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "c##sist", "sist");
			
			//3.�����ͺ��̽� ����� ������ �� �ִ� Statement ��ü�� ����
			//stmt = conn.createStatement();
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, g.getNo());
			pstmt.setString(2, g.getItem());
			pstmt.setInt(3, g.getQty());
			pstmt.setInt(4, g.getPrice());
			
			//4.�����ͺ��̽� ����� ����
			re = pstmt.executeUpdate();
			
			
			
			
			
		} catch (Exception ex) {
			System.out.println("���ܹ߻�:"+ex.getMessage());
		}finally {
			
			try {
				//5.����ߴ� �ڿ��� �ݾ���
				
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
		return re;
	}
	
}	
