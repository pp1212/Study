class  PrintMultiplicationTableWhile
{
	public static void main(String[] args) 
	{
		int dan=2;
		while (dan<=9){
			System.out.printf("*** %d단 ***\n",dan);
			int i=1;   //반드시 여기 있어야 함!묶음이라고 생각
			while (i<=9){
				System.out.printf("%d*%d=%d\n",dan,i,dan*i);
				i++;
			}
			dan++;
			System.out.println();
		}
	}
}
