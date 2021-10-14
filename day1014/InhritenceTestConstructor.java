class A{
	public A(){
		System.out.println("A의 생성자 동작함");
	}
}
class B extends A{
	public B(){
		super();  //생략(써도 되고 안써도 됨) ,부모클래스의 기본생성자 요구
		System.out.println("B의 생성자 동작함");
	}
}

class InhritenceTestConstructor 
{
	public static void main(String[] args) 
	{
		B ob = new B();  //B의 객체 생성하면 B의 부모클래스가 먼저 동작하고 자신 동작
	}
}

/*
	자식클래스인 B의 객체를 생성하면 
	부모클래스인 A의 생성자가 먼저 동작하고
	자식클래스인 B의 생성자가 차례로 동작함
	자식클래스인 B의 생성자의 첫 번째 줄에 부모클래스의 기본생성자를 요구하는 super();가 생략됨
	
*/


