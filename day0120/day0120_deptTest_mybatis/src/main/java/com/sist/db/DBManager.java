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
	
	//mybatis ���� ���Ͽ� �����ϱ� ���� SqlSessionFactory ������ ����
	//�� ������ ��ü ���̵� ������ �� �ֵ��� static ������ ����
	private static SqlSessionFactory sqlMapper;
	
	//���α׷� ����ʰ� ���ÿ� �ڵ����� �����Ͽ�
	//mybatis ���� ������ �о� ���̱� ���Ͽ� static ���� �ڵ�
	static {
		//������ ������ �Ǹ鼭 �ڵ����� ����
		try {	//������ �о�鿩�� �ϴ� ����ó��
			
			//mybatis ���� ������ stream���� �о� ����
			Reader reader = Resources.getResourceAsReader("com/sist/db/sqlMapConfig.xml");
			
			//mybatis ���������� stream�� ���� 
			//mybatis�� ���� sql�� ����� �� �ִ� SqlSessionFactory ��ü�� ����
			sqlMapper = new SqlSessionFactoryBuilder().build(reader);
			
			//stream�� �ݾ���
			reader.close();
			
		}catch (Exception e) {
			System.out.println("���ܹ߻�:"+e.getMessage());
		}
	}
	
	
	//mybatis ���������� Ư�� sql(dept��� ���ӽ����̽��� selectAll�̶�� id�� ����)�� ��û�ϴ� �޼ҵ带 ����(��ü ���� ���)
	public static List<DeptVO> listAll(){
		
		//mybatis �������Ͽ� �ִ� sql�� ����ϱ� ���Ͽ�
		//SqlSessionFactory�� ���Ͽ� SqlSession ��ü�� ����
		SqlSession session = sqlMapper.openSession();
		
		//SqlSession�� ���� sql�� ����
		//SqlSession���� crud�� ���� 
		//insert,update,delete,select �޼ҵ���� ����
		//������ selectList�� �̿���
		//�̶� �Ű������� mybatis �������Ͽ� �ִ� ���ӽ����̽��� id�� ��������
		//										����ӽ����̽�,��id
		List<DeptVO> list = session.selectList("dept.selectAll");
		
		//session�� ����� �Ŀ��� session�� �ݾ���
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
		//�����ͺ��̽��� ������ �ִ� sql(insert,update,delete)�� ������ ���� �ݵ��
		//session.commit()�̰ų� rollback()�޼ҵ带 ȣ���ؾ� ��
		if(re == 1) {
			session.commit();
		}
		session.close();
		return re;
	}
	
	public static int updateDept(DeptVO d) {
		int re = -1;
		SqlSession session = sqlMapper.openSession(true);	//�ڵ����� commit �ǵ���
		re = session.update("dept.update", d);
		//session.commit();
		session.close();
		return re;
	}
	
	public static int deleteDept(int dno) {
		int re = -1;
		SqlSession session = sqlMapper.openSession(true);
		re = session.delete("dept.delete", dno);	//dept�� delete sql �����ϰ� dno�� ��������
		session.close();
		return re;
	}
	
	public static List<EmpVO> listEmp(){
		SqlSession session = sqlMapper.openSession();
		List<EmpVO> list = session.selectList("emp.selectAll");	//����� ����ؾ��ؼ�
		session.close();
		return list;
	}
}
