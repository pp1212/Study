package com.sist.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.sist.vo.OrderBookCustomerVO;


public class OrdersBookCustomerDAO {

	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:XE";
	String userName = "c##madang";
	String password = "madang";
			
	
	
	public int getTotalSalePrice(String name) {
		int total = 0;
		String sql = "select sum(saleprice) from customer c,orders o where c.custid = o.custid and name=?";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, userName, password);
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			rs = pstmt.executeQuery();
			//�� ����� 1���� ���� -> ���ֹ��ݾ� : 15000 ó�� => while�� �� ���Ƶ� ��
			//�ٵ� �� ���ü��� �����ϱ� if�� ����� ��
			if(rs.next()) {
				total = rs.getInt(1);
			}
		} catch (Exception e) {
			System.out.println("���ܹ߻�:"+e.getMessage());
		}finally {
			try {
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
		
		return total;
	}

	
	
	//���̸��� �Ű������� ���޹޾� �� ���� �ֹ��� ������ OrderBookCustomerVO�� �����Ͽ�
	//ArrayList�� ��ȯ�ϴ� �޼ҵ� ����
	public ArrayList<OrderBookCustomerVO> listOrders(String name){
		ArrayList<OrderBookCustomerVO> list = new ArrayList<OrderBookCustomerVO>();
		String sql = "select c.custid,name,bookname,publisher,price,saleprice,orderdate from customer c,book b,orders o where c.custid = o.custid and b.bookid = o.bookid and name=? order by price desc";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, userName, password);
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				list.add(new OrderBookCustomerVO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getInt(6), rs.getDate(7)));
			}
		} catch (Exception e) {
			System.out.println("���ܹ߻�"+e.getMessage());
		}finally {
			try {
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
}
