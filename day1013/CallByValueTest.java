/*
���� ���� ȣ��(Call By Value)
=>�޼ҵ� ȣ��ÿ� �⺻�ڷ����� ���޵Ǵ� ���
�޼ҵ� �ȿ��� ���޵� ������ ����Ǵ��� ȣ���ϴ� �ʿ����� ������� ����
*/

class CallByValueTest 
{
	//������ ���� 1���� �Ű������� ���޹޾� ���ϱ� 1�Ͽ� �ٽ� ������ �����ϰ� ����ϴ� �޼ҵ�
	//���� ���� ȣ���̾->���� ���� �ȵ�
	public static void plusOne(int n){   //101
		n = n + 1;
		System.out.println(n);
	}
	
	
	
	
	
	public static void main(String[] args)  //100
	{
		int data = 100;
		plusOne(data);
		System.out.println(data);
	}
}
