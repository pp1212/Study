class Family
{
	public String name; 
	private int age;
	private String role;
	public static String addr;  
	public Family(String name,int age,String role){
		this.name=name;
		this.age =age;
		this.role=role;
	}

	public Family(){		
	}

	public String toString(){
		return "[name:"+ name + ",age:" + age +",role:" + role +",addr:" + addr + "]";
	}

	public static void pro(){
		System.out.println("주소:" + addr);
	}
}

class StaticTest02 
{
	public static void main(String[] args) 
	{
		Family.addr = "서울시 마포구 서교동 1234";   //클래스이름.변수명
		System.out.println("주소:"+Family.addr);
		
		Family.pro();
		Family.toString();  //클래스이름.변수명 이건 static만 가능
	}
}
/*
StaticTest02.java:33: error: non-static method toString() cannot be referenced from a static context
                Family.toString();  //이건 static만 가능
                      ^
1 error

==>Static메소드가 아닌 것은 클래스이름.변수명 사용 불가능
*/