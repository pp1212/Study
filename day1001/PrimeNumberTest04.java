import java.util.Scanner;
class  PrimeNumberTest04
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n,i; //for�ۿ����� ����ϱ� ���� ���� ����
		System.out.print("N�� �Է��ϼ���==>");
		n = sc.nextInt();
		
		for (i=2 ; i<n ; i++ ){  //�ڱ��ڽ����� ������ �ȵ�
			if(n%i==0){
				break;
			}
		}

		
		if(i==n){     //�Ҽ��� �ƴ϶�� ������ Ż���ϱ� ������, �ڱ��ڽŰ� ���ٸ�->������ ���� ���� �Ҽ�
			System.out.println(n+"�� �Ҽ��Դϴ�.");
		}else{
			System.out.println(n+"�� �Ҽ��� �ƴմϴ�.");
		}
	}
}

/*���� n�� ���� 100�̶�� �����ϸ�
12���� �ݺ������� i�� 2�϶� 13���� ���ǽ��� �����Ͽ� flag�� false�� ����
�̹� i�� 2�϶� n�� �Ҽ��� �ƴ��� ������
�׷��� ���� i�� �������Ѽ� ��� ��� �ʿ� ����

=>flag�� false�� ��� ���� �ݺ��� Ż�� �ϵ��� �ϴ°� ����
*/