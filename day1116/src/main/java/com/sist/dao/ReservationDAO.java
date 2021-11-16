package com.sist.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.sist.vo.ReservationVO;

public class ReservationDAO {
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:XE";
	String user = "c##sist";
	String password = "sist";
	
	public ArrayList<ReservationVO> listReservation(String name){
		ArrayList<ReservationVO> list = new ArrayList<ReservationVO>();
		String sql = "select �����̸�,�󿵰�.�󿵰���ȣ,��ȭ����,��¥,�¼���ȣ,���� "
				+ "from ����,�󿵰�,����,�� "
				+ "where ����.�����ȣ = �󿵰�.�����ȣ and "
				+ "�󿵰�.�����ȣ = ����.�����ȣ and "
				+ "�󿵰�.�󿵰���ȣ = ����.�󿵰���ȣ and "
				+ "��.����ȣ = ����.����ȣ and "
				+ "�̸� = ?";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				list.add(new ReservationVO(rs.getString(1), rs.getInt(2), rs.getString(3), rs.getDate(4), rs.getInt(5), rs.getInt(6)));
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
		return list;
	}
}
