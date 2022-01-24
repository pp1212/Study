package com.example.demo.db;
     
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.example.demo.vo.CustomerVO;

//mybatis의 설정파일에 있는 sql을 요청하는 클래스
public class DBManager {
	
	//mybatis 설정파일에 있는 sql을 요청하려면 SqlSession이 필요함
	//이 SqlSession을 만들어주는 SqlSessionFactory 변수를 맴버로 선언
	//DBManager 객체 없이도 사용할 수 있도록 static으로 만듬
	private static SqlSessionFactory factory;
	
	//mybatis 설정파일인 sqlMapConfig파일을 읽어들여 SqlSessionFctory 객체를 생성함
	//사용자의 어떤 메소드 요청없이도 서버가 가동되면서 자동으로 동작하도록 하기 위하여 static 블럭에 내용을 작성
	//파일의 내용을 읽어 들여야 하니 예외 처리도 함
	static {
		try {
			
			//mybatis 설정파일인 sqlMapConfig파일을 stream으로 읽어 들임(stream : 순서 있는 자료의 흐름)
			//파일의 내용을 읽고 쓰려면 자료(데이터)가 순서있게 나가고 들어와야 함
			//이것을 stream이라고 함
			//Reader는 문자단위의 입출력, 환경설정 파일이 문자로 되어 있으므로 문자단위의 최상위 stream인 Reader(io) 객체를 생성
			//mybatis 설정파일을 stream으로 읽어오기 위하여 mybatis가 제공하는 Resources클래스의 static 메소드인
			//getResourcesAsReader 메소드를 이용함
			//이때 매개변수로 설정파일의 경로를 포함한 이름을 전달
			//												↓파일이 있는 경로
			Reader reader = Resources.getResourceAsReader("com/example/demo/db/sqlMapConfig.xml");
			
			//위에서 생성한 stream을 매개변수로 하여 SqlSessionFactory 객체를 생성
			factory = new SqlSessionFactoryBuilder().build(reader);
			
			//factory가 필요한거라서 사용했던 stream은 닫아줌
			reader.close();
		} catch (Exception e) {
			System.out.println("예외발생:"+e.getMessage());
		}
	}
	
	
	//mybatis 설정파일에 등록한 customerMapper 파일에 있는 sql 중에 모든 고객목록을 검색하는 sql을 요청하는 메소드 만듬
	//DBManager 객체를 생성하지 않고 사용할 수 있도록 static
	public static List<CustomerVO> findAll(){
		
		//mybatis 설정파일에 있는 sql을 요청하기 위하여 SqlSessionFactory를 통하여 SqlSession을 얻어와야 함
		SqlSession session = factory.openSession();
		
		//mybatis 설정파일에 있는 sql을 요청
		//설정파일의 namespace와 id를 통해 요청
		List<CustomerVO> list = session.selectList("customer.findAll");
		
		//session의 사용이 끝나면 닫아줌
		session.close();
		return list;
	}
}
