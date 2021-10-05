import java.util.Scanner;
class  PoundToGram
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		double pound,gram;
		System.out.print("몸무게를 파운드로 입력하시오==>");
		pound = sc.nextDouble();
		gram = pound * 454;

		System.out.println("몸무게는 "+ gram +"g입니다");



		
	}
}
