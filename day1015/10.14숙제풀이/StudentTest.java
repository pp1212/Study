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
		return "이름:" + name + ", 학번:" + number + ", 소속학과:" + major + ", 학년:" + grade + ", 이수학점:" + credit;
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
		return super.toString() + ", 동아리명:" + club;
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

	public void setAssistant(boolean assistant){     //설정자
		this.assistant = assistant;
	}
	public String getAssistant(){					//접근자
		if (assistant == true){
			return "교육조교";
		}else{
			return "연구조교";
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
		return super.toString() + ", 조교유형:" + getAssistant() + ", 장학금비율:" + rate;
	}

}

class  StudentTest
{
	public static void main(String[] args) 
	{
		Student s = new Student("홍길동","202103","경영학과",1,4.0);
		System.out.println(s);

		UnderGraduate u = new UnderGraduate("이순신","202003","경제학과",2,3.8,"봉사동아리");
		System.out.println(u);

		Graduate g = new Graduate("김유신","201903","무역학과",3,3.5,true,0.9);
		System.out.println(g);
	}
}
