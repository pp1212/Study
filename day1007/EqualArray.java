class EqualArray 
{
	public static void main(String[] args) 
	{
		int []a = {1,2,3,4,5};
		int []b = {1,2,3,4,5};
		
		boolean flag = true;
		for (int i=0 ; i<a.length ; i++ ){
			if (a[i] != b[i]){
				flag = false;  //���� ������ ������ flag�� false�� ��
				break;   //���� ������ �ϳ��� ������ Ż��
			}
		}
		
		if (flag){  //flag==true�̳İ� �ȹ������ �⺻���� true�� if(flag)�� true�İ� ���°Ŵ�
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
