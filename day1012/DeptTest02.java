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
		result	+= "�μ���ȣ:" + dno + "\n";
		result	+= "�μ���:" + dname + "\n";
		result	+= "�μ���ġ:" + dloc + "\n";
		return result;
		//return "�μ���ȣ:" + dno + ",�μ���:" + dname + ",�μ���ġ:" + dloc;  �Ȱ�
	}

}



class  DeptTest02
{
	public static void main(String[] args) 
	{
		Dept d1 = new Dept(10,"�ѹ���","����");
		Dept d2 = new Dept(20,"������","����");

		System.out.println(d1);
		System.out.println(d2);
	}
}
