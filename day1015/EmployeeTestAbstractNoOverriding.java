import java.util.Scanner;

//추상메소드를 포함하고 있기 때문에 추상클래스가 되어야 함
abstract class Employee
{
	protected String name;
	protected String number;
	protected int salary;    

	public Employee(){
	}
	//salary는 값만 계산하니까 매개변수로 받지는 않는다
	public Employee(String name,String number){  
		this.name = name;
		this.number=number;
	}

	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setNumber(String number){
		this.number=number;
	}
	public String getNumber(){
		return number;
	}
	public int getSalary(){   //salary는 값만 계산하니까 set 안 만듬
		return salary;
	}

	public abstract void computeSalary();  
	//body를 구체화 할 수 없는 메소드는 추상메소드로 만듬
	//미래에 만들어지는 자식클래스들이 자신에게 알맞도록 ★반드시 오버라이딩 해야 함(자식클래스들 한테 강제)
	

	public String toString(){
		return "이름:" + name + ",사원번호:" + number + ",급여:" + salary;
	}

}


class SalariedEmployee extends Employee
{
	//월급을 호봉에 따라 수당과 기본금으로 계산
	private int grade;		//호봉
	private int base;		//기본금
	private int allowance;	//수당

	public SalariedEmployee(){
	}
	//grade에 따라서 base,allowance를 계산해서 안 적음
	public SalariedEmployee(String name,String number,int grade){
		super(name,number);
		this.grade = grade;
	}
	public void setGrade(int grade){
		this.grade = grade;
	}
	public int getGrade(){
		return grade;
	}
	public int getBase(){			//base는 값만 계산하니까 set 안 만듬
		return base;
	}
	public int getAllowance(){		//allowance는 값만 계산하니까 set 안 만듬
		return allowance;
	}
	
	public void computeSalary(){
		//호봉에 따라 기본금과 수당 먼저 계산
		//급여 = 기본금 + 수당
		//1호봉부터 3호봉까지 있다고 가정
		//1:200,50
		//2:250,80
		//3:300,100
		switch(grade){
			case 1:base=200; allowance=50; break;
			case 2:base=250; allowance=80; break;
			case 3:base=300; allowance=100; break;
		}
		salary = base + allowance;
	}

	public String toString(){
		return super.toString() + ",호봉:" + grade + ",기본금:" + base + ",수당:" + allowance;
	}
	
}


class HourlyEmployee extends Employee
{
	private int base;	//시간당 임금
	private int time;	//일한 시간
	
	public HourlyEmployee(){
	}
	public HourlyEmployee(String name,String number,int base,int time){
		super(name,number);
		this.base = base;
		this.time = time;
	}
	
	public void setBase(int base){
		this.base = base;
	}
	public int getBase(){
		return base;
	}
	public void setTime(int time){
		this.time = time;
	}
	public int getTime(){
		return time;
	}
	/*
	public void computeSalary(){
		//(시간당 일한 직원)급여 = 시간당 임금 * 일한 시간
		salary = base * time;
	}*/

	public String toString(){
		return super.toString() + ",시간당 임금:" + base + ",일한 시간:" + time;
	}

}

class  EmployeeTestAbstractNoOverriding
{
	public static void main(String[] args) 
	{
		//상속관계에 있을 때에 부모클래스의 참조변수가 자식클래스의 객체를 참조 가능
		//사용자한테 월급제사원인지, 시간제사원인지 물어본 후에 데이터를 입력받아 처리
		//그럼 변수를 월급제 사원도 참조할 수 있고
		//시간제 사원도 참조할 수 있는 이것들의 부모인 Employee의 참조변수 만들면 됨

		
		//SalariedEmployee e1;
		//HourlyEmployee e1;
		
		Employee e1;  //이것이 SalariedEmployee,HourlyEmployee 다 할 수 있음
		Scanner sc = new Scanner(System.in);
		int type;
		//월급제:1, 시간제:2
		String name,number; //모두에게 필요한거니까 밖에 미리 만들기
		
		do{
			System.out.print("사원의 종류를 입력하세요.1:월급제 2:시간제==>");
			type = sc.nextInt();
		}while(type != 1 && type !=2);  //1,2만 받을 수 있도록,아니면 반복해서 물어보도록 -> case2가 아니라 default 사용
		

		System.out.print("이름을 입력하세요==>");	//모두에게 필요한거니까 밖에 미리 만들기
		name = sc.next();
		System.out.print("사원번호를 입력하세요==>");
		number = sc.next();
		
		/*
		switch(type){
			case 1:
				//String name,String number,int grade
				//1매개변수없이설정하고->setter
				//2생성시에 입력받기  O
				int grade;
				System.out.print("사원의 호봉을 입력하세요==>");
				grade = sc.nextInt();
				e1 = new SalariedEmployee(name,number,grade);
				break;

			default:
				//String name,String number,int base,int time
				int base,time;
				System.out.print("시간당 임금을 입력하세요==>");
				base = sc.nextInt();
				System.out.print("일한 시간을 입력하세요==>");
				time = sc.nextInt();
				e1 = new HourlyEmployee(name,number,base,time);
		}//end switch
		*/

		//if문으로 수정
		if(type == 1){
			int grade;
			System.out.print("사원의 호봉을 입력하세요==>");
			grade = sc.nextInt();
			e1 = new SalariedEmployee(name,number,grade);
		}else{
			int base,time;
			System.out.print("시간당 임금을 입력하세요==>");
			base = sc.nextInt();
			System.out.print("일한 시간을 입력하세요==>");
			time = sc.nextInt();
			e1 = new HourlyEmployee(name,number,base,time);
		}//end if

		e1.computeSalary();
		System.out.println(e1);
	}
}


/*
EmployeeTestAbstractNotOverriding.java:95: error: HourlyEmployee is not abstract and does not override abstract method computeSalary() in Employee
class HourlyEmployee extends Employee
^
1 error

===>추상클래스를 상속받았다면 반드시 모든 추상메소드를 오버라이딩 해야 함



*/