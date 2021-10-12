import java.util.Scanner;
class  Exam03
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num,price;
		System.out.print("구입한 물건의 개수를 입력하세요==>");
		num = sc.nextInt();
		price = num*100;

		if (num>=10){
			System.out.println("10% 할인되어서 총 "+ (price*0.9) +"원 입니다.");
		}else{
			System.out.println("총 "+ price +"원 입니다.");
		}
	}
}
