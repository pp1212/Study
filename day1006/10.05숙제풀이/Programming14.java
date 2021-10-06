class Programming14 
{
	public static void main(String[] args) 
	{
		for (int dan=2 ; dan<=9 ; dan++ ){
			System.out.println(dan + "단");  //단을 출력하기 전에 "2단"처럼 출력
			for (int i=1 ; i<=9 ; i++ ){
				System.out.println(dan + "*" + i + "=" + (dan*i));	
			}//end for i
			System.out.println();  //단과 단 사이에 빈줄을 출력
		}//end for dan
	}//end main
}//end class

//dan :2,3,~9 총 8번
//i:1~9 총9번
//총 8*9번 반복
//단이 끝날 때 빈줄 출력->System.out.println();