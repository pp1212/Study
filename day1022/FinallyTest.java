class FinallyTest 
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
		}finally {
			System.out.println("다시 실행하세요.");
		}
	}
}

/*
<finally>
 try구문을 수행하다 예외가 발생해서 catch문에서 예외 처리 후 종료된 경우,
 예외 발생에 관계 없이 try문과 한 쌍으로 수행될 수 있도록 해주는 것이 finally문
 가독성을 위해 한 쌍으로 작성
 지역 변수의 공유가 되지 않습니다. 따라서 서로 변수 공유를 하기 위해서는 구문 바깥쪽에 변수를 생성
 */