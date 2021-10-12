class Person
{
	String name;
	int age;
}


class  PersonTest
{
	public static void main(String[] args) 
	{
		Person p1;  //Person클래스형의 객체를 참조하기 위한 변수 선언
		p1 = new Person();  //Person클래스형의 객체를 생성하여 p1이 참조

		p1.name = "홍길동";  //참조변수 p1이 가리키고 있는 Person객체의 이름을 ""으로 설정
		p1.age = 20;       //참조변수 p1이 가리키고 있는 Person객체의 나이를 20으로 설정

		System.out.println(p1.name);  //참조변수 p1이 가리키고 있는 Person객체의 이름 출력
		System.out.println(p1.age);   //참조변수 p1이 가리키고 있는 Person객체의 나이 출력

	}
}
