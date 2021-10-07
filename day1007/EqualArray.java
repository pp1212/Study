class EqualArray 
{
	public static void main(String[] args) 
	{
		int []a = {1,2,3,4,5};
		int []b = {1,2,3,4,5};
		
		boolean flag = true;
		for (int i=0 ; i<a.length ; i++ ){
			if (a[i] != b[i]){
				flag = false;  //같지 않은게 있으면 flag가 false가 됨
				break;   //같지 않은게 하나라도 있으면 탈출
			}
		}
		
		if (flag){  //flag==true이냐고 안물어봐도 기본값이 true라서 if(flag)는 true냐고 묻는거다
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
