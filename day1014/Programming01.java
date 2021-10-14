class Employee
{
	protected String name;
	protected String number;

	public Employee(){
	}
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

	public int computeSalary(){
		return 0;
	}

	public String toString(){
		return "이름:"+name +",사번:"+ number;
	}

}


class SalariedEmployee extends Employee
{
	private int salary;

	public SalariedEmployee(){
	}
	public SalariedEmployee(String name,String number,int salary){
		super(name,number);
		this.salary = salary;
	}
	public void setSalary(int salary){
		this.salary = salary;
	}
	public int getSalary(){
		return salary;
	}
	
	public int computeSalary(){
		return super.computeSalary() + salary/12;
	}

	public String toString(){
		return super.toString() +",월급:"+ salary;
	}
	
}


class HourlyEmployee extends Employee
{
	private int pay;
	private int hour;
	
	public HourlyEmployee(){
	}
	public HourlyEmployee(String name,String number,int pay,int hour){
		super(name,number);
		this.pay = pay;
		this.hour = hour;
	}
	
	public void setPay(int pay){
		this.pay = pay;
	}
	public int getPay(){
		return pay;
	}
	public void setHour(int hour){
		this.hour = hour;
	}
	public int getHour(){
		return hour;
	}
	
	public int computeSalary(){
		return super.computeSalary() + (pay * hour);
	}

	public String toString(){
		return super.toString() +",임금:"+ pay+",일한 시간:"+hour;
	}

}


class  Programming01
{
	public static void main(String[] args) 
	{
		Employee e = new Employee("홍길동","89-7");
		System.out.println(e);

		SalariedEmployee s = new SalariedEmployee("이순신","97-5",2000000);
		System.out.println(s);

		HourlyEmployee h = new HourlyEmployee("김유신","36-7",9000,8);
		System.out.println(h);
	}
}
