class MyUtil
{
	int getMax(int a, int b){      //�޼ҵ�� ������ ���� get���� ����,���ϰ� �־ �ڷ���int����
		int max=a;
		if (b>max){
			max=b;
		}
		return max;
	}
}






class  MethodTest03
{
	public static void main(String[] args) 
	{
		int age1 = 26;
		int age2 = 28;
		int result;
		MyUtil util = new MyUtil();
		result = util.getMax(age1,age2);  //=��(������)���� ���� �ϰ� ������(����) �ֱ�
		System.out.println(result);
	}
}
