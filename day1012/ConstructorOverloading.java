class Emp
{
	private String name;
	private int sal;
	private String addr;

	public String toString(){
		return "�̸�:"+name+",�޿�:"+sal+",�ּ�:"+addr;
	}

	public Emp(){
		name="ȫ�浿";
		sal=500;
		addr="����";
	}
	public Emp(String name,int sal,String addr){
		this.name =name;
		this.sal=sal;
		this.addr=addr;
	}

	public Emp(String name){
		this.name=name;
		sal=500;
		addr="����";
	}

	public Emp(String name,int sal){	//������ �޶� �ߺ� ����1
		this.name=name;
		this.sal=sal;
		addr="����";
	}

	public Emp(int sal,String name){   //������ �޶� �ߺ� ����2
		this.sal=sal;
		this.name=name;
		addr="����";
	}
	
	//setter,getter����

	/*����-���� String�� �Ѱ� ���� ������ �̹� �ֱ� ������ �ȵ�
	public Emp(String addr){      
		this.addr=addr;
		name="ȫ�浿";
		sal=500;
	}
	
	ConstructorOverloading.java:43: error: constructor Emp(String) is already defined in class Emp
        public Emp(String addr){      
               ^
	1 error
	*/



}

class ConstructorOverloading
{
	public static void main(String[] args) 
	{
		Emp a = new Emp();
		System.out.println(a);
		Emp b = new Emp("������",600,"����");
		System.out.println(b);
		
		//������ 3���� ������ε� ��ü ����
		Emp c = new Emp("�̼���");
		System.out.println(c);
		Emp d = new Emp("����ö",800);
		System.out.println(d);
		Emp e = new Emp(900,"��ö��");
		System.out.println(e);
	}
}
