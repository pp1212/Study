class EqualArray03 
{
	public static void main(String[] args) 
	{
		int []a = {1,2,3,4,5};
		int []b = {1,2,3,4,5,6,7,8};     
		

		//처음부터 길이를 비교해서 다르면 아예 끝내버림
		if(a.length != b.length){
			System.out.println("배열의 내용이 일치하지 않습니다.");
			return;   //뒤의 내용 실행하지 않음
		}



		boolean flag = true;                  
		for (int i=0 ; i<a.length ; i++ ){  //a[5]는 있는데 b[5]는 없기 때문에 오류
			if (a[i] != b[i]){
				flag = false;  
				break;   
			}
		}
		
		if (flag){   
			System.out.println("배열의 내용이 일치합니다.");
		}else{
			System.out.println("배열의 내용이 일치하지 않습니다.");
		}
		
		
		
		
		
		/*
		if(a == b){
			System.out.println("배열의 내용이 일치합니다.");
		}else{
			System.out.println("배열의 내용이 일치하지 않습니다.");
		}*/
	}
}
