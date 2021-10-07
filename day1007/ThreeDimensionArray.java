class  ThreeDimensionArray
{
	public static void main(String[] args) 
	{
		int [][][]a = new int[2][3][4];  //24개 만들어짐
		
		for (int i=0;i<2 ;i++ ){			//면:0,1
			for (int j=0;j<3 ;j++ ){		//행:0,1,2
				for (int k=0;k<4 ;k++ ){	//열:0,1,2,3
					a[i][j][k] = i+1;		//24번 동작
				}	
			}
		}

		for (int i=0;i<2 ;i++ ){
			for (int j=0;j<3 ;j++ ){
				for (int k=0;k<4 ;k++ ){
					System.out.printf("%5d",a[i][j][k]);
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
