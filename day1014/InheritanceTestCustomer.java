class Person
{
	String name;
	String addr;
	String phone;
}


class Customer extends Person
{
	String cnumber;
	double mileage;
}



class  InheritanceTestCustomer
{
	public static void main(String[] args) 
	{
		Customer c = new Customer();

		c.name="홍길동";
		c.addr="서울시 마포구 서교동 1234";
		c.phone="010-1234-5678";
		c.cnumber="A123";
		c.mileage=100;

		System.out.printf("고객이름: %s\n",c.name);
		System.out.printf("고객주소: %s\n",c.addr);
		System.out.printf("고객전화: %s\n",c.phone);
		System.out.printf("고객번호: %s\n",c.cnumber);
		System.out.printf("마일리지: %.1f\n",c.mileage);
	}
}
