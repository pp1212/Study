package com.sist.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.sist.db.ConnectionProvider;
import com.sist.vo.BookVO;

//Ajax통신으로 새로운 도서를 등록하는 서블릿과 html을 각각 작성
//사용자의 입력값을 받기 위해서는 serializeArray()를 이용
public class BookDAO {
	
	public int insert(BookVO b) {
		int re = -1;
		try {
			Connection conn = ConnectionProvider.getConnection();
			String sql = "insert into book values(?,?,?,?)";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, b.getBookid());
			pstmt.setString(2, b.getBookname());
			pstmt.setString(3, b.getPublisher());
			pstmt.setInt(4, b.getPrice());
			re = pstmt.executeUpdate();
			ConnectionProvider.close(conn, pstmt);
		} catch (Exception e) {
			System.out.println("예외발생:"+e.getMessage());
		}
		return re;
	}
}
