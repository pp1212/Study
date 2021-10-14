class Exam02_CallByReferenceArray 
{
	//실수형 배열을 매개변수로 전달받아 모든 요소를 1씩 감소하는 메소드 정의
	public static void minusOne(double []arr){
		for (int i=0;i<arr.length ;i++){
			arr[i] = arr[i]-1;
		}
		printArray(arr);    
	}
	
	//실수형 배열을 매개변수로 전달받아 출력하는 메소드 정의
	public static void printArray(double []arr){
		for (double a:arr ){
			System.out.printf("%10.2f",a);
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) 
	{
		double a[] = {2.5,3.5,4.5};
		minusOne(a);
		printArray(a);

	}
}
