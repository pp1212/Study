import java.util.Scanner;
class CorrectTest 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String name,star="",answer;
		
		while(true){   //while1
			System.out.print("�̸��� �Է��ϼ���==>"); //���⼭���� �߸��� �Է��� ��� ������ ���ϰ� ��� �ݺ�
			name = sc.next();                    //�ؿ��� �� ū while�� break�� ������ ������ ��� �ݺ�
			
				int month;
				while (true){  //while2
					System.out.print("���� �Է��ϼ���==>");
					month = sc.nextInt();
					if(month>=1 && month<=12)   //�����ϸ� while2�� Ż��
						break;
					
				}
				

				int day;
				for(;;){
					System.out.print("������ �Է��ϼ���==>");
					day = sc.nextInt();
					if(day>=1 && day<=31){
						break;
					}
				}
				
				switch (month){
						case 1: 
							if(day>=20)star = "�����ڸ�";
							else star = "�����ڸ�";
							break;
							
						case 2:
							if(day>=19)star = "������ڸ�";
							else star = "�����ڸ�";
							break;
							
						case 3:
							if(day>=21)star = "���ڸ�";
							else star = "������ڸ�";
							break;
							
						case 4:
							if(day>=20)star = "Ȳ���ڸ�";
							else star = "���ڸ�";
							break;
							
						case 5:
							if(day>=21)star = "�ֵ����ڸ�";
							else star = "Ȳ���ڸ�";
							break;
							
						case 6:
							if(day>=22)star = "���ڸ�";
							else star = "�ֵ����ڸ�";
							break;
							
						case 7:
							if(day>=23)star = "�����ڸ�";
							else star = "���ڸ�";
							break;
							
						case 8:
							if(day>=23)star = "ó���ڸ�";
							else star = "�����ڸ�";
							break;
							
						case 9:
							if(day>=24)star = "õĪ�ڸ�";
							else star = "ó���ڸ�";
							break;
							
						case 10:
							if(day>=23)star = "�����ڸ�";
							else star = "õĪ�ڸ�";
							break;
							
						case 11:
							if(day>=23)star = "����ڸ�";
							else star = "�����ڸ�";
							break;
							
						case 12:
							if(day>=25)star = "�����ڸ�";
							else star = "����ڸ�";
							break;
							
					}
					
					System.out.printf("%s ���� ���ڸ��� %s�Դϴ�.\n",name,star);
					
					while(true){
						System.out.print("�� �Ͻðڽ��ϱ�?(Y/N)");
						answer = sc.next();

						if(answer.equals("Y") || answer.equals("N")){
							break;
						}
					}

			System.out.print("�� �Ͻðھ��?(y/n)");
			answer = sc.next();
			if (answer.equals("n")){
				System.out.println("�����Ͽ����ϴ�.");
			}

	}
}
