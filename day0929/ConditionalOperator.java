import java.util.Scanner;
class  ConditionalOperator
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a,b,min;
		System.out.print("ù ��° ���� �Է��Ͻÿ�==>");
		a = sc.nextInt();
		System.out.print("�� ��° ���� �Է��Ͻÿ�==>");
		b = sc.nextInt();
		min = (a>b)?b:a;  //(a<b)?a:b;

		System.out.println("���� ���� " + min + "�Դϴ�.");
	}
}
