/*
	���α׷� ���� �ÿ� �� ���� ������ ���� �޾� ������ �� ����� ����ϴ� ���α׷� �ۼ�
	���α׷� ���� �ÿ� �ʿ��ϴٸ� �ʿ��� ���� ���� ����
	�̷��� �����ϴ� ���� main�޼ҵ��� �Ű����� �迭�� ������ ��
	������ �͸�ŭ �迭�� ũ�Ⱑ ��������
	���ʴ�� 0��° ��Һ��� ���̰� ��
	���� 4 2 5 �ϸ� -> String�� args�� 3�� ���� 

	java DivTest 4 2
	args�迭�� 0�� 4
	

*/

class DivTest 
{
	public static void main(String[] args) 
	{
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int result = a/b;
		System.out.println("���:"+result);

	}
}
/*
C:\javaStudy\day1022>java DivTest
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
        at DivTest.main(DivTest.java:19)

C:\javaStudy\day1022>java DivTest 10
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1
        at DivTest.main(DivTest.java:20)

�� ���α׷��� ����ÿ� ������ �� �� ���� �����ؾ� ���������� �����ϴµ� 
���� ���� �ϳ��� �������� �ʰų�
�� ���� �����ϸ� "����"�� �߻�
*/
