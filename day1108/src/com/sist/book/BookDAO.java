package com.sist.book;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class BookDAO {
	String sql = "select * from book where publisher = ? order by price desc";
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:XE";
	String userName = "c##madang";
	String passWord = "madang";

	//출판사명을 매개변수로 전달받아 해당 출판사의 모든 도서목록을 검색하여 ArrayList로 반환하는 메소드
	public ArrayList<BookVO> searchBook(String publisher){
		ArrayList<BookVO> list = new ArrayList<BookVO>();
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, userName, passWord);
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, publisher);
			rs = pstmt.executeQuery();
			int bookid = 0;
			String bookname = "";
			int price = 0;
			while(rs.next()) {
				bookid = rs.getInt(1);
				bookname = rs.getString(2);
				publisher = rs.getString(3);
				price = rs.getInt(4);
				BookVO b = new BookVO(bookid, bookname, publisher, price);
				list.add(b);
			}
			
		} catch (Exception e) {
			System.out.println("예외발생"+e.getMessage());
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
