import java.util.Scanner;
class Exam07 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a,b,c,min;
		System.out.print("ù ��°���� �Է��Ͻÿ�==>");
		a = sc.nextInt();
		System.out.print("�� ��°���� �Է��Ͻÿ�==>");
		b = sc.nextInt();
		System.out.print("�� ��°���� �Է��Ͻÿ�==>");
		c = sc.nextInt();

		if (a<b){
			if (a<c){
				min = a;
			}else{
				min = c;
			}
		}else{
			if(b<c){
				min = b;
			}else{
				min = c;
			}
		}
		System.out.println("���� ���� ����" + min + "�Դϴ�.");
	}
}
