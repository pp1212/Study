class Person
{
	private String name;
	private int age;
	
	//������� age�� ���� ����(����)�ϴ� �޼ҵ� ����
	public void setAge(int a){
		age = a;
		return;  //���ϰ� ����,�� ������ ���ư�
	} 

	//������� age�� ���� ��ȯ�ϴ� �޼ҵ� ����
	public int getAge(){
		return age;
	}



	//������� name�� ���� ����(����)�ϴ� �޼ҵ带 ����
	public void setName(String n){
		//������� name�� �Ű������� ���޹��� n���� ����
		name = n;
		return; //������, ���ϰ��� ����, �� ������ ���ư�
	}

	//������� name�� ���� ��ȯ�ϴ� �޼ҵ� ����
	public String getName(){
		return name; //���ϰ� ���� -> ���� ���� �ڷ��� ����
	}
}


class  PersonTest02
{
	public static void main(String[] args) 
	{
		Person p1;  
		
		p1 = new Person();  

		//p1.name = "ȫ�浿";  
		//p1.age = 20;       

		//������� name�� �����ϱ� ���� setName�� �̿�
		p1.setName("ȫ�浿");
		
		//������� age�� �����ϱ� ���� setAge�� �̿�
		p1.setAge(20);

		
		//System.out.println(p1.name); 
		//System.out.println(p1.age);  

		//������� p1�� �̸��� �о���� ���Ͽ� getName�޼ҵ带 �̿�
		System.out.println( p1.getName() );
		
		//������� p1�� ���̸� �о���� ���Ͽ� getAge�޼ҵ带 �̿�
		System.out.println( p1.getAge() );

	}
}
/*
PersonTest02.java:16: error: name has private access in Person
                p1.name = "ȫ�浿";
                  ^
PersonTest02.java:17: error: age has private access in Person
                p1.age = 20;
                  ^
PersonTest02.java:19: error: name has private access in Person
                System.out.println(p1.name);
                                     ^
PersonTest02.java:20: error: age has private access in Person
                System.out.println(p1.age);
                                     ^
4 errors

PersonŬ������ private������ �Ӽ��� ���� ������ �� ����
������ �� �ִ� �޼ҵ带 public�� �����ΰ� ����ؾ� ��
*/