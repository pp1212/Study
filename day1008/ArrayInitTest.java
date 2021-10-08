class ArrayInitTest 
{
	static void init(double []values){
		for (int i=0 ; i<values.length ;i++ ){
			values[i] = 0;   //values 배열의 모든 요소 0으로 초기화
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
		printArray(arr);
		init(arr);
		printArray(arr);
	}
}
