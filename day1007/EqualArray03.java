class EqualArray03 
{
	public static void main(String[] args) 
	{
		int []a = {1,2,3,4,5};
		int []b = {1,2,3,4,5,6,7,8};     
		

		//ó������ ���̸� ���ؼ� �ٸ��� �ƿ� ��������
		if(a.length != b.length){
			System.out.println("�迭�� ������ ��ġ���� �ʽ��ϴ�.");
			return;   //���� ���� �������� ����
		}



		boolean flag = true;                  
		for (int i=0 ; i<a.length ; i++ ){  //a[5]�� �ִµ� b[5]�� ���� ������ ����
			if (a[i] != b[i]){
				flag = false;  
				break;   
			}
		}
		
		if (flag){   
			System.out.println("�迭�� ������ ��ġ�մϴ�.");
		}else{
			System.out.println("�迭�� ������ ��ġ���� �ʽ��ϴ�.");
		}
		
		
		
		
		
		/*
		if(a == b){
			System.out.println("�迭�� ������ ��ġ�մϴ�.");
		}else{
			System.out.println("�迭�� ������ ��ġ���� �ʽ��ϴ�.");
		}*/
	}
}
