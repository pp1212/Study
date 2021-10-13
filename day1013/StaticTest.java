class Family
{
	public String name; 
	private int age;
	private String role;
	public static String addr;  //static�� ���� public����
	//Ŭ���������� ��ü���� ������ ��밡��, ��ü���� �Ŀ��� ��� ����
	//���� ����

	public Family(String name,int age,String role){
		this.name=name;
		this.age =age;
		this.role=role;
	}

	public Family(){		//�⺻������ �׻� �����!
	}

	public String toString(){
		return "[name:"+ name + ",age:" + age +",role:" + role +",addr:" + addr + "]";
	}

}

class StaticTest 
{
	public static void main(String[] args) 
	{
		Family.addr = "����� ������ ������ 1234";   //Ŭ�����̸�.������
		System.out.println("�ּ�:"+Family.addr);

		Family.name="ȫ�浿";
		System.out.println("�̸�:"+Family.name);  //static�� �ƴϴٶ�� ����
		//Ŭ�����̸����� �ٷ� ������ �� �ִ� �� static�� ����
	}
}
/*
StaticTest.java:32: error: non-static variable name cannot be referenced from a static context
                Family.name="ȫ�浿";
                      ^
StaticTest.java:33: error: non-static variable name cannot be referenced from a static context
                System.out.println("�̸�:"+Family.name);  //static�� �ƴϴٶ�� ����
                                               ^
2 errors

==>static����� �ƴ� ���� Ŭ�����̸����� ������ �� ����

*/
