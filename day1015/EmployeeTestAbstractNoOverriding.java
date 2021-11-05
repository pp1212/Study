import java.util.Scanner;

//�߻�޼ҵ带 �����ϰ� �ֱ� ������ �߻�Ŭ������ �Ǿ�� ��
abstract class Employee
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

	public abstract void computeSalary();  
	//body�� ��üȭ �� �� ���� �޼ҵ�� �߻�޼ҵ�� ����
	//�̷��� ��������� �ڽ�Ŭ�������� �ڽſ��� �˸µ��� �ڹݵ�� �������̵� �ؾ� ��(�ڽ�Ŭ������ ���� ����)
	

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
	/*
	public void computeSalary(){
		//(�ð��� ���� ����)�޿� = �ð��� �ӱ� * ���� �ð�
		salary = base * time;
	}*/

	public String toString(){
		return super.toString() + ",�ð��� �ӱ�:" + base + ",���� �ð�:" + time;
	}

}

class  EmployeeTestAbstractNoOverriding
{
	public static void main(String[] args) 
	{
		//��Ӱ��迡 ���� ���� �θ�Ŭ������ ���������� �ڽ�Ŭ������ ��ü�� ���� ����
		//��������� �������������, �ð���������� ��� �Ŀ� �����͸� �Է¹޾� ó��
		//�׷� ������ ������ ����� ������ �� �ְ�
		//�ð��� ����� ������ �� �ִ� �̰͵��� �θ��� Employee�� �������� ����� ��

		
		//SalariedEmployee e1;
		//HourlyEmployee e1;
		
		Employee e1;  //�̰��� SalariedEmployee,HourlyEmployee �� �� �� ����
		Scanner sc = new Scanner(System.in);
		int type;
		//������:1, �ð���:2
		String name,number; //��ο��� �ʿ��ѰŴϱ� �ۿ� �̸� �����
		
		do{
			System.out.print("����� ������ �Է��ϼ���.1:������ 2:�ð���==>");
			type = sc.nextInt();
		}while(type != 1 && type !=2);  //1,2�� ���� �� �ֵ���,�ƴϸ� �ݺ��ؼ� ������� -> case2�� �ƴ϶� default ���
		

		System.out.print("�̸��� �Է��ϼ���==>");	//��ο��� �ʿ��ѰŴϱ� �ۿ� �̸� �����
		name = sc.next();
		System.out.print("�����ȣ�� �Է��ϼ���==>");
		number = sc.next();
		
		/*
		switch(type){
			case 1:
				//String name,String number,int grade
				//1�Ű��������̼����ϰ�->setter
				//2�����ÿ� �Է¹ޱ�  O
				int grade;
				System.out.print("����� ȣ���� �Է��ϼ���==>");
				grade = sc.nextInt();
				e1 = new SalariedEmployee(name,number,grade);
				break;

			default:
				//String name,String number,int base,int time
				int base,time;
				System.out.print("�ð��� �ӱ��� �Է��ϼ���==>");
				base = sc.nextInt();
				System.out.print("���� �ð��� �Է��ϼ���==>");
				time = sc.nextInt();
				e1 = new HourlyEmployee(name,number,base,time);
		}//end switch
		*/

		//if������ ����
		if(type == 1){
			int grade;
			System.out.print("����� ȣ���� �Է��ϼ���==>");
			grade = sc.nextInt();
			e1 = new SalariedEmployee(name,number,grade);
		}else{
			int base,time;
			System.out.print("�ð��� �ӱ��� �Է��ϼ���==>");
			base = sc.nextInt();
			System.out.print("���� �ð��� �Է��ϼ���==>");
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

===>�߻�Ŭ������ ��ӹ޾Ҵٸ� �ݵ�� ��� �߻�޼ҵ带 �������̵� �ؾ� ��



*/