//ArithmeticException �� ���� ����ó���� �߰�
//DivTestTryCatch02 �� �� -> �� ��� ����ó���� �߰�(NumberFormatException)
//DivTestTryCatch04 4 0    ->�̰͸� ���� ����ó��
//ArithmeticException�� Exception�� ���ԵǴϱ� �����;� ��

class DivTestTryCatch05 
{
	public static void main(String[] args) 
	{
		try{
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			int result = a/b;
			System.out.println("���:"+result);
		}catch(ArithmeticException e){
			System.out.println("0���� ���� �� �����!");
		}catch(Exception e){
			System.out.println("�ι�° ���� 0�� �ƴ� �ΰ��� ���ڸ� ���� �� �ּ���!");
		}

	}
}

/*
DivTestTryCatch04.java:17: error: exception ArithmeticException has already been caught
                }catch(ArithmeticException e){
                 ^
1 error

�̹� ArithmeticException�� ���Ͽ� 15������ �� ó���Ǿ���!�������� �� ���� ����.
*/