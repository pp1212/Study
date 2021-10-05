import java.util.Scanner;
class  MinTest
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a,b;
		System.out.print("첫번째수를 입력하시오==>");
		a = sc.nextInt();
		System.out.print("두번째수를 입력하시오==>");
		b = sc.nextInt();
		
		if(a < b)
			System.out.println("작은수는 " + a + "입니다.");
		else
			System.out.println("작은수는 " + b + "입니다.");
		
	}
}
