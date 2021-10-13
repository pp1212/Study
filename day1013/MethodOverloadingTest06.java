//정수형 배열을 매개변수로 전달받아 총합을 구하여 반환하는 메소드와 
//실수형 배열을 매개변수로 전달받아 총합을 구하여 반환하는 메소드를 
//중복하여 정의하고 호출

class SistUtil
{
	/*
	public static int getSum(int []data){
		int sum = 0;
		for (int i=0 ; i<data.length ; i++ ){
			sum += data[i];
		}
		return sum;
	}*/


	public static int getSum(int []data){
		int sum = 0;
		for(int i:data){
			sum += i;
		}
		return sum;
	}


	public static double getSum(double []data){
		double sum = 0;
		for (double i:data){
			sum += i;
		}
		return sum;
	}

}

class  MethodOverloadingTest06
{
	public static void main(String[] args) 
	{
		int []arr1 = {10,20,30,40};
		double []arr2 = {10.5,20.7,35.6,62.8,80.5,93.7};

		System.out.printf("정수형 배열의 총합:%d\n",SistUtil.getSum(arr1));
		System.out.printf("실수형 배열의 총합:%.1f\n",SistUtil.getSum(arr2));
	}
}
