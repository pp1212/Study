class A{
	public A(){
		System.out.println("A�� ������ ������");
	}
}
class B extends A{
	public B(){
		super();  //����(�ᵵ �ǰ� �Ƚᵵ ��) ,�θ�Ŭ������ �⺻������ �䱸
		System.out.println("B�� ������ ������");
	}
}

class InhritenceTestConstructor 
{
	public static void main(String[] args) 
	{
		B ob = new B();  //B�� ��ü �����ϸ� B�� �θ�Ŭ������ ���� �����ϰ� �ڽ� ����
	}
}

/*
	�ڽ�Ŭ������ B�� ��ü�� �����ϸ� 
	�θ�Ŭ������ A�� �����ڰ� ���� �����ϰ�
	�ڽ�Ŭ������ B�� �����ڰ� ���ʷ� ������
	�ڽ�Ŭ������ B�� �������� ù ��° �ٿ� �θ�Ŭ������ �⺻�����ڸ� �䱸�ϴ� super();�� ������
	
*/


