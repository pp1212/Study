import java.util.Scanner;
class  ConditionalOperator
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a,b,min;
		System.out.print("첫 번째 수를 입력하시오==>");
		a = sc.nextInt();
		System.out.print("두 번째 수를 입력하시오==>");
		b = sc.nextInt();
		min = (a>b)?b:a;  //(a<b)?a:b;

		System.out.println("작은 수는 " + min + "입니다.");
	}
}
