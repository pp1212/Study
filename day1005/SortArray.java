
class SortArray 
{
	public static void main(String[] args) 
	{
		int []data = {5,2,3,9,1};
		//�������� ���� : {1,2,3,5,9}
		for ( int i=0 ; i<data.length ; i++ ){
			
			for (int j=i+1 ; j<data.length ; j++ ){
				if (data[j] < data[i]){
					int temp = data[i]; //5�� ����
					data[i] = data[j];  //0��°�� 5�� ����
					data[j] = temp;
				}

			}
		}
		System.out.println("*** �������� ���� ��� ***");
		for (int i=0 ; i<data.length ; i++ ){
			System.out.print(data[i] + " ");
		}
	}
}
