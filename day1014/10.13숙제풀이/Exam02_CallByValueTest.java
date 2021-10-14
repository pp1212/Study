class Exam02_CallByValueTest 
{
	
	//정수형 변수 하나를 매개변수로 전달받아 -1을 하여 출력하는 메소드 정의
	public static void minusOne(int n){
		n = n-1;
		System.out.println(n);
	}
	
	
	
	
	public static void main(String[] args) 
	{
		int n =5;
		minusOne(n);
		System.out.println(n);
	}
}
