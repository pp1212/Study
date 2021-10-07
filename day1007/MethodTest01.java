class MyUtil
{
	void gugudan(int dan){       //리턴값에 상관없이 ()이건 와야 함
		System.out.printf("***%d단***\n",dan);
		for (int i=1;i<=9 ;i++ ){
			System.out.printf("%d*%d=%d\n",dan,i,dan*i);
		}
		return;  //안해도 return 생략되어 있음  ,return dan;->리턴값이 있는 것
	}
}






class MethodTest01 
{
	public static void main(String[] args) 
	{
		MyUtil mu = new MyUtil();
		mu.gugudan(9);
		System.out.println("========================");
		mu.gugudan(10);
	}
}
