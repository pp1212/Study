package com.sist.exam;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class BookList {
	Connection conn;
	public BookList() {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String userid = "c##madang";
		String pwd = "madang";
		
		try {
			Class.forName(driver);
			System.out.println("드라이버 로드 성공");
			conn = DriverManager.getConnection(url, userid, pwd);
			System.out.println("데이터베이스 연결 성공");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void sqlRun() {
		String query = "select * from book";
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			System.out.println("BOOK NO\t BOOK NAME \t\t PUBLISHER \t PRICE");
			while(rs.next()) {
				System.out.print(rs.getInt(1)+"\t");		//한 줄로 출력하기 위하여
				System.out.print(rs.getString(2)+"\t\t");
				System.out.print(rs.getString(3)+"\t");
				System.out.println(rs.getInt(4));
			}
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
			e.printStackTrace();
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//메소드 호출하려면 객체 생성해야 함
		BookList so = new BookList();
		so.sqlRun();
	}

}
