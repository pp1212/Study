import java.util.Scanner;
class  StudentTest
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String name;
		int kor,eng,math,tot;
		double avg;
		System.out.print("�л��� �̸��� �Է��ϼ���==>");
		name = sc.next();  //�����̸�sc�� ��ĳ�ʸ� ����
		System.out.print("�������� �Է��ϼ���==>");
		kor = sc.nextInt();
		System.out.print("���������� �Է��ϼ���==>");
		eng = sc.nextInt();
		System.out.print("���������� �Է��ϼ���==>");
		math = sc.nextInt();

		tot = kor + eng + math;
		//avg = (double)kor + eng + math / 3;  3�� int�� �ν���
		avg = (double)tot / 3;  //�ƴϸ� ���� �Ⱥ��̰� 3.0���� ������ ��

		System.out.println("** ��� ��� **");
		System.out.println("�̸�: "+name);
		System.out.println("����: "+kor);
		System.out.println("����: "+eng);
		System.out.println("����: "+math);
		System.out.println("����: "+ tot);
		System.out.println("���: "+ avg);

		if ( avg >= 60)
			System.out.print(name + "�� �հ��Դϴ�");
		else
			System.out.print(name + "�� ���հ��Դϴ�");

	}
}
