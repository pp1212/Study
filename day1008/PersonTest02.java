/*
사람 (클래스) Person
	   속성
		이름	Sting name	"홍길동"
		나이	int age		20
		성별	char gender	'남','여'
	   
	   동작
	   	먹는다void eat(String food)
		잔다	void sleep()
*/
class Person
{
	String name;                                //속성
	int age;
	char gender;

	void eat(String food){                      //새로운 자료형
		//성별이 남인 20살 홍길동이 우유를 먹어요
		System.out.printf("성별이 %c인 %d살 %s가(이) %s를 먹어요\n",gender,age,name,food);
	}

	void sleep(){
		//성별이 남인 20살 홍길동이 쿨~쿨~ 자고 있어요
		System.out.printf("성별이 %c인 %d살 %s가(이) 쿨~쿨~ 자고 있어요\n",gender,age,name);
	}
}



class PersonTest02 
{
	public static void main(String[] args) 
	{
		Person p;  //Person 자료형 p 변수명
		p = new Person();  //Person형태로 p를 new 생성해주세요
		p.name = "최현호";
		p.age = 26;
		p.gender = '남';
		p.eat("치맥");
		p.sleep();

		Person kim = new Person();
		kim.name = "김시아";
		kim.age = 23;
		kim.gender = '여';
		kim.eat("피콜");
		kim.sleep();
	}
}
