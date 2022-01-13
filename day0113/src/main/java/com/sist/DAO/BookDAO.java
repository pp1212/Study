package com.sist.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.sist.db.ConnectionProvider;

public class BookDAO {
	
	
	//������� ���ǻ縦 �Ű������� ���޹޾� �ش絵���� ������ ��ȯ�ϴ� �޼��带 ����
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
			System.out.println("���ܹ߻�:"+e.getMessage());
		}
		return price;
	}
}
