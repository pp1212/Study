import java.util.Scanner;
class  Exam02
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String i="";
		int width,height;
		double radius;
		System.out.print("�ϳ��� ���ڸ� �Է����ּ���==>");
		i = sc.next();

		if (i.equals("R")){
			System.out.print("���α��̸� �Է��ϼ���==>");
			width = sc.nextInt();
			System.out.print("���α��̸� �Է��ϼ���==>");
			height = sc.nextInt();
			System.out.println("�簢���� ����:"+(width*height));
		}else if (i.equals("T")){
			System.out.print("�غ��� �Է��ϼ���==>");
			width = sc.nextInt();
			System.out.print("���̸� �Է��ϼ���==>");
			height = sc.nextInt();
			System.out.println("�ﰢ���� ����:"+(width*height*0.5));
		}else if(i.equals("C")){
			System.out.print("�������� �Է��ϼ���==>");
			radius = sc.nextInt();
			System.out.println("���� ����:"+(radius*radius*3.14));
		}

	}
}
