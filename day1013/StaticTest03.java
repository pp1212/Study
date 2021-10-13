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

	public static void pro(){  //객체없이도 사용하는 static은 일반멤버변수들이 있는 메모리에 접근 불가
		System.out.println("주소:" + addr);
		System.out.prinrln("이름:" + name);
		
	}
}

class StaticTest03 
{
	public static void main(String[] args) 
	{
		Family.addr = "서울시 마포구 서교동 1234";   //클래스이름.변수명
		System.out.println("주소:"+Family.addr);
		
		Family.pro();
		}
}
