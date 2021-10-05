import java.util.Scanner;
class  ConditionalEvenOddTest
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("임의의 수 N을 입력하시오==>");
		n = sc.nextInt();
		//System.out.println(n + "은" + ( (n % 2 == 0)?"짝수":"홀수" )+ "입니다");
		String result = (n%2==0)?"짝수":"홀수";
		System.out.println(n + "은" + result + "입니다");
	}
}
