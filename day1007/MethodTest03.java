class MyUtil
{
	int getMax(int a, int b){      //메소드로 받으면 보통 get으로 시작,리턴값 있어서 자료형int써줌
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
		result = util.getMax(age1,age2);  //=뒤(오른쪽)에서 먼저 하고 앞으로(왼쪽) 넣기
		System.out.println(result);
	}
}
