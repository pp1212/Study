package com.sist.exam02;

public class Dept {
	private int dno;
	private String dname;
	private String dloc;
	public Dept(int dno, String dname, String dloc) {
		super();
		this.dno = dno;
		this.dname = dname;
		this.dloc = dloc;
	}
	public Dept() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getDno() {
		return dno;
	}
	public void setDno(int dno) {
		this.dno = dno;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getDloc() {
		return dloc;
	}
	public void setDloc(String dloc) {
		this.dloc = dloc;
	}
	@Override
	public String toString() {
		return "Dept [dno=" + dno + ", dname=" + dname + ", dloc=" + dloc + "]";
	}
	
}
