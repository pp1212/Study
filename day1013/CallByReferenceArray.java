/*
�޼ҵ� ȣ��ÿ� �迭���������� ��ü���������� ���޵Ǵ� ��츦
������ ���� ȣ���̶�� �ϰ�
�޼ҵ� ȣ��ÿ� ������ �� ������ �޼ҵ�ȿ��� ����� �� ȣ���� �ʿ��� ���� ��

*/

class CallByReferenceArray 
{
	//������ �迭�� �Ű������� ���޹޶� �迭�� ��� ��Ҹ� ����ϴ� �޼ұ�
	public static void printArray(int []arr){
		for (int i=0;i<arr.length ;i++ ){
			System.out.printf("%5d",arr[i]);
		}
		System.out.println();
	}
	
	//������ �迭�� �Ű������� ���޹޾� �迭�� ��� ��Ҹ� 1�� �����ϴ� �޼ҵ� ����
	public static void plusOne(int []arr){
		for (int i=0 ; i<arr.length ;i++ ){
			arr[i] = arr[i] + 1;
		}
	}
	
	
	public static void main(String[] args) 
	{
		int []arr = {10,20,30};
		printArray(arr);     //���� Ŭ������ Ŭ�����̸�.������ ���ص� ��
		plusOne(arr);
		printArray(arr);
	}
}
