import java.util.Scanner;
class  MultipleTest6
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("������ �� N�� �Է��ϼ���==>");
		n = sc.nextInt();  //n�� �Է¹��� �� ����

		boolean result;

		result = n % 6 == 0;
		System.out.println(result);
	}
}
