import java.util.Scanner;
class  CorrectTest
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int []answer = {1,2,3,4,1,2,3,4,1,2};  //���� �ʱ�ȭ
		int []user = new int[10];              //����� ���� ������ �迭 ����
		
		for (int i=0 ; i<user.length ; i++ ){  //���� �Է� for��
			System.out.print((i+1) + "�� ���� �Է��ϼ���==>");
			user[i]=sc.nextInt();
		}
		
		int answer_cnt=0,wrong_cnt=0;   //��������,Ʋ������ ���� ���� ����
		for (int i=0 ; i<answer.length ; i++ ){  //�¾Ҵ��� Ʋ�ȴ��� ���� ��� for��
			if (answer[i] == user[i]){
				System.out.println((i+1)+""+"O");
				answer_cnt++;  //���� ���� ���� ����
			}else{
				System.out.println((i+1)+""+"X");
				wrong_cnt++;  //Ʋ�� ���� ���� ����
			}
		}
		System.out.println("�����: " + answer_cnt + "��");
		System.out.println("Ʋ�����: " + wrong_cnt + "��");

	}
}
