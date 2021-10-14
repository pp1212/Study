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
	public Person(){
		
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
	
	//부모로부터 받은 것 + 내가 추가한 것
	public Customer(String name,String addr,String phone,String number,double mileage){       
		super(name,addr,phone);  //이렇게 하면 기본생성자가 아닌 매개변수3개짜리 동작
		this.number=number;
		this.mileage=mileage;
	}
	public Customer(){
		
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
		System.out.printf("이름:%s\n",name);
		System.out.printf("주소:%s\n",addr);
		System.out.printf("전화:%s\n",phone);
		System.out.printf("번호:%s\n",number);
		System.out.printf("마일리지:%.1f\n",mileage);
	}
}

class  InheritanceTestCustomerConstructor
{
	public static void main(String[] args) 
	{
		
		//(String name,String addr,String phone,String number,double mileage)
		Customer c = new Customer("홍길동","서울","010-1234-5678","A1234",1000);

		c.printCustomer();
	}
}
