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
	
	public void withdraw(int amount){			//인출
		balance -= amount;
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


class BankAccountTest 
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
		a1.withdraw(100);

		a2.withdraw(100);

		a1.printBalance();
		a2.printBalance();
		/*
			현재잔액 : -57
			현재잔액 : -79
		*/


	}
}
