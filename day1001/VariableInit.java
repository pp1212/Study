class VariableInit 
{
	public static void main(String[] args) 
	{
		int sum;
		System.out.println(sum);
		//위의 코드는 오류 발생, 
		//sum이라는 변수를 선언하기만 하고 아무값도 정해지지 않았기 때문에 출력안됨
	}
}
/*
VariableInit02.java:6: error: variable sum might not have been initialized
                System.out.println(sum);
                                   ^
1 error
*/