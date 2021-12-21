package com.sist.action;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sist.dao.GoodsDAO;
import com.sist.vo.GoodsVO;

public class DeleteGoodsAction implements SistAction {
	public GoodsDAO dao;		//삭제해야 하니까 dao필요
	
	public DeleteGoodsAction() {
		dao = new GoodsDAO();		//생성자에서 dao 생성
	}
	
	@Override
	public String proRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		int no = Integer.parseInt(request.getParameter("no"));	//삭제하고자 하는 상품번호 전달
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
			request.setAttribute("msg", "상품 삭제에 실패하였습니다.");
		}
		
		return viewPage;
	}

}
