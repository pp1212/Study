import java.util.Scanner;
class  Constellation
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String name,star="";
		int month,day;
		System.out.print("�̸��� �Է��ϼ���==>");
		name = sc.next();
		System.out.print("������ �Է��ϼ���==>");
		month = sc.nextInt();
		System.out.print("������ �Է��ϼ���==>");
		day = sc.nextInt();

		if(month<1 || month>12){
			System.out.println("�Է� ������ �Ѿ����ϴ�.");
		}else if(day<1 || day>31){
			System.out.println("�Է� ������ �Ѿ����ϴ�.");
		}else if(month==2 && day>29){
			System.out.println("�Է� ������ �Ѿ����ϴ�.");
		}else if(month==4 && day>30){
			System.out.println("�Է� ������ �Ѿ����ϴ�.");
		}else if(month==6 && day>30){
			System.out.println("�Է� ������ �Ѿ����ϴ�.");
		}else if(month==9 && day>30){
			System.out.println("�Է� ������ �Ѿ����ϴ�.");
		}else if(month==11 && day>30){
			System.out.println("�Է� ������ �Ѿ����ϴ�.");
		}else{
			switch (month){
				case 1: 
					if(day>=20)
						star = "�����ڸ�";
					else
						star = "�����ڸ�";
					break;
					
				case 2:
					if(day>=19)
						star = "������ڸ�";
					else
						star = "�����ڸ�";
					break;
					
				case 3:
					if(day>=21)
						star = "���ڸ�";
					else
						star = "������ڸ�";
					break;
					
				case 4:
					if(day>=20)
						star = "Ȳ���ڸ�";
					else
						star = "���ڸ�";
					break;
					
				case 5:
					if(day>=21)
						star = "�ֵ����ڸ�";
					else
						star = "Ȳ���ڸ�";
					break;
					
				case 6:
					if(day>=22)
						star = "���ڸ�";
					else
						star = "�ֵ����ڸ�";
					break;
					
				case 7:
					if(day>=23)
						star = "�����ڸ�";
					else
						star = "���ڸ�";
					break;
					
				case 8:
					if(day>=23)
						star = "ó���ڸ�";
					else
						star = "�����ڸ�";
					break;
					
				case 9:
					if(day>=24)
						star = "õĪ�ڸ�";
					else
						star = "ó���ڸ�";
					break;
					
				case 10:
					if(day>=23)
						star = "�����ڸ�";
					else
						star = "õĪ�ڸ�";
					break;
					
				case 11:
					if(day>=23)
						star = "����ڸ�";
					else
						star = "�����ڸ�";
					break;
					
				case 12:
					if(day>=25)
						star = "�����ڸ�";
					else
						star = "����ڸ�";
					break;
					
			}

			System.out.println(name + "���� ���ڸ��� " + star + "�Դϴ�.");
		}

	}
}