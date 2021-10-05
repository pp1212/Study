class Programming12 
{
	public static void main(String[] args) 
	{
		//7 소수인지 판별하려면 반복문 필요, i:2,3,4~100 소수인지 판별하려면 중첩반복문 필요
		//k:2,3~i-1

		for (int i=2 ; i<=100 ; i++){
			int cnt = 0;  //for안에 있어야 함,i의 약수의 개수가 구해지지 않음
			for (int k=2 ; k<i ; k++ ){
				if (i % k == 0){  //k가i의 약수인지 묻는 것
					cnt++;
				}
			}
			if (cnt == 0){
				System.out.print(i + " ");
			}
		}
	}
}
