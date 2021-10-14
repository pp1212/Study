//
class Person
{
	private String name;
	private String addr;
	private String phone;

	public void setName(String name){
		this.name =name;
	}
	public String getName(){
		return name;
	}
	public void setAddr(String addr){
		this.addr =addr;
	}
	public String getAddr(){
		return addr;
	}
	public void setPhone(String phone){
		this.phone =phone;
	}
	public String getPhone(){
		return phone;
	}
}


class Customer extends Person
{
	private String number;
	private double mileage;


	public void setNumber(String number){    
		this.number =number;
	}
	public String getNumber(){
		return number;
	}
	public void setMileage(int mileage){
		this.mileage =mileage;
	}
	public double getMileage(){
		return mileage;
	}

	public void printCustomer(){
		System.out.printf("고객이름: %s\n",name);    //name으로 못씀,자식클래스여도 부모의 private에 접근 못함
		System.out.printf("고객주소: %s\n",addr);
		System.out.printf("고객전화: %s\n",phone);
		System.out.printf("고객번호: %s\n",number);
		System.out.printf("마일리지: %.1f\n",mileage);
	}
}



class  InheritanceTestCustomer03
{
	public static void main(String[] args) 
	{
		Customer c = new Customer();

		c.setName("홍길동");
		c.setAddr("서울시 마포구 서교동 1234");
		c.setPhone("010-1234-5678");
		c.setNumber("A123");
		c.setMileage(100);

		c.printCustomer();
	}
}

/*
InheritanceTestCustomer03.java:49: error: name has private access in Person
                System.out.printf("고객이름: %s\n",name);    //name으로 못씀,자식클래스여 도 부모의 private에 접근 못함
                                               ^
InheritanceTestCustomer03.java:50: error: addr has private access in Person
                System.out.printf("고객주소: %s\n",addr);
                                               ^
InheritanceTestCustomer03.java:51: error: phone has private access in Person
                System.out.printf("고객전화: %s\n",phone);
                                               ^
3 errors

아무리 상속받은 자식클래스여도 부모클래스의 private영역에는 접근 불가

만약 어떠한 클래스 설계할 때 상속염두하고
상속받은 클래스에게는 접근 허용,외부의 다른 클래스들에게는 접근 허용하지 않는 멤버 있으면
protected에 둠
*/