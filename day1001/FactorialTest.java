import java.util.Scanner;
class  FactorialTest
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n,sum=1;  //���ϱ� �ؾ� �Ǵϱ� 1�̾�� ��
		System.out.print("N�� �Է��ϼ���==>");
		n = sc.nextInt();
		
		for(int i=n ; i>=1 ; i--){   //i:5,4,3,2,1 �ϱ� ���ؼ�
			sum *= i;  //sum = sum*i
			System.out.print(i);
			if(i!=1){
				System.out.print("*");
			}
		}
		System.out.println("=" + sum);
	}
}
