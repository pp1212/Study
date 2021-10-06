import java.util.Scanner;
class  LengthOfVowels_Switch
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
			switch(c){
				case 'a':case 'e':case 'i':case 'o':case 'u':case 'A':case 'E':case 'I':case 'O':case 'U':
				cnt++;			
			}
		}//end for
		System.out.println("모음의 개수는 " + cnt + "개 입니다.");
		System.out.printf("모음의 개수는 %d개 입니다.",cnt); 

	}
}
