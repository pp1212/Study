/*
��� (Ŭ����) Person
	   �Ӽ�
		�̸�	Sting name	"ȫ�浿"
		����	int age		20
		����	char gender	'��','��'
	   
	   ����
	   	�Դ´�void eat(String food)
		�ܴ�	void sleep()
*/
class Person
{
	String name;                                //�Ӽ�
	int age;
	char gender;

	void eat(String food){                      //���ο� �ڷ���
		//������ ���� 20�� ȫ�浿�� ������ �Ծ��
		System.out.printf("������ %c�� %d�� %s��(��) %s�� �Ծ��\n",gender,age,name,food);
	}

	void sleep(){
		//������ ���� 20�� ȫ�浿�� ��~��~ �ڰ� �־��
		System.out.printf("������ %c�� %d�� %s��(��) ��~��~ �ڰ� �־��\n",gender,age,name);
	}
}



class PersonTest02 
{
	public static void main(String[] args) 
	{
		Person p;  //Person �ڷ��� p ������
		p = new Person();  //Person���·� p�� new �������ּ���
		p.name = "����ȣ";
		p.age = 26;
		p.gender = '��';
		p.eat("ġ��");
		p.sleep();

		Person kim = new Person();
		kim.name = "��þ�";
		kim.age = 23;
		kim.gender = '��';
		kim.eat("����");
		kim.sleep();
	}
}
