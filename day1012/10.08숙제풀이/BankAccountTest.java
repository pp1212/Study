/*�迭�� ��Ұ� �ڵ����� �ʱ�ȭ �ǵ��� 
Ŭ������ ��������鵵 �ڷ����� ���� ������ 0���� �Ǽ��� 0.0���� boolean�� false��
�ڵ����� �ʱ�ȭ 
=>balance�� �ٷ� 100 ���� �� ����
*/



class BankAccount								//���� ����
{
	int balance;								//�ܾ��� ǥ���ϴ� ����
	public void deposit(int amount){			//����
		balance += amount;  //balance = balance + amount
	}
	
	public void withdraw(int amount){			//����
		balance -= amount;
	}

	public int getBalance(){					//�ܾ��� ��ȯ,getBalance ������
		return balance;
	}
	
	public void printBalance(){					//���� �ܾ��� ����ϴ� �޼ҵ�
		System.out.printf("�����ܾ� : %d\n",balance);
	}

	//���� �ܾ׿� ���Ͽ� ��7.5%�� ���ڸ� ����Ͽ� �߰��ϴ� �޼ҵ带 ����
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
		//a1,a2�ΰ��� BankAccount ��ü ����
		BankAccount a1 = new BankAccount();
		BankAccount a2 = new BankAccount();
		
		//a1�� ���¿� 100���� ����
		a1.deposit(100);

		//a2�� ���¿� 50�� ����
		a2.deposit(50);

		//a1���� 60�� ����
		a1.withdraw(60);

		//a2���� 30�� ����
		a2.withdraw(30);

		//a1�� �ܰ� �� ȭ�鿡 ���
		System.out.println(a1.getBalance());  //40

		//a2�� �ܰ� �� ȭ�鿡 ���
		System.out.println(a2.getBalance());	//20
	
		//a1�� �ܾ׸� ���
		a1.printBalance();
		//System.out.println(a1.printBalance());  �̰� �ȵ�
		//=> ��ȯ���� ���� �޼ҵ带 ��¹��� ȣ���� �� ����

		//a2�� �ܾ��� ���
		a2.printBalance();

		//a1�� ���ڰ��
		a1.addInterest();

		//a2�� ���ڰ��
		a2.addInterest();

		//a1�� �ܾ��� ���
		a1.printBalance();		//43

		//a2�� �ܾ��� ���
		a2.printBalance();		//21

		//�ܰ��� �� ���� �ݾ��� ����
		a1.withdraw(100);

		a2.withdraw(100);

		a1.printBalance();
		a2.printBalance();
		/*
			�����ܾ� : -57
			�����ܾ� : -79
		*/


	}
}
