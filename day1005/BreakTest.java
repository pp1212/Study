class BreakTest 
{
	public static void main(String[] args) 
	{
		System.out.println("a");
		System.out.println("b");
		for (int i=1 ;i<=10 ;i++ ){
			System.out.println(i);
			if (i%3 == 0){
				break;
			}
			System.out.println("hello");
		}
		System.out.println("c");
		System.out.println("d");
	}
}
