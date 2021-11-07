package com.sist.homework;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.sist.book.BookVo;

public class DeptDao {

	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:XE";
	String user = "C##sist";
	String pwd = "sist";
	
	public int insertDept(DeptVo d) {
		int re = -1;
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "insert into dept values(?,?,?)";
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, pwd);
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, d.getNo());
			pstmt.setString(2, d.getName());
			pstmt.setString(3, d.getAddr());
			
			re = pstmt.executeUpdate();
		}catch (Exception e) {
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
	public ArrayList<DeptVo> listDept(){
		ArrayList<DeptVo> list = new ArrayList<DeptVo>();
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		String sql = "select * from dept order by no";
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, pwd);
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				int no = rs.getInt(1);
				String name = rs.getString(2);
				String addr = rs.getString(3);
				
				DeptVo d = new DeptVo(no, name, addr);
				list.add(d);
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
	public int updateDept(DeptVo d) {
		int re = -1;
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "update dept set name=?,addr=? where no=?";
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, pwd);
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, d.getName());
			pstmt.setString(2, d.getAddr());
			pstmt.setInt(3, d.getNo());
			
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
			}catch (Exception e) {
				// TODO: handle exception
			}
		}
		return re;
	}
	public int deleteDept(int no) {
		int re = -1;
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "delete dept where no=?";
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, pwd);
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, no);
			
			re = pstmt.executeUpdate();
		}catch (Exception e) {
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
