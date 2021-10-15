class Employee
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

	public void computeSalary(){
		//이 안의 내용을 구체화 할 수 없음,비워둔다
	}

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
	
	public void computeSalary(){
		//(시간당 일한 직원)급여 = 시간당 임금 * 일한 시간
		salary = base * time;
	}

	public String toString(){
		return super.toString() + ",시간당 임금:" + base + ",일한 시간:" + time;
	}

}

class  EmployeeTest
{
	public static void main(String[] args) 
	{
		//월급제 사원
		//public SalariedEmployee(String name,String number,int grade)
		SalariedEmployee e1 = new SalariedEmployee("최현호","A1234",2);
		

		//시간제 사원
		//public HourlyEmployee(String name,String number,int base,int time)
		HourlyEmployee e2 = new HourlyEmployee("김수연","B1000",100000,30);
		System.out.println(e1);
		System.out.println(e2);
		System.out.println("=================================");
		e1.computeSalary();
		e2.computeSalary();
		System.out.println(e1);
		System.out.println(e2);
	}
}
