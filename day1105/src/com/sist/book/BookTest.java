package com.sist.book;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.util.ArrayList;
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
	
	public void printBook() {
		rowData.clear();
		ArrayList<BookVo> list = dao.listBook();
		for(BookVo b : list) {
			Vector v = new Vector();
			v.add(b.getNo());
			v.add(b.getName());
			v.add(b.getComp());
			v.add(b.getPrice());
			rowData.add(v);
		}
		table.updateUI();
	}
	
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
				
				int no = Integer.parseInt(jtf_no.getText());
				String name = jtf_name.getText();
				String comp = jtf_comp.getText();
				int price = Integer.parseInt(jtf_price.getText());
				
				BookVo b = new BookVo(no, name, comp, price);
				int re = dao.insertBook(b);
				if(re == 1) {
					System.out.println("도서정보 추가에 성공하였습니다.");
					printBook();
				}else {
					System.out.println("도서정보 추가에 실패하였습니다.");
				}
			}});
		
		btn_list.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				printBook();
			}});
		
		btn_update.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				int no = Integer.parseInt(jtf_no.getText());
				String name = jtf_name.getText();
				String comp = jtf_comp.getText();
				int price = Integer.parseInt(jtf_price.getText());
				
				BookVo b = new BookVo(no, name, comp, price);
				int re = dao.updateBook(b);
				if(re == 1) {
					System.out.println("도서정보 수정에 성공하였습니다.");
					printBook();
				}else {
					System.out.println("도서정보 수정에 실패하였습니다.");
				}
			}});
		
		btn_delete.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				int no = Integer.parseInt(jtf_no.getText());
				int re = dao.deleteBook(no);
				if(re == 1) {
					System.out.println("도서정보 삭제에 성공하였습니다.");
					printBook();
				}else {
					System.out.println("도서정보 삭제에 실패하였습니다.");
				}
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
				jtf_no.setText(v.get(0)+"");
				jtf_name.setText(v.get(1)+"");
				jtf_comp.setText(v.get(2)+"");
				jtf_price.setText(v.get(3)+"");
				
				
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
