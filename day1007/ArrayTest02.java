class ArrayTest02
{
	public static void main(String[] args) 
	{
		int []a;
		a = new int[5]; 
		
		int []b = new int[5];
		boolean []c = new boolean[5];
		double []d = new double[5];
		String []e = new String[5];
		
		a[0] = 100;
		b[0] = 100;

		System.out.println(a[0]);
		System.out.println(b[0]);

		System.out.println(a[1]); //0  �迭�� �ڵ����� �ʱ�ȭ �Ǿ
		System.out.println(b[1]); //0
		System.out.println(c[1]); //false
		System.out.println(d[1]); //0.0
		System.out.println(e[1]); //null

		a[5] = 100;  //�ε����� 0���� �����ϱ� ������ a�迭��0~4������ �ε����� �־ 5�� ����� �� ����
		System.out.println(a[5]);


	}
}
/* a[5]�ϸ� ���� ����
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
        at ArrayTest02.main(ArrayTest02.java:25)
*/