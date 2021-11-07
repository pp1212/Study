package com.sist.homework;

public class DeptVo {
	private int no;
	private String name;
	private String addr;
	public DeptVo(int no, String name, String addr) {
		super();
		this.no = no;
		this.name = name;
		this.addr = addr;
	}
	public DeptVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
}
