package com.example.test0315_jpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.test0315_jpa.dao.DeptDAO;
import com.example.test0315_jpa.vo.DeptVO;

import lombok.Setter;

@Service
@Setter
public class DeptService {
	
	@Autowired
	private DeptDAO dao;
	
	
	//select * from dept
	public List<DeptVO> findAll(){
		return dao.findAll();
	}
	
	//update dept set dname=?,dloc=? where dno=?			: 만약에 db에 dno가 있으면 
	//insert into dept(dno,dname,dloc) values(?,?,?)		: 만약에 db에 dno가 없으면
	public void save(DeptVO d) {
		dao.save(d);		//insert를 위해서 save 메소드 호출
	}
	
	//수정하려면 원래 있는 부서 목록을 들고 와야 함
	//select * from dept where dno=?
	public DeptVO getDept(int dno) {
		return dao.getOne(dno);
	}
	
	//delete dept where dno=?
	public void delete(int dno) {
		dao.deleteById(dno);
	}
}
