package com.sist.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.sist.db.ConnectionProvider;

public class BookDAO {
	
	
	//도서명과 출판사를 매개변수로 전달받아 해당도서의 가격을 반환하는 메서드를 정의
	public int getPrice(String bookname,String publisher) {
		int price = 0;
		String sql = "select price from book where bookname=? and publisher=?";
		try {
			Connection conn = ConnectionProvider.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, bookname);
			pstmt.setString(2, publisher);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				price = rs.getInt(1);
			}
			ConnectionProvider.close(conn, pstmt, rs);
		}catch (Exception e) {
			System.out.println("예외발생:"+e.getMessage());
		}
		return price;
	}
}
