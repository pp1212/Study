class Dog
{
	private String name;
	private int age;
	public String breed;

	/*public Dog(){   //�Ű����� ���� �ʴ� ������(�⺻������)-���� �ȿ� ���� �ʾƵ� �ʱ�ȭ ��
		//name = null;
		//age = 0;
		//breed = null;
	}*/
	
	public String toString(){
		return "�������̸�:"+name+",����������:"+breed+",����������:"+age;
	}
}


class  DefaultConstructor01
{
	public static void main(String[] args) 
	{
		Dog d1 = new Dog();
		System.out.println(d1);

	}
}
