class ForEachArray 
{
	public static void main(String[] args) 
	{
		int []data = {1,2,3,4,5};
		
		
		/*
		for (int i=0 ; i<data.length ; i++ ){
			System.out.println(data[i]);
		}
		*/ 


		for (int i : data ){   //for-each �ݺ��� -> i�� ��(�迭�� ���)�� �ϳ��� �������� ��
			System.out.println(i);   //�̷��� ��� ��, ���� �����ͼ� ����ϴ� ���̶�
			//System.out.println(data[i]);  �̷��� ���� �ȵ�, ��ġ�� �ƴ϶� ���� �������� ���̶�
			/* 
			System.out.println(data[i]);�� �ϸ� 
			i��ü�� �迭�� ���� �������µ� �ε����� ���� ������ 2,3,4,5 �̷��� ���
			data[1]->2, data[2]->3 ~
			
			*/
		}
	}
}
