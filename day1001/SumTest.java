import java.util.Scanner;
class  SumTest
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a,sum=0;  //sum�� �ʱ�ȭ -> VariableInit , VariableInit02 
		System.out.print("1���� � ������ ���ϱ� �ұ��?");
		a = sc.nextInt();  //a�� ������ �޾Ƽ� �������� sum�� �ؿ� ����Ŀ��� �ֱ� ������
		
		for(int i=1 ; i<=a ; i++){
			sum += i;   //sum = i + sum;
		}  //i�� a���� 1Ŭ�� Ż��
		System.out.println("1���� " + a + "������ ����" + sum + "�Դϴ�.");
	}
}
/*a�� ����ڷκ��� �Է¹ޱ� ������ �� �ʱ�ȭ ���� �ʾƵ� ��
sum�� �ݺ������� ������ �ϱ� ������ �ݵ�� �ʱⰪ�� �־�� ��
������ ���ϱ⸦ �� ���̶� 0���� �ʱ�ȭ ��
�־��� �����ذ��� ���Ͽ� �׶��׶����� ������ ������ �ʱ�ȭ �ؾ� ��*/