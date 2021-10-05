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
		System.out.print("첫번째 수를 입력하시오==>");   //println에서 ln지우면 다음줄로 안바뀜
		a = sc.nextInt();
		System.out.print("두번째 수를 입력하시오==>");
		b = sc.nextInt();

		add = a+b;
		sub = a-b;
		multi = a*b;
		div = a/b;
		mode = a%b;
		System.out.println("*** 오칙 연산 결과 ***");
		System.out.println(a+"+"+b+"="+add);
		System.out.println(a+"-"+b+"="+sub);
		System.out.println(a+"*"+b+"="+multi);
		System.out.println(a+"/"+b+"="+div);
		System.out.println(a+"%"+b+"="+mode);

	}
}
