class A{ 
	public A(int i){   //�⺻�����ڸ��� �Ű������� ���� ������ �����ϰ� ���� ��
		System.out.println("A�� �Ű������� ���� ������ ������");
	}
}

class B extends A{
	public B(){
		super(100);   //�Ű����� ���� �����ڿ� �°� �Է�
		System.out.println("B�� ������ ������");
	}
}

class InhritenceTestConstructor04
{
	public static void main(String[] args) 
	{
		B ob = new B();  //B�� ��ü �����ϸ� B�� �θ�Ŭ������ ���� �����ϰ� �ڽ� ����
	}
}

/*
InhritenceTestConstructor02.java:7: error: constructor A in class A cannot be applied to given types;
        public B(){
                  ^
  required: int
  found: no arguments
  reason: actual and formal argument lists differ in length
1 error

=>�ڽ�Ŭ���� �������� ù ��° �ٿ��� �θ�Ŭ������ �⺻�����ڸ� �䱸�ϴ� super()�� ����
�׷��� �θ�Ŭ���� AŬ������ �⺻�����ڰ� �����Ƿ� ���� �߻�

	=>�θ�Ŭ������ �⺻�����ڸ� ������ְų�
	=>�ڽ�Ŭ������ �����ڿ��� �θ�Ŭ������ �Ű������� ���� �����ڸ� �䱸�ؾ� ��
	
*/


