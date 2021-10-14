class MyUtil
{
	//정수형
	public static int[] unionArray(int []a,int []b){
		int []result = new int[a.length + b.length];
			
		int i;
		for (i=0;i<a.length ;i++ ){
			result[i]=a[i];
		}//i:3일때 탈출
		for (int j=0;j<b.length ;j++ ){
			//result[i]=b[j];
			//i++;     같은 뜻
			result[i++]=b[j];
		}
		return result;
	}
	
	//실수형
	public static double[] unionArray(double []a,double []b){
		double result[] = new double[a.length + b.length];
		int i;
		for (i=0;i<a.length ;i++ ){
			result[i]=a[i];
		}
		for (int j=0;j<b.length ;j++ ){       //여기는 double안됨->인덱스 접근이라서
			result[i+j]=b[j];   //여기서 i쓰려면 반복문 전에 선언
		}
		return result;
	}


	//정수형 배열을 매개변수로 전달받아 배열의 요소를 모두 출력하는 메소드
	public static void printArray(int []arr){
		for (int i:arr ){
			System.out.printf("%10d",i);
		}
		System.out.println();
	}
	
	
	//실수형 배열을 매개변수로 전달받아 배열의 요소를 모두 출력하는 메소드
	public static void printArray(double []arr){
		for (double i:arr ){				//여기는 double 됨->값 접근이라서
			System.out.printf("%10.1f",i);
		}
		System.out.println();
	}
}


class  Exam01
{
	
	public static void main(String[] args) 
	{
		int []a = {10,20,30};
		int []b = {40,50,60,70};

		double []c = {2.7,6.9,3.2};
		double []d = {1.4,5.8};


		int []arr1 = MyUtil.unionArray(a,b);
		double []arr2 = MyUtil.unionArray(c,d);

		MyUtil.printArray(arr1);
		MyUtil.printArray(arr2);
	}
}
