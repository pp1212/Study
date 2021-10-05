
class SortArray 
{
	public static void main(String[] args) 
	{
		int []data = {5,2,3,9,1};
		//오름차순 정렬 : {1,2,3,5,9}
		for ( int i=0 ; i<data.length ; i++ ){
			
			for (int j=i+1 ; j<data.length ; j++ ){
				if (data[j] < data[i]){
					int temp = data[i]; //5를 넣음
					data[i] = data[j];  //0번째에 5를 넣음
					data[j] = temp;
				}

			}
		}
		System.out.println("*** 오름차순 정렬 결과 ***");
		for (int i=0 ; i<data.length ; i++ ){
			System.out.print(data[i] + " ");
		}
	}
}
