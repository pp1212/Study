import java.util.Scanner;
class  Programming09
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		double x,result;
		System.out.print("�Ǽ� x�� �Է��ϼ���==>");
		x = sc.nextDouble();
		if (x > 0){
			result = 7 * x + 2;
		}else{
			result = (x*x*x) - (9 * x) + 2;
		}
		System.out.println("���: " + result);
	}
}
