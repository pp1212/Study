class A{
	public A(int i){
		System.out.println("A의 생성자 동작함");
	}
}
class B extends A{
	public B(){
		System.out.println("B의 생성자 동작함");
	}
}

class InhritenceTestConstructor02
{
	public static void main(String[] args) 
	{
		B ob = new B();  //B의 객체 생성하면 B의 부모클래스가 먼저 동작하고 자신 동작
	}
}

/*
InhritenceTestConstructor02.java:7: error: constructor A in class A cannot be applied to given types;
        public B(){
                  ^
  required: int
  found: no arguments
  reason: actual and formal argument lists differ in length
1 error

=>자식클래스 생성자의 첫 번째 줄에는 부모클래스의 기본생성자를 요구하는 super()가 생략
그런데 부모클래스 A클래스에 기본생성자가 없으므로 오류 발생
*/


