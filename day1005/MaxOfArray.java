class  MaxOfArray
{
	public static void main(String[] args) 
	{
		int []arr = {9,3,7,15,2};
		int max;
		max = arr[0];  //일단 max=9 
		for (int i=1 ; i<arr.length ; i++ ){
			if (max < arr[i]){  //-> 2번째 수랑 max 비교,3번째 수랑 max~
				max = arr[i];
			}
		}
		System.out.println("배열 중에 가장 큰 값은 : " + max);
		
	}
}
