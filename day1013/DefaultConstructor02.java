class Dog
{
	private String name;
	private int age;
	public String breed;

	public Dog(String name,int age,String breed){   
		this.name = name;
		this.age = age;
		this.breed = breed;
	}
	
	public String toString(){
		return "�������̸�:"+name+",����������:"+breed+",����������:"+age;
	}
}


class  DefaultConstructor02
{
	public static void main(String[] args) 
	{
		Dog d1 = new Dog();   //�̷��� �Ǹ� ����, ���� ������ �Ѱ� ���� �⺻������ ����������
		System.out.println(d1);

	}
}

/*
efaultConstructor02.java:23: error: constructor Dog in class Dog cannot be applied to given types;
                Dog d1 = new Dog();   
                         ^
  required: String,int,String
  found: no arguments
  reason: actual and formal argument lists differ in length
1 error

����ڰ� �����ڸ� ������� ������ �⺻�����ڰ� �������� �ʴ´�

�Ű������� ��� ���� �����ڸ� ����ϴ���
�ʿ��ϴٸ� �Ű������� ���� �ʴ� �����ڸ� ����ڰ� ������־�� ��

������ �����ڸ� ���鶧���� 
�ݵ�� �⺻�����ڸ� ��������!!!
*/