import java.util.Scanner;
class  PrintFactorialWhile
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n,sum=1;
		System.out.print("N을 입력하시오==>");
		n = sc.nextInt();

		int i=n;
		while(i>=1){
			System.out.print(i);
			if(i != 1){
				System.out.print("*");
			}
			sum *= i;
			i--;
		}
		System.out.println("=" + sum);
	}
}
