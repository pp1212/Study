class A  //상속 실험해야 되서 클래스 만들어야 함
{
	int i;
	int j;

}

class B extends A   //i,j갖게 됨
{
	int k;

}


class InheritanceTest {
	public static void main(String[] args) 
	{
		B ob = new B(); //객체생성
		
		ob.i= 10;   //접근명시자 쓰지 않아서 바로 접근 가능
		ob.j=20;
		ob.k=30;
		System.out.println(ob.i);
		System.out.println(ob.j);
		System.out.println(ob.k);
	}
}
