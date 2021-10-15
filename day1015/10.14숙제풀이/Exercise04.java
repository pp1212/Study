class Student
{
	private int number;   //private은 반드시 setter,getter 필요
	public String name;   //public은 setter,getter 만들어도 되고 안 만들어도 됨

	public Student(int number,String name){
		this.number = number;
		this.name = name;
	}
	public Student(){
	}

	public void setNumber(int number){
		this.number = number;
	}
	public int getNumber(){
		return number;
	}
	
}

class GraduateStudent extends Student
{
	public String lab;    //lab은 public이여서 setter,gertter 안 만들어도 됨

	public GraduateStudent(int number,String name,String lab){
		super(number,name); 
		this.lab = lab;
	}
	public GraduateStudent(){
		super(); 
	}
	/*
	public GraduateStudent(){
		super(1234,"홍길동");     이것도 가능
	}
	*/

	public void setLab(String lab){
		this.lab = lab;
	}
	public String getLab(){
		return lab;
	}
}


class Exercise04 
{
	public static void main(String[] args) 
	{
		GraduateStudent s = new GraduateStudent();

		//s.number = 10;
		//어떤 클래스의 private영역에는 외부의 클래스가 접근 할 수 없음
		/*
		Exercise04.java:54: error: number has private access in Student
                s.number = 10;
                 ^
		1 error
		*/

		s.lab = "Image Processing Lab";
		s.name = "홍길동";
		//public이어서 접근 가능
	}
}

/*
1. 수퍼클래스:Student  서브클래스:GraduateStudent
2.O
3.O
4.O
5.1번
*/