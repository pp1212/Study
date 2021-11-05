package com.sist.member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class MemberDao {
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:XE";
	String user = "c##sist";
	String pwd = "sist";
	
	
	

	//추가할 회원정보를 MemberVo로 매개변수로 전달받아
	//테이블 member에 insert를 수행하고
	//그 결과를 정수로 반환하는 메소드 정의
	public int insertMember(MemberVo m) {
		int re = -1;
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "insert into member values(?,?,?,?,?) ";
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url,user,pwd);
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, m.getNo());
			pstmt.setString(2, m.getName());
			pstmt.setString(3, m.getAddr());
			pstmt.setInt(4, m.getAge());
			pstmt.setString(5, m.getPhone());
			
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
	
	
	//수정할 회원의 정보를 MemberVo로 매개변수로 전달받아
	//회원의 정보를 데이터베이스 수정하고 그 결과를 int로 반환하는 메소드 정의
	public int updateMember(MemberVo m) {
		int re = -1;
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "update member set name=?,addr=?,age=?,phone=? where no=?";
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, pwd);
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, m.getName());
			pstmt.setString(2, m.getAddr());
			pstmt.setInt(3, m.getAge());
			pstmt.setString(4, m.getPhone());
			pstmt.setInt(5, m.getNo());
			
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
	
	
	//삭제할 회원의 번호를 정수로 매개변수로 전달받아
	//해당회원의 정보를 데이터베이스에서 삭제한 후 결과를 정수로 반환하는 메소드 정의
	public int deleteMember(int no) {
		int re = -1;
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "delete member where no=?";
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
	
	
	//모든 회원목록을 조회하여 한명 한명의 회원을 MemberVo로 만들어
	//이것을 모두 ArrayList에 담아 반환하는 메소드 정의
	public ArrayList<MemberVo> listMember(){
		ArrayList<MemberVo> list = new ArrayList<MemberVo>();
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		String sql = "select * from member order by no";
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, pwd);
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				int no = rs.getInt(1);
				String name = rs.getString(2);
				String addr = rs.getString(3);
				int age = rs.getInt(4);
				String phone = rs.getString(5);
				
				MemberVo m = new MemberVo(no, name, addr, age, phone);
				list.add(m);
				//list.add(new MemberVo(no, name, addr, age, phone));
			}
		} catch (Exception e) {
			System.out.println("예외발생:"+e.getMessage());
		}finally {
			try {
				if(rs != null) {
					rs.close();
				}
				if(conn != null) {
					conn.close();
				}
				if(stmt != null) {
					stmt.close();
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		return list;
	}
	
}
