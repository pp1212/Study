import java.util.Scanner;
class  Exam01
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String i="";
		double a,b;
		System.out.print("�ϳ��� ���ڸ� �Է����ּ���==>");
		i = sc.next();
		System.out.print("ù ��° ���ڸ� �Է����ּ���==>");
		a = sc.nextDouble();
		System.out.print("�� ��° ���ڸ� �Է����ּ���==>");
		b = sc.nextDouble();

		if (i.equals("+")){
			System.out.println(a+b);
		}else if (i.equals("-")){
			System.out.println(a-b);
		}else if (i.equals("*")){
			System.out.println(a*b);
		}else if (i.equals("/")){
			if (a==0){
				System.out.println("�߸��� �Է��Դϴ�");
			}else{
				System.out.println(a/b);
			}
		}
		
		
	}
}
