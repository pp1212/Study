/*�迭 �߿��� ���� ū �� ã��
1)���� ū ���� ã�� �����ϱ� ���� max��� ������ �����Ѵ�
2)�迭�� �� ù ��° ��Ҹ� �ϴ��� max��� ����
3)�ݺ����� �̿��Ͽ� �迭�� �� ��° ��Һ��� max�� ������ ���Ͽ� 
���ϴ� �迭�� ���� max���� �� ũ�ٸ� �� �迭�� ���� max��� ����

*/

class  MaxOfArray
{
	public static void main(String[] args) 
	{
		int []arr = {9,3,7,15,2};
		int max;
		max = arr[0];  //�ϴ� max=9 
		for (int i=1 ; i<arr.length ; i++ ){
			if (max < arr[i]){  //-> 2��° ���� max ��,3��° ���� max~
				max = arr[i];
			}
		}
		System.out.println("�迭 �߿� ���� ū ���� : " + max);
		
	}
}
