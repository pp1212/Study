import java.util.Scanner;
class  Exam03
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num,price;
		System.out.print("������ ������ ������ �Է��ϼ���==>");
		num = sc.nextInt();
		price = num*100;

		if (num>=10){
			System.out.println("10% ���εǾ �� "+ (price*0.9) +"�� �Դϴ�.");
		}else{
			System.out.println("�� "+ price +"�� �Դϴ�.");
		}
	}
}
