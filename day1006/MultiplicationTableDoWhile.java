class  MultiplicationTableDoWhile
{
	public static void main(String[] args) 
	{
		int dan,j;
		dan=2;
		do{
			System.out.printf("*** %d ¥‹ ***\n",dan);
			j=1;
			do{
				System.out.printf("%d*%d=%d\n",dan,j,dan*j); //\n¡ŸπŸ≤ﬁ
				j++;
			}while(j<=9);
			System.out.println();
			dan++;
		}while (dan<=9);
	}
}
