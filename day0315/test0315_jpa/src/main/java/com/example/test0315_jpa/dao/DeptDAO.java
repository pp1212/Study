package com.example.test0315_jpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.test0315_jpa.vo.DeptVO;

@Repository
public interface DeptDAO extends JpaRepository<DeptVO, Integer> {

}

//이렇게만 해두면
//기본적인 CRUD를 위한 메소드를 자동으로 만들어 줌

//insert를 위한 메소드 : save 메소드
