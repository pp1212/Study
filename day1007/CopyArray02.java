class CopyArray02
{
	public static void main(String[] args) 
	{
		int []a = {1,2,3,4,5};
		int []b = new int[5];
		
		for (int i=0 ; i<a.length ; i++ ){
			b[i] = a[i];
		}
		
		a[0] = 100;
		System.out.println("a�迭�� ���");
		for(int i:a){ //i�� �ε��� �ƴϰ� ��� ������
			System.out.printf("%5d",i);
		}		
		System.out.println();
		
		System.out.println("b�迭�� ���");
		for(int i:b){ //i�� �ε��� �ƴϰ� ��� ������
			System.out.printf("%5d",i);
		}	
		

	}
}
