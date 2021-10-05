import java.util.Scanner;
class  IfTestPositive
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("임의의 수 N을 입력하시오==>");
		n = sc.nextInt();

		if(n>=0){
			System.out.println(n+100);
		}else{
			System.out.println(n*n);
		}
		System.out.println("작업종료");
	}
}
