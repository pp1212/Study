//��ø�ݺ��� ��� �ؾ� ��
class  Exercise06_2
{
	public static void main(String[] args) 
	{
		int sum = 0;
		for (int i=10 ; i<=30 ; i++ ){
			for (int j=0; j<=5 ; j++ ){
				sum = sum + (i*j);  //sum += i*j;   //�� �ݺ��ϴ� Ƚ�� 21*6, i��10���� �����ؼ�
			}
		}
		System.out.println(sum);
	}
}
//1.sum�� �����Ǵ� ������ ������ for1�� ������ ��� �ݺ�
//2.������ �� ���� ����ص� �ż� for2 �ٱ���