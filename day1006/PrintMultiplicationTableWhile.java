class  PrintMultiplicationTableWhile
{
	public static void main(String[] args) 
	{
		int dan=2;
		while (dan<=9){
			System.out.printf("*** %d�� ***\n",dan);
			int i=1;   //�ݵ�� ���� �־�� ��!�����̶�� ����
			while (i<=9){
				System.out.printf("%d*%d=%d\n",dan,i,dan*i);
				i++;
			}
			dan++;
			System.out.println();
		}
	}
}
