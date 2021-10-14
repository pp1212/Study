class Person
{
	protected String name;
	protected String addr;
	protected String phone;
	public Person(String name,String addr,String phone){
		this.name=name;
		this.addr=addr;
		this.phone=phone;
	}
	
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setAddr(String addr){
		this.addr=addr;
	}
	public String getAddr(){
		return addr;
	}
	public void setPhone(String phone){
		this.phone=phone;
	}
	public String getPhone(){
		return phone;
	}
}

class Customer extends Person
{
	private String number;
	private double mileage;
	
	//�θ�κ��� ���� �� + ���� �߰��� ��
	public Customer(String name,String addr,String phone,String number,double mileage){       
		//super(name,addr,phone); �̰� �� ����� super()�� �Ǿ� �⺻������ �䱸�ϴµ� ������ ����
		this.number=number;
		this.mileage=mileage;
	}
	public Customer(){
		//���⵵ super()�� �Ǿ� �⺻������ �䱸�ϴµ� ������ ����
	}

	public void setNumber(String number){
		this.number=number;
	}
	public String getNumber(){
		return number;	
	}
	public void setMileage(double mileage){
		this.mileage=mileage;
	}
	public double getMileage(){
		return mileage;
	}

	public void printCustomer(){
		System.out.printf("�̸�:%s\n",name);
		System.out.printf("�ּ�:%s\n",addr);
		System.out.printf("��ȭ:%s\n",phone);
		System.out.printf("��ȣ:%s\n",number);
		System.out.printf("���ϸ���:%.1f\n",mileage);
	}
}

class  InheritanceTestCustomerConstructor02
{
	public static void main(String[] args) 
	{
		
		//(String name,String addr,String phone,String number,double mileage)
		Customer c = new Customer("ȫ�浿","����","010-1234-5678","A1234",1000);

		c.printCustomer();
	}
}


/*
InheritanceTestCustomerConstructor02.java:38: error: constructor Person in class Person cannot be applied to given types;
        public Customer(String name,String addr,String phone,String number,double mileage){
                                                                                          ^
  required: String,String,String
  found: no arguments
  reason: actual and formal argument lists differ in length
InheritanceTestCustomerConstructor02.java:43: error: constructor Person in class Person cannot be applied to given types;
        public Customer(){
                         ^
  required: String,String,String
  found: no arguments
  reason: actual and formal argument lists differ in length
2 errors


�ڽ�Ŭ������ �������� ù��° �ٿ��� �ƹ��� ���� ���� �ʾƵ� 
�θ��� �⺻�����ڸ� �䱸�ϴ� super()��� ���� ����
���� Ŭ���������� �θ�Ŭ������ Person�� �⺻������ ������ �ʾƼ� ���� �߻�

�ʿ��ϴٸ� �ڽ��� �����ڿ��� 
	1 �θ��� �Ű������� ���� �����ڸ� �䱸
	2 �θ�Ŭ�������� �⺻������ ���� �� ����
*/