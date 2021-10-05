import java.util.Scanner;
class  TimeTest
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int sec,min,hour;
		System.out.print("시간을 초단위로 입력하시오:");
		sec = input.nextInt();
		
		hour = sec / 3600;
		min = (sec%3600) / 60;
		sec = (sec%3600) % 60;

		System.out.println(hour + "시간" + min + "분" + sec + "초이다.");

	}
}
