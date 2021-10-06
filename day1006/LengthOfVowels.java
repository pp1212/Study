import java.util.Scanner;
class  LengthOfVowels
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String data;
		int cnt = 0;
		char c;
		System.out.print("문자열을 입력하시오==>");
		data = sc.next();
		
		for (int i=0 ; i<data.length() ; i++ ){
			c = data.charAt(i);
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'U' || c == 'O' ){
				cnt++;
			}//end if
		}//end for
		System.out.println("모음의 개수는 " + cnt + "개 입니다.");
		//System.out.printf("모음의 수는 %d개입 니다.",cnt); 

	}
}
