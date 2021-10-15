class Student
{
	protected String name;
	protected String number;
	protected String major;
	protected int grade;
	protected double credit;

	public Student(){
	}
	public Student(String name,String number,String major,int grade,double credit){
		this.name = name;
		this.number = number;
		this.major = major;
		this.grade = grade;
		this.credit = credit;
	}

	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setNumber(String number){
		this.number = number;
	}
	public String getNumber(){
		return number;
	}
	public void setMajor(String major){
		this.major = major;
	}
	public String getMajor(){
		return major;
	}
	public void setGrade(int grade){
		this.grade = grade;
	}
	public int getGrade(){
		return grade;
	}
	public void setCredit(double credit){
		this.credit = credit;
	}
	public double getCredit(){
		return credit;
	}

	public String toString(){
		return "�̸�:" + name + ", �й�:" + number + ", �Ҽ��а�:" + major + ", �г�:" + grade + ", �̼�����:" + credit;
	}
}


class UnderGraduate extends Student
{
	private String club;

	public UnderGraduate(){
	}
	public UnderGraduate(String name,String number,String major,int grade,double credit,String club){
		super(name,number,major,grade,credit);
		this.club = club;
	}

	public void setClub(String club){
		this.club = club;
	}
	public String getClub(){
		return club;
	}

	public String toString(){
		return super.toString() + ", ���Ƹ���:" + club;
	}
}


class Graduate extends Student
{
	private boolean assistant;
	private double rate;

	public Graduate(){
	}
	public Graduate(String name,String number,String major,int grade,double credit,boolean assistant,double rate){
		super(name,number,major,grade,credit);
		this.assistant = assistant;
		this.rate = rate;
	}

	public void setAssistant(boolean assistant){     //������
		this.assistant = assistant;
	}
	public String getAssistant(){					//������
		if (assistant == true){
			return "��������";
		}else{
			return "��������";
		}
	}
	public void setRate(double rate){
		if (rate>=0 && rate<1){
			this.rate = rate;
		}
	}
	public double getRate(){
		return rate;
	}

	public String toString(){
		return super.toString() + ", ��������:" + getAssistant() + ", ���бݺ���:" + rate;
	}

}

class  StudentTest
{
	public static void main(String[] args) 
	{
		Student s = new Student("ȫ�浿","202103","�濵�а�",1,4.0);
		System.out.println(s);

		UnderGraduate u = new UnderGraduate("�̼���","202003","�����а�",2,3.8,"���絿�Ƹ�");
		System.out.println(u);

		Graduate g = new Graduate("������","201903","�����а�",3,3.5,true,0.9);
		System.out.println(g);
	}
}
