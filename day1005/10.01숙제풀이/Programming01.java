import java.util.Scanner;
class Programming01 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		char op;
		int a,b;
		System.out.print("연산자를 입력하세요==>");
		op = sc.next().charAt(0);

		System.out.print("첫 번째 수를 입력해주세요==>");
		a = sc.nextInt();
		System.out.print("두 번째 수를 입력해주세요==>");
		b = sc.nextInt();

		if (op=='+'){
			System.out.println(a + "+" + b + "=" + (a+b));
		}else if (op=='-'){  //if를 하면 +했는데 굳이 또 물어보는게 되니까 else if로
			System.out.println(a + "-" + b + "=" + (a-b));
		}else if (op=='*'){
			System.out.println(a + "*" + b + "=" + (a*b));
		}else if (op=='/'){
			if (b==0){
				System.out.println("분모가 0이 될수는 없습니다.");
			}else{
				System.out.println(a + "/" + b + "=" + (a/b));
			}
		}else{
			System.out.println("잘못된 연산자 입니다.");  //+,-,*,/말고 다른 연산자 입력했을 떄
		}
		
	}
}
