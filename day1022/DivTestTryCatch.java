/*
	���α׷� ���� �ÿ� �� ���� ������ ���� �޾� ������ �� ����� ����ϴ� ���α׷� �ۼ�
	���α׷� ���� �ÿ� �ʿ��ϴٸ� �ʿ��� ���� ���� ����
	�̷��� �����ϴ� ���� main�޼ҵ��� �Ű����� �迭�� ������ ��
	������ �͸�ŭ �迭�� ũ�Ⱑ ��������
	���ʴ�� 0��° ��Һ��� ���̰� ��
	���� 4 2 5 �ϸ� -> String�� args�� 3�� ���� 

	java DivTestTryCatch 4 2      -> args�迭�� 0�� 4
	
	�ϳ��� try�ȿ� �������� catch�� �� �� ����

*/

class DivTestTryCatch 
{
	public static void main(String[] args) 
	{
		try{
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			int result = a/b;
			System.out.println("���:"+result);
		}catch( ArrayIndexOutOfBoundsException e ){
			System.out.println("����ÿ� ������ �� �� ���� �����ϼ���!");
		}

	}
}

