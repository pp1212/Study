import java.util.Scanner;
class Programming09
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		double x,result;
		System.out.print("x를 입력하세요==>");
		x = sc.nextInt();
		if (x <= 0){
			result = (x*x*x) - (9*x) +2;
		}else{
			result = (7*x) +2;
		}
		System.out.println("결과:" + result);
	}
}
