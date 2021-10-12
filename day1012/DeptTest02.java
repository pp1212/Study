class Dept
{
	private int dno;
	private String dname;
	private String dloc;

	public Dept(int dno, String dname, String dloc){
		this.dno = dno;
		this.dname = dname;
		this.dloc = dloc;
	}

	public void setDno(int dno){
		this.dno = dno;
	}
	public int getDno(){
		return dno;
	}
	public void setDname(String dname){
		this.dname = dname;
	}
	public String getDname(){
		return dname;
	}
	public void setDloc(String dloc){
		this.dloc = dloc;
	}
	public String getDloc(){
		return dloc;
	}

	public String toString(){
		String result = "";
		result	+= "부서번호:" + dno + "\n";
		result	+= "부서명:" + dname + "\n";
		result	+= "부서위치:" + dloc + "\n";
		return result;
		//return "부서번호:" + dno + ",부서명:" + dname + ",부서위치:" + dloc;  똑같
	}

}



class  DeptTest02
{
	public static void main(String[] args) 
	{
		Dept d1 = new Dept(10,"총무팀","서울");
		Dept d2 = new Dept(20,"개발팀","제주");

		System.out.println(d1);
		System.out.println(d2);
	}
}
