//ArithmeticException �� ���� ����ó���� �߰�
//DivTestTryCatch02 �� �� -> �� ��� ����ó���� �߰�(NumberFormatException)
//DivTestTryCatch04 4 0    ->�̰͸� ���� ����ó��
//ArithmeticException�� Exception�� ���ԵǴϱ� �����;� ��

class DivTestTryCatch04 
{
	public static void main(String[] args) 
	{
		try{
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			int result = a/b;
			System.out.println("���:"+result);
		}catch(Exception e){
			System.out.println("�ι�° ���� 0�� �ƴ� �ΰ��� ���ڸ� ���� �� �ּ���!");
		}catch(ArithmeticException e){
			System.out.println("0���� ���� �� �����!");
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