/*
�� ���α׷��� 5���� �̸�,����,����,������ �Է¹޾� ������ ����� ���� ���� ���������� �����Ͽ� ���
���������� ������ ��,������ ���� ������ �̸��� �ٲ��ְ� ����,����,����,����,��� ������ ���
�ٲٴ� ���� ���ŷο�

�̷��� �� ���� �л��� ������ �����ϱ⿡ �ʿ��� �̸�,����,����,����,����,����� �ϳ��� ��Ʈ�� ����
=>Ŭ���� ����� ��
Ŭ���� ����� �θ� �� ���� ������ ���� �ִ� ���� �ƴ϶� �ϳ��� ��Ʈ�� ǥ�� -> ������ �� ������
*/

import java.util.Scanner;
class Student
{
	String name;
	int kor;
	int eng;
	int math;
	int tot;
	double avg;
}







class StudentTest01 
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		Student s = new Student();   //new->��ü�����ض�,Student->��� ����,s->����
		/*s �ȿ��� String name;
		int kor;
		int eng;
		int math;
		int tot;
		double avg;*/
		s.name="ȫ�浿";
		s.kor=100;
		s.eng=80;
		s.math=90;

		s.tot = s.kor + s.eng + s.math;
		s.avg = s.tot/3.0;  

		System.out.println("�̸�:" + s.name);
		System.out.println("����:"+s.kor);
		System.out.println("����:"+s.eng);
		System.out.println("����:"+s.math);
		System.out.println("����:"+s.tot);
		System.out.println("���:"+s.avg);

	}
}
