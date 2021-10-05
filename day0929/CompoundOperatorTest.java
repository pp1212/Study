class  CompoundOperatorTest
{
	public static void main(String[] args) 
	{
		int i = 1;
		int sum = 0;
		
		//for( i=1 ; i<=3 ; i++ ){
		for( i=1 ; i<=100 ; i++ ){
			sum += i;
		}
		
		/*
		sum += i; //1  sum=sum+i  sum=0+1
		
		i++;  //2  i=i+1  i=1+1
		sum += i; //3   sum=sum+i  sum=1+2

		i++;  //3  i=i+1  i=2+1
		sum += i; //6   sum=sum+i  sum=3+3
		*/


		System.out.println("i:"+i);  //3
		System.out.println("sum:"+sum);  //6

	}
}
