class MyUtil
{
	void equalArray(int []data1, int []data2){
		if(data1.length != data2.length){
			System.out.println("�迭�� ������ ��ġ���� �ʽ��ϴ�.");
			return;   
		}
		
		boolean flag = true;                  
		for (int i=0 ; i<data1.length ; i++ ){
			if (data1[i] != data2[i]){
				flag = false;  
				break;   
			}
		}
		
		if (flag && data1.length == data2.length){   
			System.out.println("�迭�� ������ ��ġ�մϴ�.");
		}else{
			System.out.println("�迭�� ������ ��ġ���� �ʽ��ϴ�.");
		}

	}
}





class Test 
{
	public static void main(String[] args) 
	{
		int []a = {10,20,30,40,50};
		int []b = {60,70,80,90,100};
		
		
		MyUtil util = new MyUtil();
		util.equalArray(a,b);
		
	}
}

