class IncreamentDeCreament 
{
	public static void main(String[] args) 
	{
		int i = 5;  
		int j = 5;  
		i++;   //i = i+1 ������ ��,�� ���������ڿ� ->��� �ٴ� �Ȱ���  
		++j;  // j = j+1
		System.out.println(i);
		System.out.println(j);
		
		System.out.println("----------------------------------------");
		//a++�� a+1�� �ٸ�
		int a = 10;
		int b = 10;
		System.out.println(a+1);  //a�� �׳�1�� ���ϴ� ��
		System.out.println(b++);  //a�� 1�� ���ϰ� �ٽ� �����ϴ� ��
		System.out.println("----------------------------------------");
		System.out.println(a);
		System.out.println(b);
		System.out.println("----------------------------------------");

		int n =5;
		int m =5;
		n--;
		--m;
		System.out.println(n);
		System.out.println(m);
		System.out.println("----------------------------------------");

		i = 5;
		j = 5;
		a = ++i;  //������ ���Կ����ڶ� �־ �ǹ̰� �ٸ�
		b = j++;
		System.out.println("i:" + i);
		System.out.println("j:" + j);
		System.out.println("a:" + a);
		System.out.println("b:" + b);
		System.out.println("----------------------------------------");

		i = 5;
		j = 5;
		int k = 5;
		System.out.println(++i);  //6
		System.out.println(j++);  //5
		System.out.println(k+1);  //6
		System.out.println(i);    //6
		System.out.println(j);    //6
		System.out.println(k);    //5
			


	}
}
