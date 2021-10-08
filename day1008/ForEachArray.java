class ForEachArray 
{
	public static void main(String[] args) 
	{
		int []data = {1,2,3,4,5};
		
		
		/*
		for (int i=0 ; i<data.length ; i++ ){
			System.out.println(data[i]);
		}
		*/ 


		for (int i : data ){   //for-each 반복문 -> i는 값(배열의 요소)을 하나씩 꺼내오는 것
			System.out.println(i);   //이렇게 써야 함, 값을 가져와서 출력하는 것이라
			//System.out.println(data[i]);  이렇게 쓰면 안됨, 위치가 아니라 값을 가져오는 것이라
			/* 
			System.out.println(data[i]);을 하면 
			i자체가 배열의 값을 가져오는데 인덱스로 쓰기 때문에 2,3,4,5 이렇게 출력
			data[1]->2, data[2]->3 ~
			
			*/
		}
	}
}
