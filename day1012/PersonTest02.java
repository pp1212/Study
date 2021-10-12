class Person
{
	private String name;
	private int age;
	
	//멤버변수 age의 값을 설정(변경)하는 메소드 정의
	public void setAge(int a){
		age = a;
		return;  //리턴값 없음,값 버리고 돌아감
	} 

	//멤버변수 age의 값을 반환하는 메소드 정의
	public int getAge(){
		return age;
	}



	//멤버변수 name의 값을 설정(변경)하는 메소드를 정의
	public void setName(String n){
		//멤버변수 name을 매개변수로 전달받은 n으로 설정
		name = n;
		return; //생략됨, 리턴값이 없음, 값 버리고 돌아감
	}

	//멤버변수 name의 값을 반환하는 메소드 정의
	public String getName(){
		return name; //리턴값 있음 -> 리턴 옆에 자료형 있음
	}
}


class  PersonTest02
{
	public static void main(String[] args) 
	{
		Person p1;  
		
		p1 = new Person();  

		//p1.name = "홍길동";  
		//p1.age = 20;       

		//멤버변수 name을 변경하기 위한 setName을 이용
		p1.setName("홍길동");
		
		//멤버변수 age를 변경하기 위한 setAge를 이용
		p1.setAge(20);

		
		//System.out.println(p1.name); 
		//System.out.println(p1.age);  

		//멤버변수 p1의 이름을 읽어오기 위하여 getName메소드를 이용
		System.out.println( p1.getName() );
		
		//멤버변수 p1의 나이를 읽어오기 위하여 getAge메소드를 이용
		System.out.println( p1.getAge() );

	}
}
/*
PersonTest02.java:16: error: name has private access in Person
                p1.name = "홍길동";
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

Person클래스의 private영역인 속성에 직접 접근할 수 없음
접근할 수 있는 메소드를 public에 만들어두고 사용해야 함
*/