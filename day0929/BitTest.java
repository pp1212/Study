class  BitTest
{
	public static void main(String[] args) 
	{
		int a = 10; //
		int b = 20;
		int i = a & b;
		int j = a | b;
		int k = a ^ b;

		System.out.println("i="+i);  //0	
		System.out.println("j="+j);	 //30
		System.out.println("k="+k);  //30
	}
}
