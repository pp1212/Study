class Person
{
	String name;
	int age;
}


class  PersonTest
{
	public static void main(String[] args) 
	{
		Person p1;  //PersonŬ�������� ��ü�� �����ϱ� ���� ���� ����
		p1 = new Person();  //PersonŬ�������� ��ü�� �����Ͽ� p1�� ����

		p1.name = "ȫ�浿";  //�������� p1�� ����Ű�� �ִ� Person��ü�� �̸��� ""���� ����
		p1.age = 20;       //�������� p1�� ����Ű�� �ִ� Person��ü�� ���̸� 20���� ����

		System.out.println(p1.name);  //�������� p1�� ����Ű�� �ִ� Person��ü�� �̸� ���
		System.out.println(p1.age);   //�������� p1�� ����Ű�� �ִ� Person��ü�� ���� ���

	}
}
