package com.sist.action;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sist.dao.GoodsDAO;
import com.sist.vo.GoodsVO;

public class DeleteGoodsAction implements SistAction {
	public GoodsDAO dao;		//�����ؾ� �ϴϱ� dao�ʿ�
	
	public DeleteGoodsAction() {
		dao = new GoodsDAO();		//�����ڿ��� dao ����
	}
	
	@Override
	public String proRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		int no = Integer.parseInt(request.getParameter("no"));	//�����ϰ��� �ϴ� ��ǰ��ȣ ����
		String oldFname = dao.getGoods(no).getFname();
		String path = request.getRealPath("upload");
		String viewPage = "";
		int re = dao.deleteGoods(no);
		if(re == 1) {
			viewPage = "deleteGoodsOK.jsp";
			File file = new File( path + "/" + oldFname);
			file.delete();
		}else {
			viewPage = "error.jsp";
			request.setAttribute("msg", "��ǰ ������ �����Ͽ����ϴ�.");
		}
		
		return viewPage;
	}

}
