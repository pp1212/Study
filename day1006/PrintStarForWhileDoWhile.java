import java.util.Scanner;
class  PrintStarForWhileDoWhile
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n; //�ټ�
		int i,j;
		System.out.print("N�� �Է��ϼ���==>");
		n = sc.nextInt();

		/*
		for (i=1 ; i<=n ; i++ ){   //n�� 7�̸� 7�� ����
			for (j=1 ; j<=i ; j++ ){
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		

		/*
		i=1;
		while (i<=n){
			j=1;
			while(j<=i){
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
		*/


		i=1;
		do{
			j=1;
			do{
				System.out.print("*");
				j++;
			}while(j<=i);
			System.out.println();
			i++;
		}while(i<=n);


	}
}
