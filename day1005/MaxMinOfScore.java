import java.util.Scanner;
class  MaxMinOfScore
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int []score = new int[10];
		for (int i=0 ; i<score.length ; i++ ){
			System.out.print((i+1) + "��° �л��� ������ �Է��ϼ���==>");
			score[i] = sc.nextInt();
		}
		
		int max,min;
		max = score[0];
		min = score[0];
		
		
		for (int i=1 ; i<score.length ; i++ ){
			if (max < score[i]){
				max = score[i];
			}
			if (min > score[i]){
				min = score[i];
			}
		}
		System.out.println("�ְ������� " + max + "�� �Դϴ�");
		System.out.println("���������� " + min + "�� �Դϴ�");
	}
}
