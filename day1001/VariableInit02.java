class VariableInit02 
{
	public static void main(String[] args) 
	{
		int sum;
		int i=1;
		sum = sum+i;
		System.out.println(sum);
		/*위의 코드도 오류를 발생시킴,sum변수를 선언하기만 하고 아직 아무값도 없는 상태이기
		때문에 sum+i라는 연산을 수행할 수 없다.연산을 수행시키기 위해서는 초기값을 설정해야 함*/
	}
}
