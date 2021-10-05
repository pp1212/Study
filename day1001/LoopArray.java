class LoopArray 
{
	public static void main(String[] args) 
	{
		//1부터 45까지의 숫자 6개를 말해본다
		int []lotto = {4,11,19,26,27,43};

		//lotto[0] => 4
		System.out.println("건우가 추천하는 이번주 로또 번호");
		//반복문을 이용하여 배열의 요소 모두 출력

		//for(int i=0 ; i<6 ; i++){
		for(int i=0 ; i<lotto.length ; i++){  //길이가 6이 되면 안되니깐 여기는=이 있으면 안됨
			System.out.print(lotto[i]+" ");
		}
		
		/*
		System.out.print(lotto[0]+" ");
		System.out.print(lotto[1]+" ");
		System.out.print(lotto[2]+" ");
		System.out.print(lotto[3]+" ");
		System.out.print(lotto[4]+" ");
		System.out.print(lotto[5]+" ");  //lotto[6]은 안됨
		*/
		

	}
}
