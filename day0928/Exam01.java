import java.util.Scanner;
class  Exam01
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int data,a,b,c,d;
		System.out.print("10000미만의 정수를 입력하시오: ");
		data = sc.nextInt();
		
		a = data / 1000;
		b = (data % 1000) / 100;
		c = ((data % 1000) % 100) / 10;
		d = (((data % 1000) % 100) % 10) / 1;

		System.out.println("천의 자리: " + a);
		System.out.println("백의 자리: " + b);
		System.out.println("십의 자리: " + c);
		System.out.println("일의 자리: " + d);








	}
}
