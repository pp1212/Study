import java.util.Scanner;
class  FateTest
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String []fate = {"õ��","õ��","õ��","õ��","õ��","õ��","õ��","õ��","õ��","õ��","õ��","õ��"};
		String []zod1 = {"��","��","��","�䳢","��","��","��","��","������","��","��","����"};
		String []zod3 = {"��","��","��","��","��","��","��","��","��","��","��","��"};

		String name,zod2,hour;
		int mon,day,j=0;
		System.out.print("�̸��� �Է��Ͻÿ�==>");
		name = sc.next();
		System.out.print("�츦 �Է��Ͻÿ�==>");
		zod2 = sc.next();
		System.out.print("������ �Է��Ͻÿ�==>");
		mon = sc.nextInt();
		System.out.print("������ �Է��Ͻÿ�==>");
		day = sc.nextInt();
		System.out.print("���ø� �Է��Ͻÿ�==>");
		hour = sc.next();
		
		for (int i=0 ; i<fate.length ; i++ ){
			if (zod2.equals(zod1[i])){
				System.out.println("����: " + zod2 + "�� ==> " + fate[i]);
				System.out.println("����: " + mon + " ==> " + fate[i-1+mon]);
				System.out.println("����: " + day + " ==> " + fate[i-1+mon-1+day]);
			}
		}
	}
}
