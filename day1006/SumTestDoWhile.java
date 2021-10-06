import java.util.Scanner;
class  SumTestDoWhile
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n,sum=0;
		System.out.print("N을 입력하시오==>");
		n = sc.nextInt();

		int i=1;
		do{
			sum += i;
			i++;		
		}while(i<=n);
		System.out.printf("1에서 %d까지의 합은 %d입니다.",n,sum);
	}
}
