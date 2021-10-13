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

	public static void pro(){
		System.out.println("�ּ�:" + addr);
	}
}

class StaticTest02 
{
	public static void main(String[] args) 
	{
		Family.addr = "����� ������ ������ 1234";   //Ŭ�����̸�.������
		System.out.println("�ּ�:"+Family.addr);
		
		Family.pro();
		Family.toString();  //Ŭ�����̸�.������ �̰� static�� ����
	}
}
/*
StaticTest02.java:33: error: non-static method toString() cannot be referenced from a static context
                Family.toString();  //�̰� static�� ����
                      ^
1 error

==>Static�޼ҵ尡 �ƴ� ���� Ŭ�����̸�.������ ��� �Ұ���
*/