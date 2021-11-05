//ArithmeticException 에 대한 예외처리도 추가
//DivTestTryCatch02 사 이 -> 이 경우 예외처리도 추가(NumberFormatException)

class DivTestTryCatch03 
{
	public static void main(String[] args) 
	{
		try{
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			int result = a/b;
			System.out.println("결과:"+result);
		}catch(Exception e){
			System.out.println("두번째 수가 0이 아닌 두개의 숫자를 전달 해 주세요!");
		}

	}
}

