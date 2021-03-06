package com.sist.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.sist.vo.OrdersVO;

public class OrdersDAO {
	
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:XE";
	String userName = "c##madang";
	String passWord = "madang";
	
	//고객번호를 매개변수로 전달받아 그 고객의 모든 주문내역을 ArrayList로 반환하는 메소드 정의
	public ArrayList<OrdersVO> searchOrders(int custid){
		ArrayList<OrdersVO> list = new ArrayList<OrdersVO>();
		
		String sql = "select * from orders where custid=?";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, userName, passWord);
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, custid);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				list.add(new OrdersVO(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getInt(4), rs.getDate(5)));
			}
			
		} catch (Exception e) {
			System.out.println("예외발생:"+e.getMessage());
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
