class SistUtil
{
	//�� ���� ������ �Ű������� ���޹޾� �� �߿� ū���� ã�� ����ϴ� �޼ҵ� ����
	public static void max(int a,int b){    //�޼ҵ� �ڷ��� �ٸ�
		int r = a;
		if(b>r){
			r = b;
		}
		System.out.println("ū���� "+ r +"�Դϴ�.");
		
		
	}


	//�� ���� �Ǽ��� �Ű������� ���޹޾� �� �߿� ū���� ã�� ����ϴ� �޼ҵ� ����
	public static void max(double a,double b){      //�޼ҵ� �ڷ��� �ٸ�
		double r = a;
		if (b>r){
			r = b;
		}
		System.out.println("ū���� "+ r +"�Դϴ�.");
	}

}


class  MethodOverloadingTest02
{
	public static void main(String[] args) 
	{
		//�� ���� max�޼ҵ带 ȣ��
		
		SistUtil.max(20,30);
		SistUtil.max(25.7,25.8);
	}
}

//���� �޼ҵ���� Ŭ�����޼ҵ�� �����ϱ�