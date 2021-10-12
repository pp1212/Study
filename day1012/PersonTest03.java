class Person
{
	private String name;

	public void setName(String name){
		name = name;   //'매개변수의 값을 매개변수에 저장하라'이기 때문에 값이 저장되지 않음
	}

	public String getName(){
		return name;
	}
}


class PersonTest03 
{
	public static void main(String[] args) 
	{
		Person p1 = new Person();
		p1.setName("홍길동");
		System.out.println(p1.getName());
	}
}

/*즉 클래스를 만들 때레 멤버메소드의 매개변수 이름을 의미있는 이름으로 정해주다 보면
멤버변수의 이름과 동일하게 됨
메소드 안에서 멤버변수에 접근하기 위해서는 this.멤버변수명으로 접근 가능
class Person
{
	private String name;

	public void setName(String name){
		this.name = name;   
		//메소드 안에서 멤버변수에 접근하기 위해서는 this키워드 사용
		//매개변수가 달라도 쓸수는 있음
	}

}
*/