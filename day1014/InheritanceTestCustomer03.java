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
		System.out.printf("���̸�: %s\n",name);    //name���� ����,�ڽ�Ŭ�������� �θ��� private�� ���� ����
		System.out.printf("���ּ�: %s\n",addr);
		System.out.printf("����ȭ: %s\n",phone);
		System.out.printf("����ȣ: %s\n",number);
		System.out.printf("���ϸ���: %.1f\n",mileage);
	}
}



class  InheritanceTestCustomer03
{
	public static void main(String[] args) 
	{
		Customer c = new Customer();

		c.setName("ȫ�浿");
		c.setAddr("����� ������ ������ 1234");
		c.setPhone("010-1234-5678");
		c.setNumber("A123");
		c.setMileage(100);

		c.printCustomer();
	}
}

/*
InheritanceTestCustomer03.java:49: error: name has private access in Person
                System.out.printf("���̸�: %s\n",name);    //name���� ����,�ڽ�Ŭ������ �� �θ��� private�� ���� ����
                                               ^
InheritanceTestCustomer03.java:50: error: addr has private access in Person
                System.out.printf("���ּ�: %s\n",addr);
                                               ^
InheritanceTestCustomer03.java:51: error: phone has private access in Person
                System.out.printf("����ȭ: %s\n",phone);
                                               ^
3 errors

�ƹ��� ��ӹ��� �ڽ�Ŭ�������� �θ�Ŭ������ private�������� ���� �Ұ�

���� ��� Ŭ���� ������ �� ��ӿ����ϰ�
��ӹ��� Ŭ�������Դ� ���� ���,�ܺ��� �ٸ� Ŭ�����鿡�Դ� ���� ������� �ʴ� ��� ������
protected�� ��
*/