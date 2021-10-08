class CharAndInt 
{
	public static void main(String[] args) 
	{
		int k = 65;
		System.out.println((char)k);
			
		char ch = 'A';
		System.out.println(ch + 1);  //수식을 만나면 정수로 변환하여 출력
		System.out.println((char)(ch + 1));  //정수를 char로 형변환하여 출력
	}
}
