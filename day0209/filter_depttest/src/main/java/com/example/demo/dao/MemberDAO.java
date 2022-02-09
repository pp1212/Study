package com.example.demo.dao;

import org.springframework.stereotype.Repository;

import com.example.demo.db.DBManager;
import com.example.demo.vo.MemberVO;

@Repository
public class MemberDAO {
	
	//id가 존재하지 않는 경우	: -1
	//암호가 일치하지 않는 경우	: 0
	//암호가 일치하는 경우		: 1
	public int isMember(String id, String usrPwd) {
		
		String dbPwd = DBManager.isMember(id);
		int re = -1;
		if(dbPwd == null) {	//존재하지 않는 경우
			re = -1;
		}else {
			if(usrPwd.equals(dbPwd)) {	//존재하는데
				re = 1;					//일치하는 경우
			}else {
				re = 0;					//일치하지 않는 경우
			}
		}
		return re;
	}
}
