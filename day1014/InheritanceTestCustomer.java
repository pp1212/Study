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

		c.name="ȫ�浿";
		c.addr="����� ������ ������ 1234";
		c.phone="010-1234-5678";
		c.cnumber="A123";
		c.mileage=100;

		System.out.printf("���̸�: %s\n",c.name);
		System.out.printf("���ּ�: %s\n",c.addr);
		System.out.printf("����ȭ: %s\n",c.phone);
		System.out.printf("����ȣ: %s\n",c.cnumber);
		System.out.printf("���ϸ���: %.1f\n",c.mileage);
	}
}
