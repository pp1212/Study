//ArithmeticException 에 대한 예외처리도 추가
//DivTestTryCatch02 사 이 -> 이 경우 예외처리도 추가(NumberFormatException)
//DivTestTryCatch04 4 0    ->이것만 따로 예외처리
//ArithmeticException은 Exception에 포함되니깐 먼저와야 함

class DivTestTryCatch05 
{
	public static void main(String[] args) 
	{
		try{
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			int result = a/b;
			System.out.println("결과:"+result);
		}catch(ArithmeticException e){
			System.out.println("0으로 나눌 수 없어요!");
		}catch(Exception e){
			System.out.println("두번째 수가 0이 아닌 두개의 숫자를 전달 해 주세요!");
		}

	}
}

/*
DivTestTryCatch04.java:17: error: exception ArithmeticException has already been caught
                }catch(ArithmeticException e){
                 ^
1 error

이미 ArithmeticException에 대하여 15번에서 다 처리되었어!이쪽으로 올 일이 없다.
*/