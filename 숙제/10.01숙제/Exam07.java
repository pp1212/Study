import java.util.Scanner;
class Exam07 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a,b,c,min;
		System.out.print("첫 번째수를 입력하시오==>");
		a = sc.nextInt();
		System.out.print("두 번째수를 입력하시오==>");
		b = sc.nextInt();
		System.out.print("세 번째수를 입력하시오==>");
		c = sc.nextInt();

		if (a<b){
			if (a<c){
				min = a;
			}else{
				min = c;
			}
		}else{
			if(b<c){
				min = b;
			}else{
				min = c;
			}
		}
		System.out.println("가장 작은 수는" + min + "입니다.");
	}
}
