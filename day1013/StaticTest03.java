class Family
{
	public String name; 
	private int age;
	private String role;
	public static String addr;  
	public Family(String name,int age,String role){
		this.name=name;
		this.age =age;
		this.role=role;
	}

	public Family(){		
	}

	public String toString(){
		return "[name:"+ name + ",age:" + age +",role:" + role +",addr:" + addr + "]";
	}

	public static void pro(){  //��ü���̵� ����ϴ� static�� �Ϲݸ���������� �ִ� �޸𸮿� ���� �Ұ�
		System.out.println("�ּ�:" + addr);
		System.out.prinrln("�̸�:" + name);
		
	}
}

class StaticTest03 
{
	public static void main(String[] args) 
	{
		Family.addr = "����� ������ ������ 1234";   //Ŭ�����̸�.������
		System.out.println("�ּ�:"+Family.addr);
		
		Family.pro();
		}
}