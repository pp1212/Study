class ArrayInitTest 
{
	static void init(double []values){   //��ü����->static,�Ű����� �ʿ�
		for (int i=0 ; i<values.length ;i++ ){
			values[i] = 0;   //values �迭�� ��� ��� 0���� �ʱ�ȭ
		}
	}
	
	static void printArray(double []data){
		for (int i=0;i<data.length ;i++ ){
			System.out.printf("%10.1f",data[i]);
		}
		System.out.println();
	}


	
	
	public static void main(String[] args){
		double []arr = {5.7,10.2,9.4,2.5,15.7};
		printArray(arr);   //��ü�����ϱ� �׳� ����
		init(arr);
		printArray(arr);
	}
}
