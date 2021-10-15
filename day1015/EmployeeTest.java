class Employee
{
	protected String name;
	protected String number;
	protected int salary;    

	public Employee(){
	}
	//salary�� ���� ����ϴϱ� �Ű������� ������ �ʴ´�
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
	public int getSalary(){   //salary�� ���� ����ϴϱ� set �� ����
		return salary;
	}

	public void computeSalary(){
		//�� ���� ������ ��üȭ �� �� ����,����д�
	}

	public String toString(){
		return "�̸�:" + name + ",�����ȣ:" + number + ",�޿�:" + salary;
	}

}


class SalariedEmployee extends Employee
{
	//������ ȣ���� ���� ����� �⺻������ ���
	private int grade;		//ȣ��
	private int base;		//�⺻��
	private int allowance;	//����

	public SalariedEmployee(){
	}
	//grade�� ���� base,allowance�� ����ؼ� �� ����
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
	public int getBase(){			//base�� ���� ����ϴϱ� set �� ����
		return base;
	}
	public int getAllowance(){		//allowance�� ���� ����ϴϱ� set �� ����
		return allowance;
	}
	
	public void computeSalary(){
		//ȣ���� ���� �⺻�ݰ� ���� ���� ���
		//�޿� = �⺻�� + ����
		//1ȣ������ 3ȣ������ �ִٰ� ����
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
		return super.toString() + ",ȣ��:" + grade + ",�⺻��:" + base + ",����:" + allowance;
	}
	
}


class HourlyEmployee extends Employee
{
	private int base;	//�ð��� �ӱ�
	private int time;	//���� �ð�
	
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
		//(�ð��� ���� ����)�޿� = �ð��� �ӱ� * ���� �ð�
		salary = base * time;
	}

	public String toString(){
		return super.toString() + ",�ð��� �ӱ�:" + base + ",���� �ð�:" + time;
	}

}

class  EmployeeTest
{
	public static void main(String[] args) 
	{
		//������ ���
		//public SalariedEmployee(String name,String number,int grade)
		SalariedEmployee e1 = new SalariedEmployee("����ȣ","A1234",2);
		

		//�ð��� ���
		//public HourlyEmployee(String name,String number,int base,int time)
		HourlyEmployee e2 = new HourlyEmployee("�����","B1000",100000,30);
		System.out.println(e1);
		System.out.println(e2);
		System.out.println("=================================");
		e1.computeSalary();
		e2.computeSalary();
		System.out.println(e1);
		System.out.println(e2);
	}
}
