class BankAccount
{
	private String name;
	private String number;
	private double balance;
	private double rate;

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
	public void setBalance(double balance){
		this.balance=balance;
	}
	public double getBalance(){
		return balance;
	}
	public void setRate(double rate){
		this.rate=rate;
	}
	public double getRate(){
		return rate;
	}



	
	public BankAccount(String name,String number,double balance,double rate){
		this.name=name;
		this.number=number;
		this.balance=balance;
		this.rate=rate;
	}
	public BankAccount(){
		/*name="ȫ�浿";
		number="123456";
		balance=10000;
		rate=0.2;*/
		this("ȫ�浿","123456",10000,0.2);
	}

	public String toString(){
		return "[name:"+ name + ",number:" + number +",balance:"+ balance + ",rate:"+ rate + "]";
	}
}

class BankAccountTest 
{
	public static void main(String[] args) 
	{
		BankAccount a1 = new BankAccount("�̰ǿ�","123457",1000000,5.0);
		BankAccount a2 = new BankAccount();

		System.out.println(a1);
		System.out.println(a2);

		a2.setName("�����");
		a2.setNumber("123458");
		a2.setBalance(10000000);
		a2.setRate(3.5);
		System.out.println(a2);
	}
}
