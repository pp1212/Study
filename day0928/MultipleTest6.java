import java.util.Scanner;
class  MultipleTest6
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("임의의 수 N을 입력하세요==>");
		n = sc.nextInt();  //n에 입력받은 수 저장

		boolean result;

		result = n % 6 == 0;
		System.out.println(result);
	}
}
