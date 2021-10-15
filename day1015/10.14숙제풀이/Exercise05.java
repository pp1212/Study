class Animal
{
	String name;
	public Animal(){
		name = "UNKNOWN";
		System.out.println("�����Դϴ�:" + name);
	}
	public Animal(String name){
		this.name = name;
		System.out.println("�����Դϴ�:" + name);
	}
}

class Lion extends Animal
{
	public Lion(){
		//super(); ���� ->�θ�Ŭ������ �Ű����� ���� �����ڷ� ��
		System.out.println("�����Դϴ�.");
	}
	public Lion(String name){
		super(name);
		System.out.println("�����Դϴ�.");
	}
}

public class  Exercise05
{
	public static void main(String[] args) 
	{
		Lion lion = new Lion("Brave");
		Lion lion2 = new Lion();
	}
}

/*lion =  �����Դϴ�: Brave 
		  �����Դϴ�.
  lion2 =  �����Դϴ�: UNKNOWN 
		   �����Դϴ�.
*/
