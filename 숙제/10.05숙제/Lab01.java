import java.util.Scanner;
class Lab01 
{
	public static void main(String[] args) 
	{
		int score;

		Scanner input = new Scanner(System.in);
		System.out.printf("������ �Է��Ͻÿ�: ");
			score = input.nextInt();

			/* 1��
			String result = (score >= 60)?"�հ�!":"���հ�!";
			System.out.println(result);
			*/

			/* 2��
			if ( score >= 60 ){
				System.out.println("�հ�!");
				System.out.println("�����մϴ�.");
			}else{
				System.out.println("���հ�!");
			}	
			*/
			//3��
			if (score<0 || score>100){
				System.out.println("�߸��� �Է��Դϴ�.");
			}else{
				if (score < 50){
					System.out.println("���հ��Դϴ�.");
				}else if (score >= 50 && score < 60){
					System.out.println("��Ÿ���� ���հ��Դϴ�.");
				}else if (score >= 60 && score < 70){
					System.out.println("�հ��Դϴ�.");
				}else if (score >= 70 && score < 80){	
					System.out.println("����ϰ� �հ��Ͽ����ϴ�.");
				}else{
					System.out.println("���� ����ϰ� �հ��Ͽ����ϴ�.");
				}
			}

	}
}


