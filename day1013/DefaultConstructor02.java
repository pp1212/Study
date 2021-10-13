class Dog
{
	private String name;
	private int age;
	public String breed;

	public Dog(String name,int age,String breed){   
		this.name = name;
		this.age = age;
		this.breed = breed;
	}
	
	public String toString(){
		return "강아지이름:"+name+",강아지종류:"+breed+",강아지나이:"+age;
	}
}


class  DefaultConstructor02
{
	public static void main(String[] args) 
	{
		Dog d1 = new Dog();   //이렇게 되면 오류, 내가 생성자 한개 만들어서 기본생성자 제공안해줌
		System.out.println(d1);

	}
}

/*
efaultConstructor02.java:23: error: constructor Dog in class Dog cannot be applied to given types;
                Dog d1 = new Dog();   
                         ^
  required: String,int,String
  found: no arguments
  reason: actual and formal argument lists differ in length
1 error

사용자가 생성자를 만들었기 때문에 기본생성자가 제공되지 않는다

매개변수를 모두 갖는 생성자만 사용하던지
필요하다면 매개변수를 갖지 않는 생성자를 사용자가 만들어주어야 함

앞으로 생성자를 만들때에는 
반드시 기본생성자를 만들어야함!!!
*/