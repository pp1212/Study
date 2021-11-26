package com.sist.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.sist.db.ConnectionProvider;
import com.sist.vo.PossibleReservationRoomVO;


public class ReservationDAO {
	
	//예약가능한 룸 목록을 반환하는 메소드 정의
	public ArrayList<PossibleReservationRoomVO> listPossibleReservationRoom(){
		ArrayList<PossibleReservationRoomVO> list = new ArrayList<PossibleReservationRoomVO>();
		String sql = "select room_no,fee,room_type_name,room_state_name "
				+ "from room r,room_type t,room_state s "
				+ "where r.room_type_code = t.room_type_code and "
				+ "r.room_state_code = s.room_state_code and "
				+ "r.room_state_code=1";
		try {
			Connection conn = ConnectionProvider.getConnection();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				list.add(new PossibleReservationRoomVO(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4)));		
			}
			
			ConnectionProvider.close(conn, stmt, rs);
		} catch (Exception e) {
			System.out.println("예외발생:"+e.getMessage());
		}
		return list;
	}
}
