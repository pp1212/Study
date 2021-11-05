//정수 두 개를 매개변수로 전달받아 큰 수를 찾아 반환하는 메소드
//정수 3개를 매개변수로 전달받아 큰 수를 찾아 반환하는 메소드
//정수 4개를 매개변수로 전달받아 큰 수를 찾아 반환하는 메소드
//중복하여 정의하고 각각을 호출
class SistUtil
{
	public static int max(int a,int b){
		int result = a;
		if (b>result){
			result = b;
		}
		return result;
	}
	/*
	public static int max(int a,int b,int c){
		int result = max(a,b);   //a,b중에 큰수를 먼저 담기
		result = max(result,c);
		return result;
	}
	밑에랑 같은거*/
	public static int max(int a,int b,int c){
		return max( max(a,b) , c );
	}
	public static int max(int a,int b,int c,int d){
		return max(max(a,b) , max(c,d));
	}
}



class MethodOverloadingTest05 
{
	public static void main(String[] args) 
	{
		System.out.println(SistUtil.max(20,30));
		System.out.println(SistUtil.max(40,90,50));
		System.out.println(SistUtil.max(50,60,90,70));

	}
}
