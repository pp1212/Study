class MyUtil
{
	void printArray(int []data){
		for(int i: data){    //for-each
			System.out.printf("%5d",i);
		}
		System.out.println();
	}
}







class MethodTest04 
{
	public static void main(String[] args) 
	{
		int []a = {10,20,30,40,50};
		int []b = {60,70,80,90,100};

		MyUtil util = new MyUtil();
		util.printArray(a);
		util.printArray(b);
	}
}
