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







class StudentTest05 
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		Student []s = new Student[5];   
		for (int i=0;i<s.length ;i++ ){
			s[i] = new Student();  //i�� 0�̸� 0��° �迭��ü����
			System.out.printf("%d��° �л��� �̸��� �Է��Ͻÿ�--->",i+1);
			s[i].name = sc.next();
			System.out.printf("%d��° �л��� ���������� �Է��Ͻÿ�--->",i+1);
			s[i].kor = sc.nextInt();
			System.out.printf("%d��° �л��� ���������� �Է��Ͻÿ�--->",i+1);
			s[i].eng = sc.nextInt();
			System.out.printf("%d��° �л��� ���������� �Է��Ͻÿ�--->",i+1);
			s[i].math = sc.nextInt();
			s[i].tot = s[i].kor + s[i].eng + s[i].math;
			s[i].avg = s[i].tot/3.0;
		}

		//������ ���� ������ ����->��������
		for (int i=0;i<s.length ;i++ ){ //0:���� ���� ����,1:�ι�° ���� ����
			for (int j=i+1;j<s.length ;j++ ){
				if (s[j].avg > s[i].avg){
					Student temp = s[i];               //Student�� �ڷ�����
					s[i] = s[j];
					s[j] = temp;          //Student�� �� ��Ʈ�� ��°�� �ٲ�
				}
			}
		}

		System.out.println("*** ���� ó�� ��� ***");
		System.out.println("�̸�\t����\t����\t����\t����\t���");
		for (int i=0;i<s.length ;i++ ){
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%.1f\n",s[i].name,s[i].kor,s[i].eng,s[i].math,s[i].tot,s[i].avg);
		}
	}
}



