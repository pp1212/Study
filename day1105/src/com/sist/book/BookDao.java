package com.sist.book;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class BookDao {
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:XE";
	String user = "c##sist";
	String pwd = "sist";
	
	public int insertBook(BookVo b) {
		int re = -1;
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "insert into book values(?,?,?,?)";
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, pwd);
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, b.getNo());
			pstmt.setString(2, b.getName());
			pstmt.setString(3, b.getComp());
			pstmt.setInt(4, b.getPrice());
			
			re = pstmt.executeUpdate();
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
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		return re;
	}
	
	public ArrayList<BookVo> listBook(){
		ArrayList<BookVo> list = new ArrayList<BookVo>();
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		String sql = "select * from book order by no";
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, pwd);
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				int no = rs.getInt(1);
				String name = rs.getString(2);
				String comp = rs.getString(3);
				int price = rs.getInt(4);
				
				BookVo b = new BookVo(no, name, comp, price);
				list.add(b);
			}
			
			
		} catch (Exception e) {
			System.out.println("예외발생:"+e.getMessage());
		}finally {
			try {
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
		return list;
	}
	
	public int updateBook(BookVo b) {
		int re = -1;
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "update book set name=?,comp=?,price=? where no=?";
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, pwd);
			pstmt = conn.prepareStatement(sql);			
			pstmt.setString(1, b.getName());	//?의 값을 찾아서 넣기
			pstmt.setString(2, b.getComp());
			pstmt.setInt(3, b.getPrice());
			
			re = pstmt.executeUpdate();
		} catch (Exception e) {
			System.out.println("예외발생:"+e.getMessage());
		}finally {
			try {
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
		return re;
	}
	
	public int deleteBook(int no) {
		int re = -1;
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "delete book where no=?";
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, pwd);
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, no);
			
			re = pstmt.executeUpdate();
		} catch (Exception e) {
			System.out.println("예외발생:"+e.getMessage());
		}finally {
			try {
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
		return re;
	}
}
