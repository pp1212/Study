class InfiniteLoop02
{
	public static void main(String[] args) 
	{
		int i=1; //�ʱⰪ
		for (; ; ){
			System.out.println("hello");
			if(i>=3){       //���ǽ�
				break;
			}
			i++;  //������
		}
	}
}
