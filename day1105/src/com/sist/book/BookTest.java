package com.sist.book;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.util.Vector;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class BookTest extends JFrame {
	
	JTextField jtf_no;
	JTextField jtf_name;
	JTextField jtf_comp;
	JTextField jtf_price;
	
	JTable table;
	Vector<Vector> rowData;
	Vector colNames;
	BookDao dao;
	
	public BookTest() {
		dao = new BookDao();
		
		colNames = new Vector();
		rowData = new Vector<Vector>();
		
		colNames.add("도서번호");
		colNames.add("도서명");
		colNames.add("출판사명");
		colNames.add("가격");
		
		table = new JTable(rowData, colNames);
		JScrollPane jsp = new JScrollPane(table);
		
		jtf_no = new JTextField();
		jtf_name = new JTextField();
		jtf_comp = new JTextField();
		jtf_price = new JTextField();
		
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(4,2));
		p.add(new JLabel("도서번호"));
		p.add(jtf_no);
		p.add(new JLabel("도서명"));
		p.add(jtf_name);
		p.add(new JLabel("출판사명"));
		p.add(jtf_comp);
		p.add(new JLabel("가격"));
		p.add(jtf_price);
		
		JButton btn_add = new JButton("추가");
		JButton btn_list = new JButton("목록");
		JButton btn_update = new JButton("수정");
		JButton btn_delete = new JButton("삭제");
		
		JPanel p_btn = new JPanel();	//기본 FlowLayout
		p_btn.add(btn_add);
		p_btn.add(btn_list);
		p_btn.add(btn_update);
		p_btn.add(btn_delete);
		
		JPanel p_center = new JPanel();
		p_center.setLayout(new BorderLayout());
		p_center.add(p,BorderLayout.CENTER);
		p_center.add(p_btn,BorderLayout.SOUTH);
		
		add(p_center,BorderLayout.CENTER);
		add(jsp,BorderLayout.SOUTH);
		
		setSize(800,600);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		btn_add.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}});
		btn_list.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}});
		btn_update.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}});
		btn_delete.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}});
		table.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				int index = table.getSelectedRow();
				Vector v = rowData.get(index);
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}});
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new BookTest();
	}

}
