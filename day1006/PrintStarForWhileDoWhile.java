import java.util.Scanner;
class  PrintStarForWhileDoWhile
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n; //줄수
		int i,j;
		System.out.print("N을 입력하세요==>");
		n = sc.nextInt();

		/*
		for (i=1 ; i<=n ; i++ ){   //n이 7이면 7줄 동작
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
