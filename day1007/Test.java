class MyUtil
{
	void equalArray(int []data1, int []data2){
		if(data1.length != data2.length){
			System.out.println("배열의 내용이 일치하지 않습니다.");
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
			System.out.println("배열의 내용이 일치합니다.");
		}else{
			System.out.println("배열의 내용이 일치하지 않습니다.");
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

