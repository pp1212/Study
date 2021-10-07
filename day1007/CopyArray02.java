class CopyArray02
{
	public static void main(String[] args) 
	{
		int []a = {1,2,3,4,5};
		int []b = new int[5];
		
		for (int i=0 ; i<a.length ; i++ ){
			b[i] = a[i];
		}
		
		a[0] = 100;
		System.out.println("a배열의 요소");
		for(int i:a){ //i는 인덱스 아니고 요소 가져옴
			System.out.printf("%5d",i);
		}		
		System.out.println();
		
		System.out.println("b배열의 요소");
		for(int i:b){ //i는 인덱스 아니고 요소 가져옴
			System.out.printf("%5d",i);
		}	
		

	}
}
