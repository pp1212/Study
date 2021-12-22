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
    
    
    //�� ���� �����
	@Override		
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		//super.init(config);
		map = new HashMap<String, SistAction>();	//map ����
		try {
			String path = config.getServletContext().getRealPath("WEB-INF");	//sist.properties�� ���� ��ηκ��� �о���� ���Ͽ�
			FileReader fr = new FileReader(path + "/sist.properties");
			
			//Ű�� value ���� ��������
			Properties prop = new Properties();
			prop.load(fr);
		
			Iterator keyList = prop.keySet().iterator();
			while(keyList.hasNext()) {
				String key = (String)keyList.next();
				String clsName = prop.getProperty(key);	//Ŭ���� �̸� ������, ���ڿ� ����
				
				//Ŭ���� �̸����� ��ü�� �����ؾ� ��
				SistAction obj = (SistAction)Class.forName(clsName).newInstance();
				map.put(key, obj);	//Ű�� �׼ǰ�ü�� map�� ���
			}
		}catch (Exception e) {
			System.out.println("���ܹ߻�:"+e.getMessage());
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
	
	//get�̵� post�� ������ ó���� ���Ͽ�,   �����ڰ� ��û�� ������ ������ ������ �˾ƾ� �ϱ� ������
	public void proRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//����ڰ� �ּ�ǥ���ٿ� �� uri�� �ľ�
		String uri = request.getRequestURI();
		/*uri�� �������� 
		 * 	/day1222/listBoard.do �տ� �ִ� ������Ʈ�̸��� ���� �̰͸� �����;� �ϱ� ������
		 * ���������� ã�Ƽ� �װ����� �߶���� lastIndex ����ϰ� / �������� �߶���� ���ؼ� +1
		 */
		String cmd = uri.substring( uri.lastIndexOf("/")+1   );		//listBoard.do	insertBoard.do
		SistAction action = map.get(cmd);	//key�� ��			new ListBoardAction()	new InsertBoardAction()
		String viewPage = action.proRequest(request, response);	//���� �� ��ó�� �� �� viewPage ��ȯ		//listBoard.jsp
		
		//�̵���Ű�� ���� ��ü
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		
		dispatcher.forward(request, response);
	}

}
