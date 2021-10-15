class Student
{
	private int number;   //private�� �ݵ�� setter,getter �ʿ�
	public String name;   //public�� setter,getter ���� �ǰ� �� ���� ��

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
	public String lab;    //lab�� public�̿��� setter,gertter �� ���� ��

	public GraduateStudent(int number,String name,String lab){
		super(number,name); 
		this.lab = lab;
	}
	public GraduateStudent(){
		super(); 
	}
	/*
	public GraduateStudent(){
		super(1234,"ȫ�浿");     �̰͵� ����
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
		//� Ŭ������ private�������� �ܺ��� Ŭ������ ���� �� �� ����
		/*
		Exercise04.java:54: error: number has private access in Student
                s.number = 10;
                 ^
		1 error
		*/

		s.lab = "Image Processing Lab";
		s.name = "ȫ�浿";
		//public�̾ ���� ����
	}
}

/*
1. ����Ŭ����:Student  ����Ŭ����:GraduateStudent
2.O
3.O
4.O
5.1��
*/