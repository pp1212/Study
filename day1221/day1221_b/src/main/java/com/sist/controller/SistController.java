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

import com.sist.action.InsertGoodsOKAction;
import com.sist.action.DetailGoodsAction;
import com.sist.action.InsertGoodsAction;
import com.sist.action.ListGoodsAction;
import com.sist.action.SistAction;

/**
 * Servlet implementation class SistController
 */
//@WebServlet("/SistController")
public class SistController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	HashMap<String, SistAction> map;
	
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SistController() {
        super();
        // TODO Auto-generated constructor stub
        map = new HashMap<String, SistAction>();
        
    }
    
    
    

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		//super.init(config);
		String path = config.getServletContext().getRealPath("WEB-INF");
		try {
			FileReader fr = new FileReader(path + "/sist.properties");
			Properties prop = new Properties();
			prop.load(fr);		//key와 value 따로 관리 해줌 -> properties 파일에 key:listGoods.do,  value:com.sist.action.ListGoodsAction
			Iterator keyList = prop.keySet().iterator();
			while(keyList.hasNext()) {
				String key = (String)keyList.next();
				String clsName = prop.getProperty(key);
				SistAction obj = (SistAction)Class.forName(clsName).newInstance();	//Class.forName().newInstance()가 객체 생성해줌
				map.put(key, obj);
			}
			fr.close();
			
		}catch (Exception e) {
			System.out.println("예외발생"+e.getMessage());
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
	
	
	//get로 요청하거나 post로 요펑하거나 이 메소드가 동작하도록 
	public void proRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("프론트 컨트롤러 동작함!");
		String uri = request.getRequestURI();
		String cmd = uri.substring( uri.lastIndexOf("/")+1  );	// /다음부터 잘라옴
		System.out.println("cmd:"+cmd);
		SistAction action = map.get(cmd);
		String viewPage = action.proRequest(request, response);
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		dispatcher.forward(request, response);
	}

}
