class MyUtil
{
	void gugudan(int dan){       //���ϰ��� ������� ()�̰� �;� ��
		System.out.printf("***%d��***\n",dan);
		for (int i=1;i<=9 ;i++ ){
			System.out.printf("%d*%d=%d\n",dan,i,dan*i);
		}
		return;  //���ص� return �����Ǿ� ����  ,return dan;->���ϰ��� �ִ� ��
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
