import java.util.Scanner;
class  PoundToGram
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		double pound,gram;
		System.out.print("�����Ը� �Ŀ��� �Է��Ͻÿ�==>");
		pound = sc.nextDouble();
		gram = pound * 454;

		System.out.println("�����Դ� "+ gram +"g�Դϴ�");



		
	}
}
