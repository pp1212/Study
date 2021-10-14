//접근명시자 붙여서 c.name 직접 접근 못하고 c.setName set,get으로 접근
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

}



class  InheritanceTestCustomer02
{
	public static void main(String[] args) 
	{
		Customer c = new Customer();

		c.setName("홍길동");
		c.setAddr("서울시 마포구 서교동 1234");
		c.setPhone("010-1234-5678");
		c.setNumber("A123");
		c.setMileage(100);

		System.out.printf("고객이름: %s\n",c.getName());
		System.out.printf("고객주소: %s\n",c.getAddr());
		System.out.printf("고객전화: %s\n",c.getPhone());
		System.out.printf("고객번호: %s\n",c.getNumber());
		System.out.printf("마일리지: %.1f\n",c.getMileage());
	}
}
