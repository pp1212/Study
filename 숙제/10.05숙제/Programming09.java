import java.util.Scanner;
class  Programming09
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		double x,result;
		System.out.print("실수 x를 입력하세요==>");
		x = sc.nextDouble();
		if (x > 0){
			result = 7 * x + 2;
		}else{
			result = (x*x*x) - (9 * x) + 2;
		}
		System.out.println("결과: " + result);
	}
}
