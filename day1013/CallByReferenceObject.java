class Person
{
	private String name;
	private int age;
	public Person(String name,int age){
		this.name=name;
		this.age=age;
	}

	public Person(){
		
	}
	public String toString(){
		return name + "," + age;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}

	public void setAge(int age){
		this.age=age;
	}
	public int getAge(){
		return age;
	}


	
}


class CallByReferenceObject 
{
	//Person객체를 매개변수로 전달받아 그 사람의 나이를 1 증가하는 메소드 정의
	public static void plusOne(Person p){
		//p.age ->private이라서할 수 없음
		p.setAge( p.getAge() + 1 );
	}
	
	public static void main(String[] args) 
	{
		Person p =  new Person("홍길동",20);
		System.out.println(p); //20 
		plusOne(p);
		System.out.println(p); //21
	}
}
