import java.util.Scanner;
class  SajuPalja
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String []result = {"õ��","õ��","õ��","õ��","õ��","õ��","õ��","õ��","õ��","õ��","õ��","õ��"};
		

		String name;
		int year;
		int month;
		int date;
		int time;
		
		System.out.print("�̸��� �Է��Ͻÿ�==>");
		name = sc.next();
		System.out.println("�츦 �Է��Ͻÿ�==>");
		System.out.println("0:��,1:��,2:��,3:�䳢,4:��,5:��,6:��,7:��,8:������,9:��,10:��,11:����===>");
		year = sc.nextInt(); //1 �Ҷ�		õ��
		System.out.print("������ �Է��Ͻÿ�==>");
		month = sc.nextInt(); //3	õ��
		System.out.print("������ �Է��Ͻÿ�==>");
		date = sc.nextInt(); //20	õ��
		System.out.println("���ø� �Է��Ͻÿ�==>");
		System.out.print("0:��,1:��,2:��,3:��,4:��,5:��,6:��,7:��,8:��,9:��,10:��,11:��==>");
		time = sc.nextInt(); //8 �Ž�		õ��

		int n = year;
		System.out.println("***" + name + "���� �������� Ǯ��" + "***");
		System.out.println("������ ����� " + result[n]);  //õ��
		n = (n + month - 1)%12;  //n=(1+3-1)%12=3  ==>n=3
		System.out.println("������ ����� " + result[n]);  //õ��
		n = (n + date - 1)%12;   //n=(3+20-1)%12=10  ==>n=10
		System.out.println("������ ����� " + result[n]);   //õ��
		n = (n + time)%12;       //n=(10+8)%12=6  ==>n=6  ���ô� 0���� �Է��϶�� �߱� ������ -1 �� �ص� ��
		System.out.println("������ ����� " + result[n]);   //õ��

	}
}
