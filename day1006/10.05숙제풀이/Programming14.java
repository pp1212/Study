class Programming14 
{
	public static void main(String[] args) 
	{
		for (int dan=2 ; dan<=9 ; dan++ ){
			System.out.println(dan + "��");  //���� ����ϱ� ���� "2��"ó�� ���
			for (int i=1 ; i<=9 ; i++ ){
				System.out.println(dan + "*" + i + "=" + (dan*i));	
			}//end for i
			System.out.println();  //�ܰ� �� ���̿� ������ ���
		}//end for dan
	}//end main
}//end class

//dan :2,3,~9 �� 8��
//i:1~9 ��9��
//�� 8*9�� �ݺ�
//���� ���� �� ���� ���->System.out.println();