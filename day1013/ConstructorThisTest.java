class Person
{
	private String name;
	private int age;
	
	public Person(String name,int age){
		this.name = name;
		this.age = age;
		System.out.println("매개변수를 모두 갖는 생성자 동작함");
	}

	public Person(){
		this("홍길동",20);   //위에꺼부터 만나고 다시 여기 옴, this()는 생성자의 첫 번째 문장에 와야함
		System.out.println("매개변수를 갖지 않는 생성자 동작함");
	}

	public String toString(){
		return "이름:" + name + ",나이:" + age;
	}
}



class  ConstructorThisTest
{
	public static void main(String[] args) 
	{
		Person p1 = new Person("김유신",30);   //p1객체참조변수
		Person p2 = new Person();
		System.out.println(p1);
		System.out.println(p2);
	}
}
