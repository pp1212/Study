class Dept
{
	private int dno;
	private String dname;
	private String dloc;

	public Dept(){
		dno = 10;
		dname = "총무부";
		dloc = "서울"; 
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



class  DeptTest
{
	public static void main(String[] args) 
	{
		Dept d = new Dept();
		System.out.println("부서번호:" + d.getDno());
		System.out.println("부서이름:" + d.getDname());
		System.out.println("부서위치:" + d.getDloc());

		d.setDloc("재주도");
		System.out.println(d);
	}
}
