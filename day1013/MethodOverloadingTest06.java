//������ �迭�� �Ű������� ���޹޾� ������ ���Ͽ� ��ȯ�ϴ� �޼ҵ�� 
//�Ǽ��� �迭�� �Ű������� ���޹޾� ������ ���Ͽ� ��ȯ�ϴ� �޼ҵ带 
//�ߺ��Ͽ� �����ϰ� ȣ��

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

		System.out.printf("������ �迭�� ����:%d\n",SistUtil.getSum(arr1));
		System.out.printf("�Ǽ��� �迭�� ����:%.1f\n",SistUtil.getSum(arr2));
	}
}
