class A  //��� �����ؾ� �Ǽ� Ŭ���� ������ ��
{
	int i;
	int j;

}

class B extends A   //i,j���� ��
{
	int k;

}


class InheritanceTest {
	public static void main(String[] args) 
	{
		B ob = new B(); //��ü����
		
		ob.i= 10;   //���ٸ���� ���� �ʾƼ� �ٷ� ���� ����
		ob.j=20;
		ob.k=30;
		System.out.println(ob.i);
		System.out.println(ob.j);
		System.out.println(ob.k);
	}
}
