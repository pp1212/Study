package com.example.demo.dao;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.db.DBManager;
import com.example.demo.vo.BoardVO;

@Repository
public class BoardDAO {
	
	public static int pageSIZE = 10;	//한 화면에 보여줄 레코드의 수
	public static int totalRecord;		//전체 레코드 수
	public static int totalPage;		//전체 페이지 수
	
	public int getNextNO() {
		return DBManager.getNextNo();
	}
	
	public List<BoardVO> findAll(HashMap map){
		
		//전체 레코드 수를 계산할 때에도
		//검색어가 필요함
		totalRecord = DBManager.getTotalRecord(map);
		
		
		totalPage = (int)Math.ceil(totalRecord/(double)pageSIZE);
		return DBManager.findAll(map);
	}
	
	public int insert(BoardVO b) {
		return DBManager.insert(b);
	}
	
	public BoardVO findByNo(int no) {
		return DBManager.findByNo(no);
	}
	
	public int update(BoardVO b) {
		return DBManager.update(b);
	}

	public int delete(HashMap map) {
		// TODO Auto-generated method stub
		return DBManager.delete(map);
	}
	
	public void updateHit(int no) {
		DBManager.updateHit(no);
	}
}

