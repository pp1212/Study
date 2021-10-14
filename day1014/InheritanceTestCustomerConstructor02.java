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
	
	//부모로부터 받은 것 + 내가 추가한 것
	public Customer(String name,String addr,String phone,String number,double mileage){       
		//super(name,addr,phone); 이걸 안 만들면 super()가 되어 기본생성자 요구하는데 없으면 오류
		this.number=number;
		this.mileage=mileage;
	}
	public Customer(){
		//여기도 super()가 되어 기본생성자 요구하는데 없으면 오류
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

class  InheritanceTestCustomerConstructor02
{
	public static void main(String[] args) 
	{
		
		//(String name,String addr,String phone,String number,double mileage)
		Customer c = new Customer("홍길동","서울","010-1234-5678","A1234",1000);

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


자식클래스의 생성자의 첫번째 줄에는 아무런 말을 쓰지 않아도 
부모의 기본생성자를 요구하는 super()라는 말이 생략
위의 클래스에서는 부모클래스인 Person에 기본생성자 만들지 않아서 오류 발생

필요하다면 자식의 생성자에서 
	1 부모의 매개변수를 갖는 생성자를 요구
	2 부모클래스에서 기본생성자 만들 수 있음
*/