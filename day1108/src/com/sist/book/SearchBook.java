package com.sist.book;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Scanner;
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

public class SearchBook extends JFrame{

	JTextField jtf_pub;
	
	JTable table;
	Vector<Vector> rowData;
	Vector colNames;
	BookDAO dao;
	
	
	public SearchBook() {
		dao = new BookDAO();
		rowData = new Vector<Vector>();
		colNames = new Vector();
		colNames.add("도서번호");
		colNames.add("도서명");
		colNames.add("출판사명");
		colNames.add("가격");
		
		jtf_pub = new JTextField(15);
		JButton btn = new JButton("검색");
		JPanel p = new JPanel();
		p.add(new JLabel("출판사명:"));
		p.add(jtf_pub);
		p.add(btn);
		
		table = new JTable(rowData, colNames);
		JScrollPane jsp = new JScrollPane(table);
		
		add(p,BorderLayout.CENTER);
		add(jsp,BorderLayout.SOUTH);
		
		setSize(500,600);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String publisher = jtf_pub.getText();
				
				ArrayList<BookVO> list = dao.searchBook(publisher);
				for(BookVO b : list) {
					Vector v = new Vector();
					v.add(b.getBookid());
					v.add(b.getBookname());
					v.add(b.getPublisher());
					v.add(b.getPrice());
					rowData.add(v);
				}
				table.updateUI();	
			}});
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SearchBook();
	}

}
