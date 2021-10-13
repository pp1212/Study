class Family
{
	public String name; 
	private int age;
	private String role;
	public static String addr;  //static은 보통 public으로
	//클래스변수는 객체생성 전에도 사용가능, 객체생성 후에도 사용 가능
	//접근 가능

	public Family(String name,int age,String role){
		this.name=name;
		this.age =age;
		this.role=role;
	}

	public Family(){		//기본생성자 항상 만들기!
	}

	public String toString(){
		return "[name:"+ name + ",age:" + age +",role:" + role +",addr:" + addr + "]";
	}

}

class StaticTest 
{
	public static void main(String[] args) 
	{
		Family.addr = "서울시 마포구 서교동 1234";   //클래스이름.변수명
		System.out.println("주소:"+Family.addr);

		Family.name="홍길동";
		System.out.println("이름:"+Family.name);  //static이 아니다라는 오류
		//클래스이름으로 바로 접근할 수 있는 건 static만 가능
	}
}
/*
StaticTest.java:32: error: non-static variable name cannot be referenced from a static context
                Family.name="홍길동";
                      ^
StaticTest.java:33: error: non-static variable name cannot be referenced from a static context
                System.out.println("이름:"+Family.name);  //static이 아니다라는 오류
                                               ^
2 errors

==>static멤버가 아닌 것은 클래스이름으로 접근할 수 없음

*/
