class RecursiveMethodTest 
{
	//n을 매개변수로 전달받아 n!를 구하여 반환하는 메소드를 재귀호출을 이용하여 정의
	public static int getFactorial(int n){
		if (n == 1){
			return 1;    //메소드 종류에 따라 끝나는 조건은 다름
		}                                  
		return n * getFactorial(n-1);
	}

	//n을 매개변수로 전달받아 1에서 n까지의 합을 누적하여 반환하는 메소드를 재귀호출 이용하여 정의
	public static int getSum(int n){
		if(n==1){
			return 1;
		}
		return n + getSum(n-1);
	}



	
	public static void main(String[] args) 
	{
		System.out.printf("5!=%d\n",getFactorial(5));
		System.out.printf("7!=%d\n",getFactorial(7));
		System.out.printf("1에서 10까지의 합은 %d\n",getSum(10));
	}
}
