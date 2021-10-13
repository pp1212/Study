/*
메소드 호출시에 배열참조변수나 객체참조변수가 전달되는 경우를
참조에 의한 호출이라고 하고
메소드 호출시에 전달해 준 내용이 메소드안에서 변경될 때 호출한 쪽에도 적용 됨

*/

class CallByReferenceArray 
{
	//정수형 배열을 매개변수로 전달받라 배열의 모든 요소르 출력하는 메소그
	public static void printArray(int []arr){
		for (int i=0;i<arr.length ;i++ ){
			System.out.printf("%5d",arr[i]);
		}
		System.out.println();
	}
	
	//정수형 배열을 매개변수로 전달받아 배열의 모든 요소를 1씩 증가하는 메소드 정의
	public static void plusOne(int []arr){
		for (int i=0 ; i<arr.length ;i++ ){
			arr[i] = arr[i] + 1;
		}
	}
	
	
	public static void main(String[] args) 
	{
		int []arr = {10,20,30};
		printArray(arr);     //같은 클래스라서 클래스이름.변수명 안해도 됨
		plusOne(arr);
		printArray(arr);
	}
}
