import java.util.Scanner;
class  Exam06
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		double weight, height, std;
		System.out.print("키를 입력하시오==>");
			height = sc.nextDouble();
		System.out.print("몸무게를 입력하시오==>");
			weight = sc.nextDouble();
		std = (height - 100) * 0.9;

		if(weight < std){
			System.out.println("저체중입니다.");
		}else if(weight == std){
			System.out.println("표준체중입니다.");
		}else if(weight > std){
			System.out.println("과체중입니다.");
		}
	}
}
