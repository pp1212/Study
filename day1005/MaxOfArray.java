/*배열 중에서 가장 큰 수 찾기
1)가장 큰 수를 찾아 저장하기 위한 max라는 변수를 선언한다
2)배열의 맨 첫 번째 요소를 일단은 max라고 본다
3)반복문을 이용하여 배열의 두 번째 요소부터 max에 담긴것을 비교하여 
비교하는 배열의 값이 max보다 더 크다면 그 배열의 값을 max라고 본다

*/

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
