import java.util.Scanner;
class  TestArray
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		//10���� ������ ������ �� �ִ� �迭�� �����ϰ� �����϶�
		int []arr = new int[10];
		

		//����ڷκ��� ������ �޾Ƽ� �迭�� �����ϴ� �ݺ� ����
		for (int i=0;i<arr.length ;i++ ){
			System.out.printf("%d��° �迭�� ���Ҹ� �Է��ϼ���==>",i+1);
			arr[i] = sc.nextInt();

		}

		//�迭�� ����� ������ ����ϴ� �ݺ� ����
		for (int i=0 ;i<arr.length ;i++ ){
			System.out.printf("%5d",arr[i]);
		}
		System.out.println();


		//�迭�� ����� ������ ����� �� for-each �ݺ� ������ ����� ����
		for(int i:arr){
			System.out.printf("%5d",i);
		}
		System.out.println();


		//�迭�� ����� ������ �������� ����غ���
		for (int i=arr.length-1; i>=0 ; i-- ){   //�ڿ����̸� �ʱⰪ�� arr.length-1
			System.out.printf("%5d",arr[i]);
		}
		System.out.println();
	}
}
