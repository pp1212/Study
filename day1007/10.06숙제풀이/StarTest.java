import java.util.Scanner;
class  StarTest
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String name,result="";
		int month,day;
		int []last = {31,28,31,30,31,30,31,31,30,31,30,31};
		char again; //ū do while���ȿ� ������ �ؿ� �𸣴ϱ� do while ���� ���� ����
		
		do{
			System.out.print("�̸��� �Է��Ͻÿ�==>");
			name = sc.next();


			do{
				System.out.print("������ �Է��Ͻÿ�==>");
				month = sc.nextInt();
			}while(month<1 || month>12);

			
			do{
				System.out.print("������ �Է��Ͻÿ�==>");
				day = sc.nextInt();
			}while(day<1 || day>last[month-1]);
			

			switch(month){
				case 1:if(day<=19)	result = "����"; else result = "����";break;  //�� �ٷ� ǥ�� ����,������ ;�� �ƴϸ� ���� ���ϱ�
				case 2:if(day<=18)	result = "����"; else result = "�����";break;
				case 3:if(day<=20)	result = "�����"; else result = "��";break;
				case 4:if(day<=19)	result = "��"; else result = "Ȳ��";break;
				case 5:if(day<=20)	result = "Ȳ��"; else result = "�ֵ���";break;
				case 6:if(day<=21)	result = "�ֵ���"; else result = "��";break;
				case 7:if(day<=22)	result = "��"; else result = "����";break;
				case 8:if(day<=22)	result = "����"; else result = "ó��";break;
				case 9:if(day<=23)	result = "ó��"; else result = "õĪ";break;
				case 10:if(day<=22)	result = "õĪ"; else result = "����";break;
				case 11:if(day<=22)	result = "����"; else result = "���";break;
				case 12:if(day<=24)	result = "���"; else result = "����";break;
			}//end switch
			System.out.printf("%s���� ���ڸ��� %s�ڸ��Դϴ�.\n",name,result);
			

			
			do{
				System.out.print("��, �Ͻðھ��?(y/n)==>");
				again = sc.next().charAt(0); //String���� �ε����� �ִ� �� ���� �̾���
			}while(again!='y' && again!='n' && again!='Y' && again !='N'); //y,n�� �ƴϸ� ��� �ǹ���


		}while(again == 'y' || again == 'Y');   //ū do while������ while(����-y�̸�)�̸� �ݺ�
		
		System.out.println("�����մϴ�.");
	}
}
