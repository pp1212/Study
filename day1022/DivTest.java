/*
	프로그램 실행 시에 두 개의 정수를 전달 받아 나누기 한 결과를 출력하는 프로그램 작성
	프로그램 실행 시에 필요하다면 필요한 값을 전달 가능
	이렇게 전달하는 값은 main메소드의 매개변수 배열로 전달이 됨
	전달한 것만큼 배열의 크기가 정해지고
	차례대로 0번째 요소부터 쌓이게 됨
	만약 4 2 5 하면 -> String인 args가 3개 생김 

	java DivTest 4 2
	args배열의 0이 4
	

*/

class DivTest 
{
	public static void main(String[] args) 
	{
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int result = a/b;
		System.out.println("결과:"+result);

	}
}
/*
C:\javaStudy\day1022>java DivTest
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
        at DivTest.main(DivTest.java:19)

C:\javaStudy\day1022>java DivTest 10
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1
        at DivTest.main(DivTest.java:20)

이 프로그램은 실행시에 나누기 할 두 수를 전달해야 정상적으로 동작하는데 
위와 같이 하나도 전달하지 않거나
한 개만 전달하면 "예외"가 발생
*/
