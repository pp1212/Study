import java.util.Scanner;
class  Exam01
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String i="";
		double a,b;
		System.out.print("하나의 문자를 입력해주세요==>");
		i = sc.next();
		System.out.print("첫 번째 숫자를 입력해주세요==>");
		a = sc.nextDouble();
		System.out.print("두 번째 숫자를 입력해주세요==>");
		b = sc.nextDouble();

		if (i.equals("+")){
			System.out.println(a+b);
		}else if (i.equals("-")){
			System.out.println(a-b);
		}else if (i.equals("*")){
			System.out.println(a*b);
		}else if (i.equals("/")){
			if (a==0){
				System.out.println("잘못된 입력입니다");
			}else{
				System.out.println(a/b);
			}
		}
		
		
	}
}
