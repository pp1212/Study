class  Exam12
{
	public static void main(String[] args) 
	{
		int b=0;
		for (int i=2 ; i<=100 ; i++ ){
			b=0;
			for (int a=2 ; a<i ; a++ ){
				if (i%a==0){
					b++;
					break;
				}
			}
			if (b==0){
				System.out.println(i);
			}
		}
	}
}
