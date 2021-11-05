//ArithmeticException 에 대한 예외처리도 추가
//DivTestTryCatch02 사 이 -> 이 경우 예외처리도 추가(NumberFormatException)

class DivTestTryCatch02 
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
		}catch(ArithmeticException e){
			System.out.println("0으로 나눌 수 없어요!");
		}catch(NumberFormatException e){
			System.out.println("문자는 안됩니다.숫자를 입력해주세요!");
		}

	}
}

