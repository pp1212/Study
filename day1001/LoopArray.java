class LoopArray 
{
	public static void main(String[] args) 
	{
		//1���� 45������ ���� 6���� ���غ���
		int []lotto = {4,11,19,26,27,43};

		//lotto[0] => 4
		System.out.println("�ǿ찡 ��õ�ϴ� �̹��� �ζ� ��ȣ");
		//�ݺ����� �̿��Ͽ� �迭�� ��� ��� ���

		//for(int i=0 ; i<6 ; i++){
		for(int i=0 ; i<lotto.length ; i++){  //���̰� 6�� �Ǹ� �ȵǴϱ� �����=�� ������ �ȵ�
			System.out.print(lotto[i]+" ");
		}
		
		/*
		System.out.print(lotto[0]+" ");
		System.out.print(lotto[1]+" ");
		System.out.print(lotto[2]+" ");
		System.out.print(lotto[3]+" ");
		System.out.print(lotto[4]+" ");
		System.out.print(lotto[5]+" ");  //lotto[6]�� �ȵ�
		*/
		

	}
}
