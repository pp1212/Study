class Programming12 
{
	public static void main(String[] args) 
	{
		//7 �Ҽ����� �Ǻ��Ϸ��� �ݺ��� �ʿ�, i:2,3,4~100 �Ҽ����� �Ǻ��Ϸ��� ��ø�ݺ��� �ʿ�
		//k:2,3~i-1

		for (int i=2 ; i<=100 ; i++){
			int cnt = 0;  //for�ȿ� �־�� ��,i�� ����� ������ �������� ����
			for (int k=2 ; k<i ; k++ ){
				if (i % k == 0){  //k��i�� ������� ���� ��
					cnt++;
				}
			}
			if (cnt == 0){
				System.out.print(i + " ");
			}
		}
	}
}
