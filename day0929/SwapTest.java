class SwapTest 
{
	public static void main(String[] args) 
	{
		String cup1 = "커피";
		String cup2 = "녹차";
		
		System.out.println("컵1: " + cup1);
		System.out.println("컵2: " + cup2);
		
		String temp;
		temp = cup1;
		cup1 = cup2;
		cup2 = temp;

		System.out.println("두 개의 컵의 내용을 서로 바꾸었습니다");
		System.out.println("컵1: " + cup1);
		System.out.println("컵2: " + cup2);
	}
}
