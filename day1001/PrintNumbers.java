class  PrintNumbers
{
	public static void main(String[] args) 
	{
		int i;
		for(i=1 ; i<=10 ; i++){  //i+1은 축적되지 않아서 안됨 ->i++해야 함
			System.out.println(i);
		}
	}
}
