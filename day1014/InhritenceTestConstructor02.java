class A{
	public A(int i){
		System.out.println("A�� ������ ������");
	}
}
class B extends A{
	public B(){
		System.out.println("B�� ������ ������");
	}
}

class InhritenceTestConstructor02
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
*/


