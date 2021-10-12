/*배열의 요소가 자동으로 초기화 되듯이 
클래스의 멤버변수들도 자료형에 따라 정수는 0으로 실수는 0.0으로 boolean은 false로
자동으로 초기화 
=>balance에 바로 100 넣을 수 있음
*/



class BankAccount								//은행 계좌
{
	int balance;								//잔액을 표시하는 변수
	public void deposit(int amount){			//저금
		balance += amount;  //balance = balance + amount
	}
	
	//찾으려는 금액이 잔액보다 더 크다면 인출이 일어나지 않도록
	public void withdraw(int amount){			
		if(amount <= balance){
			balance -= amount;
		}else{
			System.out.println("잔액이 부족합니다.");
		}
	}

	public int getBalance(){					//잔액을 반환,getBalance 접근자
		return balance;
	}
	
	public void printBalance(){					//현재 잔액을 출력하는 메소드
		System.out.printf("현재잔액 : %d\n",balance);
	}

	//현재 잔액에 대하여 연7.5%의 이자를 계산하여 추가하는 메소드를 구현
	public void addInterest(){
		//balance = balance + balance*0.75;
		//balance = balance*1.075;
		balance *= 1.075;
	}
	
}


class BankAccountTest02
{
	
	
	public static void main(String[] args) 
	{
		//a1,a2두개의 BankAccount 객체 생성
		BankAccount a1 = new BankAccount();
		BankAccount a2 = new BankAccount();
		
		//a1의 계좌에 100원을 저금
		a1.deposit(100);

		//a2의 계좌에 50원 저금
		a2.deposit(50);

		//a1에서 60원 인출
		a1.withdraw(60);

		//a2에서 30원 인출
		a2.withdraw(30);

		//a1의 잔고를 얻어서 화면에 출력
		System.out.println(a1.getBalance());  //40

		//a2의 잔고를 얻어서 화면에 출력
		System.out.println(a2.getBalance());	//20
	
		//a1의 잔액를 출력
		a1.printBalance();
		//System.out.println(a1.printBalance());  이건 안됨
		//=> 반환값이 없는 메소드를 출력문에 호출할 수 없음

		//a2의 잔액을 출력
		a2.printBalance();

		//a1의 이자계산
		a1.addInterest();

		//a2의 이자계산
		a2.addInterest();

		//a1의 잔액을 출력
		a1.printBalance();		//43

		//a2의 잔액을 출력
		a2.printBalance();		//21

		//잔고보다 더 많은 금액을 인출
		//BankAccout클래스의 withdraw메소드가 변경되었을 때에 
		//그것을 호출하는 BankAccountTest의 내용 변경할 필요 없음
		a1.withdraw(100);
		a2.withdraw(100);

		a1.printBalance();
		a2.printBalance();
		
		
	}
}

/*
BankAccount 클래스 앞에 public을 추가하고 프로그램을 컴파일해보자. 어떤 오류 발생?
public을 붙이는 것과 붙이지 않는 것의 차이는 무엇?

BankAccountTest02.java:9: error: class BankAccount is public, should be declared in a file named BankAccount.java
public class BankAccount
                //은행 계좌
       ^
1 error

==>하나의 파일에 두개 이상의 클래스로 구성될 때에는 
반드시 main이 있는 클래스이름으로 파일명을 저장해야 하며 그 클래스만이 public이어야 함
*/