import java.util.Scanner;
class Programming03 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int price = 100;
		int cnt,total;
		System.out.print("������ ���ż����� �Է��ϼ���==>");
		cnt = sc.nextInt();
		total = price * cnt;
		if (cnt >= 10){
			total = (int)(total * 0.9);  
			//0.9�� double��� total�� int�� �������-> int�� 4byte double�� 8byte�� �������� ������ (int)�ؼ� int�� �ٲٱ�
		}
		System.out.println("��ü������ " + total + "�Դϴ�.");
	}
}
