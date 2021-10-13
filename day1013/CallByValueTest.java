/*
값에 의한 호출(Call By Value)
=>메소드 호출시에 기본자료형이 전달되는 경우
메소드 안에서 전달된 내용이 변경되더라도 호출하는 쪽에서는 적용되지 않음
*/

class CallByValueTest 
{
	//정수형 변수 1개를 매개변수로 전달받아 더하기 1하여 다시 변수에 저장하고 출력하는 메소드
	//값에 의한 호출이어서->값이 변경 안됨
	public static void plusOne(int n){   //101
		n = n + 1;
		System.out.println(n);
	}
	
	
	
	
	
	public static void main(String[] args)  //100
	{
		int data = 100;
		plusOne(data);
		System.out.println(data);
	}
}
