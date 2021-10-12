class BankAccount{
	int balance;    //double로 바꾸면 오류
	
	//1
	void deposit(int amount){   //생성자(값 변경)void setB(int i){balance = a}
		balance += amount;
	}

	//5
	void withdraw(int amount){
		if (balance <0){
			System.out.println("현재 잔고가 부족합니다.");
		}else{
			balance -= amount;
		}
	}
	
	int getBalance(){        //접근자 int getB(){return balance;}
		return balance;
	}

	//3
	void printBalance(){
		System.out.printf("현재 잔액: %d\n",balance);
	}

	//4
	void addInterest(){
		balance *= 1.075;
	} 
}



public class BankAccountTest{
	public static void main(String[] args) 
	{
		//2
		BankAccount a1 = new BankAccount();
		a1.balance = 100;
		a1.withdraw(60);
		System.out.printf("현재 잔고: %d\n",a1.getBalance());

		BankAccount a2 = new BankAccount();
		a2.balance = 50;
		a2.withdraw(30);
		System.out.printf("현재 잔고: %d\n",a2.getBalance());

		
		a1.addInterest();
		a1.printBalance();
	}
}


/* 
6번
현재 잔고: Exception in thread "main" java.util.IllegalFormatConversionException: d != java.lang.Double
        at java.base/java.util.Formatter$FormatSpecifier.failConversion(Formatter.java:4426)
        at java.base/java.util.Formatter$FormatSpecifier.printInteger(Formatter.java:2938)
        at java.base/java.util.Formatter$FormatSpecifier.print(Formatter.java:2892)
        at java.base/java.util.Formatter.format(Formatter.java:2673)
        at java.base/java.io.PrintStream.format(PrintStream.java:1053)
        at java.base/java.io.PrintStream.printf(PrintStream.java:949)
        at BankAccountTest.main(BankAccountTest.java:41)
  
7번
BankAccountTest.java:1: error: class BankAccount is public, should be declared in a file named BankAccount.java
public class BankAccount{
       ^
1 error
8번 오류

*/
