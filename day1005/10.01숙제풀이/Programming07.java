import java.util.Scanner;
class Programming07 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a,b,c,min;
		System.out.print("ù ��° ���� �Է��Ͻÿ�==>");
		a = sc.nextInt();
		System.out.print("�� ��° ���� �Է��Ͻÿ�==>");
		b = sc.nextInt();
		System.out.print("�� ��° ���� �Է��Ͻÿ�==>");
		c = sc.nextInt();
		
		//  3��° ���
		if (a<b && a<c){
			min = a;
		}else if(b<a && b<c){
			min = b;
		}else{
			min = c;
		}
		
		/* 2��° ���
		if (a>b){
			if (b>c){
				min = c;
			}else{
				min = b;
			}
		}else{
			if (a>c){
				min = c;
			}else{
				min = a;
			}
		}*/

		/*  1��° ���
		if (a<b){
			if (a<c){
				min = a;
			}else{
				min = c;
			}
		}else{
			if (b<c){
				min = b;
			}else{
				min = c;
			}
		}*/
		System.out.println("���� ���� ���� "+ min + "�Դϴ�.");
	}
}
