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
