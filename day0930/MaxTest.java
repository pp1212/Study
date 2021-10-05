import java.util.Scanner;
class  MaxTest
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a,b,c,max;
		System.out.print("첫 번째수를 입력하시오==>");
		a = sc.nextInt();
		System.out.print("두 번째수를 입력하시오==>");
		b = sc.nextInt();
		System.out.print("세 번째수를 입력하시오==>");
		c = sc.nextInt();
		

		if(a>b){
			if(a>c){      //중첩선택문
			 max = a;
			}else{   //a>b중에 false->b가크다  중첩선택문에서 else가 오면 나랑 가장 가까운 if랑 대응
				max = c;
			}
		}else{
			if(b>c){
				max = b;
			}else{   //a>b중에 false->b가크다
				max = c;
			}
		}
		System.out.println("가장 큰 수는 "+ max +"입니다.");

	}
}
