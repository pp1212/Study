import java.util.Scanner;
class  Exam06
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		double weight, height, std;
		System.out.print("Ű�� �Է��Ͻÿ�==>");
			height = sc.nextDouble();
		System.out.print("�����Ը� �Է��Ͻÿ�==>");
			weight = sc.nextDouble();
		std = (height - 100) * 0.9;

		if(weight < std){
			System.out.println("��ü���Դϴ�.");
		}else if(weight == std){
			System.out.println("ǥ��ü���Դϴ�.");
		}else if(weight > std){
			System.out.println("��ü���Դϴ�.");
		}
	}
}
