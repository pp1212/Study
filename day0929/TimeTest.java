import java.util.Scanner;
class  TimeTest
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int sec,min,hour;
		System.out.print("�ð��� �ʴ����� �Է��Ͻÿ�:");
		sec = input.nextInt();
		
		hour = sec / 3600;
		min = (sec%3600) / 60;
		sec = (sec%3600) % 60;

		System.out.println(hour + "�ð�" + min + "��" + sec + "���̴�.");

	}
}
