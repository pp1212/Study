import java.util.Scanner;
class  MaxTest
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a,b,c,max;
		System.out.print("ù ��°���� �Է��Ͻÿ�==>");
		a = sc.nextInt();
		System.out.print("�� ��°���� �Է��Ͻÿ�==>");
		b = sc.nextInt();
		System.out.print("�� ��°���� �Է��Ͻÿ�==>");
		c = sc.nextInt();
		

		if(a>b){
			if(a>c){      //��ø���ù�
			 max = a;
			}else{   //a>b�߿� false->b��ũ��  ��ø���ù����� else�� ���� ���� ���� ����� if�� ����
				max = c;
			}
		}else{
			if(b>c){
				max = b;
			}else{   //a>b�߿� false->b��ũ��
				max = c;
			}
		}
		System.out.println("���� ū ���� "+ max +"�Դϴ�.");

	}
}
