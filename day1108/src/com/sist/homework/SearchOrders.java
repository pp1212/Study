package com.sist.homework;

import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SearchOrders extends JFrame {

	JTextField jtf_custid;
	JTable table;
	Vector<Vector> rowData;
	Vector colNames;
	OrdersDAO dao;
	
	public SearchOrders() {
		dao = new OrdersDAO();
		rowData = new Vector<Vector>();
		colNames = new Vector();
		colNames.add("주문번호");
		colNames.add("고객번호");
		colNames.add("도서번호");
		colNames.add("구매가격");
		colNames.add("구매일");
		
		jtf_custid = new JTextField(15);
		JButton btn_search = new JButton("검색");
		JPanel p = new JPanel();
		p.add(new JLabel("고객번호:"));
		p.add(jtf_custid);
		p.add(btn_search);
		
		table = new JTable(rowData, colNames);
		JScrollPane jsp = new JScrollPane(table);
		
		add(p,BorderLayout.CENTER);
		add(jsp,BorderLayout.SOUTH);
		
		setSize(600,600);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		btn_search.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int custid = Integer.parseInt(jtf_custid.getText());
				
				rowData.clear();
				ArrayList<OrdersVO> list = dao.searchOrders(custid);
				for(OrdersVO o : list) {
					Vector v = new Vector();
					v.add(o.getOrderid());
					v.add(o.getCustid());
					v.add(o.getBookid());
					v.add(o.getSaleprice());
					v.add(o.getOrderdate());
					rowData.add(v);
				}
				table.updateUI();
			}});
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SearchOrders();
	}

}
