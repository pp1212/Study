package com.sist.controller;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Properties;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sist.action.SistAction;

/**
 * Servlet implementation class SistController
 */
@WebServlet("*.do")
public class SistController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	HashMap<String, SistAction> map;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SistController() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    
    //한 번만 실행됨
	@Override		
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		//super.init(config);
		map = new HashMap<String, SistAction>();	//map 생성
		try {
			String path = config.getServletContext().getRealPath("WEB-INF");	//sist.properties를 실제 경로로부터 읽어오기 위하여
			FileReader fr = new FileReader(path + "/sist.properties");
			
			//키와 value 따로 관리해줌
			Properties prop = new Properties();
			prop.load(fr);
		
			Iterator keyList = prop.keySet().iterator();
			while(keyList.hasNext()) {
				String key = (String)keyList.next();
				String clsName = prop.getProperty(key);	//클래스 이름 가져옴, 문자열 상태
				
				//클래스 이름으로 객체를 생성해야 함
				SistAction obj = (SistAction)Class.forName(clsName).newInstance();
				map.put(key, obj);	//키와 액션객체를 map에 등록
			}
		}catch (Exception e) {
			System.out.println("예외발생:"+e.getMessage());
		}
	}



	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		proRequest(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		proRequest(request, response);
	}
	
	//get이든 post든 동일한 처리를 위하여,   ↓사용자가 요청한 정보와 응답한 정보를 알아야 하기 때문에
	public void proRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//사용자가 주소표시줄에 쓴 uri를 파악
		String uri = request.getRequestURI();
		/*uri를 가져오면 
		 * 	/day1222/listBoard.do 앞에 있는 프로젝트이름을 빼고 이것만 가져와야 하기 때문에
		 * 끝에서부터 찾아서 그곳부터 잘라오는 lastIndex 사용하고 / 다음부터 잘라오기 위해서 +1
		 */
		String cmd = uri.substring( uri.lastIndexOf("/")+1   );		//listBoard.do	insertBoard.do
		SistAction action = map.get(cmd);	//key가 됨			new ListBoardAction()	new InsertBoardAction()
		String viewPage = action.proRequest(request, response);	//맡은 바 일처리 한 후 viewPage 반환		//listBoard.jsp
		
		//이동시키기 위한 객체
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		
		dispatcher.forward(request, response);
	}

}
