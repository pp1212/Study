class MatrixTest 
{
	public static void main(String[] args) 
	{
		int [][]a;
		a = new int[5][3]; //5행 3열 15개 만들어짐

		
		int n = 1;
		for (int i=0 ; i<5 ; i++ ){
			for (int j=0 ; j<3 ; j++ ){
				a[i][j] = n++;

			}

		}//총 15번 반복
		
		for (int i=0;i<5 ;i++ ){
			for (int j=0;j<3 ;j++ ){
				System.out.printf("%5d",a[i][j]); //%5d  5칸을 잡고 출력
			}
			System.out.println();  //한 행이 출력되면 줄 바꿈
		}
		




	}
}
