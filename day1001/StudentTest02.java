import java.util.Scanner;
class StudentTest02 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int []age = new int[5];
		for (int i=0; i<age.length ;i++ ){  //�ݺ����ȿ��� ���� ���ĵ� ��� ���� ������ �����ϱ�
			System.out.print((i+1) + "��° �л��� ���̸� �Է��Ͻÿ�==>"); 
			  //i+1�� i�� 0���� �����ϴϱ� 0��° �л���~�� �ƴ϶� 1��° �л���~ �̷��� ����Ϸ���
			age[i] = sc.nextInt();
		}


		int tot=0;
		for (int i=0 ; i<age.length ; i++ ){
			tot += age[i];
		}
		
		double avg = (double)tot/age.length;
		System.out.println("��ճ���:"+avg);
	}
}
