import java.util.Scanner;
class  ArithmeticUserInput
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		int add;
		int sub;
		int multi;
		int div;
		int mode;
		System.out.print("ù��° ���� �Է��Ͻÿ�==>");   //println���� ln����� �����ٷ� �ȹٲ�
		a = sc.nextInt();
		System.out.print("�ι�° ���� �Է��Ͻÿ�==>");
		b = sc.nextInt();

		add = a+b;
		sub = a-b;
		multi = a*b;
		div = a/b;
		mode = a%b;
		System.out.println("*** ��Ģ ���� ��� ***");
		System.out.println(a+"+"+b+"="+add);
		System.out.println(a+"-"+b+"="+sub);
		System.out.println(a+"*"+b+"="+multi);
		System.out.println(a+"/"+b+"="+div);
		System.out.println(a+"%"+b+"="+mode);

	}
}
