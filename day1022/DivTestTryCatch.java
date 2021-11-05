/*
	프로그램 실행 시에 두 개의 정수를 전달 받아 나누기 한 결과를 출력하는 프로그램 작성
	프로그램 실행 시에 필요하다면 필요한 값을 전달 가능
	이렇게 전달하는 값은 main메소드의 매개변수 배열로 전달이 됨
	전달한 것만큼 배열의 크기가 정해지고
	차례대로 0번째 요소부터 쌓이게 됨
	만약 4 2 5 하면 -> String인 args가 3개 생김 

	java DivTestTryCatch 4 2      -> args배열의 0이 4
	
	하나의 try안에 여러개의 catch가 올 수 있음

*/

class DivTestTryCatch 
{
	public static void main(String[] args) 
	{
		try{
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			int result = a/b;
			System.out.println("결과:"+result);
		}catch( ArrayIndexOutOfBoundsException e ){
			System.out.println("실행시에 나누기 할 두 수를 전달하세요!");
		}

	}
}

