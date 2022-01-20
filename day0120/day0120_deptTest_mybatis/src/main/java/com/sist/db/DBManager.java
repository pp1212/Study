package com.sist.db;

import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.sist.vo.DeptVO;
import com.sist.vo.EmpVO;

public class DBManager {
	
	//mybatis 설정 파일에 접근하기 위한 SqlSessionFactory 변수를 선언
	//이 변수에 객체 없이도 접근할 수 있도록 static 변수로 만듬
	private static SqlSessionFactory sqlMapper;
	
	//프로그램 실행됨과 동시에 자동으로 실행하여
	//mybatis 설정 파일을 읽어 들이기 위하여 static 블럭에 코딩
	static {
		//서버가 가동이 되면서 자동으로 동작
		try {	//파일을 읽어들여야 하니 예외처리
			
			//mybatis 설정 파일을 stream으로 읽어 들임
			Reader reader = Resources.getResourceAsReader("com/sist/db/sqlMapConfig.xml");
			
			//mybatis 설정파일의 stream을 통해 
			//mybatis를 통해 sql을 사용할 수 있는 SqlSessionFactory 객체를 생성
			sqlMapper = new SqlSessionFactoryBuilder().build(reader);
			
			//stream을 닫아줌
			reader.close();
			
		}catch (Exception e) {
			System.out.println("예외발생:"+e.getMessage());
		}
	}
	
	
	//mybatis 설정파일의 특정 sql(dept라는 네임스테이스의 selectAll이라는 id를 갖는)을 요청하는 메소드를 정의(객체 옶이 사용)
	public static List<DeptVO> listAll(){
		
		//mybatis 설정파일에 있는 sql을 사용하기 위하여
		//SqlSessionFactory를 통하여 SqlSession 객체를 얻어옴
		SqlSession session = sqlMapper.openSession();
		
		//SqlSession을 통해 sql을 실행
		//SqlSession에는 crud를 위한 
		//insert,update,delete,select 메소드들이 있음
		//지금은 selectList를 이용함
		//이때 매개변수로 mybatis 설정파일에 있는 네임스페이스와 id를 전달해줌
		//										↓네임스페이스,↓id
		List<DeptVO> list = session.selectList("dept.selectAll");
		
		//session을 사용한 후에는 session을 닫아줌
		session.close();
		return list;
	}
	
	public static DeptVO getDept(int dno) {
		SqlSession session = sqlMapper.openSession();
		DeptVO d = session.selectOne("dept.selectDept",dno);
		session.close();
		return d;
	}
	
	public static int insert(DeptVO d) {
		int re = -1;
		SqlSession session = sqlMapper.openSession();
		re = session.insert("dept.insert", d);
		//데이터베이스에 변경이 있는 sql(insert,update,delete)을 실행할 때는 반드시
		//session.commit()이거나 rollback()메소드를 호출해야 함
		if(re == 1) {
			session.commit();
		}
		session.close();
		return re;
	}
	
	public static int updateDept(DeptVO d) {
		int re = -1;
		SqlSession session = sqlMapper.openSession(true);	//자동으로 commit 되도록
		re = session.update("dept.update", d);
		//session.commit();
		session.close();
		return re;
	}
	
	public static int deleteDept(int dno) {
		int re = -1;
		SqlSession session = sqlMapper.openSession(true);
		re = session.delete("dept.delete", dno);	//dept에 delete sql 동작하고 dno를 전달해줌
		session.close();
		return re;
	}
	
	public static List<EmpVO> listEmp(){
		SqlSession session = sqlMapper.openSession();
		List<EmpVO> list = session.selectList("emp.selectAll");	//목록을 출력해야해서
		session.close();
		return list;
	}
}
