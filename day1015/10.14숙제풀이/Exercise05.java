class Animal
{
	String name;
	public Animal(){
		name = "UNKNOWN";
		System.out.println("동물입니다:" + name);
	}
	public Animal(String name){
		this.name = name;
		System.out.println("동물입니다:" + name);
	}
}

class Lion extends Animal
{
	public Lion(){
		//super(); 생략 ->부모클래스의 매개변수 없는 생성자로 감
		System.out.println("사자입니다.");
	}
	public Lion(String name){
		super(name);
		System.out.println("사자입니다.");
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

/*lion =  동물입니다: Brave 
		  사자입니다.
  lion2 =  동물입니다: UNKNOWN 
		   사자입니다.
*/
