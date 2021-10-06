class InfiniteLoop02
{
	public static void main(String[] args) 
	{
		int i=1; //초기값
		for (; ; ){
			System.out.println("hello");
			if(i>=3){       //조건식
				break;
			}
			i++;  //증감식
		}
	}
}
