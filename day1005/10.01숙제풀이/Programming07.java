import java.util.Scanner;
class Programming07 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a,b,c,min;
		System.out.print("첫 번째 수를 입력하시오==>");
		a = sc.nextInt();
		System.out.print("두 번째 수를 입력하시오==>");
		b = sc.nextInt();
		System.out.print("세 번째 수를 입력하시오==>");
		c = sc.nextInt();
		
		//  3번째 방법
		if (a<b && a<c){
			min = a;
		}else if(b<a && b<c){
			min = b;
		}else{
			min = c;
		}
		
		/* 2번째 방법
		if (a>b){
			if (b>c){
				min = c;
			}else{
				min = b;
			}
		}else{
			if (a>c){
				min = c;
			}else{
				min = a;
			}
		}*/

		/*  1번째 방법
		if (a<b){
			if (a<c){
				min = a;
			}else{
				min = c;
			}
		}else{
			if (b<c){
				min = b;
			}else{
				min = c;
			}
		}*/
		System.out.println("가장 작은 수는 "+ min + "입니다.");
	}
}
