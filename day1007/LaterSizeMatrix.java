class LaterSizeMatrix 
{
	public static void main(String[] args) 
	{
		int [][]a;
		a = new int[3][4];

		int n=1;
		for (int i=0;i<a.length ;i++ ){
			for (int j=0;j<a[i].length ;j++ ){  //지금은 배열의 열이 같기 때문에 j<a[0].length라고 써도 됨
				a[i][j] = n++;
			}
		}

		for (int i=0;i<a.length ;i++ ){
			for (int j=0;j<a[i].length ;j++ ){
				System.out.printf("%5d",a[i][j]);
			}
			System.out.println();
		}
	}
}
