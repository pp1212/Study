import java.util.Scanner;
class CorrectTest 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String name,star="",answer;
		int day;

		while(true){   //while1 - �̸�
			System.out.print("�̸��� �Է��ϼ���==>"); //���⼭���� �߸��� �Է��� ��� ������ ���ϰ� ��� �ݺ�
			name = sc.next();                    //�ؿ��� �� ū while�� break�� ������ ������ ��� �ݺ�
			
				int month;
				while (true){  //while2 - ����
					System.out.print("������ �Է��ϼ���==>");
					month = sc.nextInt();
					if(month>=1 && month<=12)   //�����ϸ� while2�� Ż��, ���� ����
						break;
					
				}
				

				int last=31;
				switch(month){
					case 2: last=28;break;
					case 4:case 6:case 9:case 11: last=30;break;
				}


				while(true){  //while3 - ����
					System.out.print("������ �Է��ϼ���==>");
					day = sc.nextInt();
					if(day>=1 && day<=last){
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
					
					while(true){    //while4 - �ٽ� �������� (while(true)�� ��Ȯ�� ���� ���ö����� �ݺ�)
						System.out.print("�� �Ͻðھ��?(y/n)");
						answer = sc.next();

						if(answer.equals("y") || answer.equals("n")){
							break;
						}
					}//end while4
					
					if (answer.equals("n"))
						break;   //while1������ 'n'�̸� Ż��,'y'�� �ٽ� ���������� �ݺ�
					
			}//end while1
			
			System.out.println("�����Ͽ����ϴ�.");
	}
}
