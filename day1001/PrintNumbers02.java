class  PrintNumbers02
{
	public static void main(String[] args) 
	{
		System.out.println("a");
		System.out.println("b");

		int i;
		for(i=1 ; i<=3 ; i++){  //i+1은 축적되지 않아서 안됨 ->i++해야 함
			System.out.println(i);
		}
		System.out.println("c");
		System.out.println("i:"+i);
	}
}
