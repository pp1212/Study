import java.io.IOException;   
class Lab02 
{
	public static void main(String[] args) throws IOException
	{
		System.out.print("문자를 입력하시오:");
		char c = (char)System.in.read();
		
		switch(c){
			/*이렇게 해도 되고 밑에처럼 일렬로 해도 상관 없음
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			*/
			
			//2,3,4번
			case 'a': case 'e': case 'i': case 'u': case 'o': case 'A': case 'E': case 'I': case 'U': case 'O':
				System.out.printf("입력된 문자%c는 모음입니다." , c); //%c에는 뒤에 c변수에 들어갈 문자가 출력
				break;
			default:
				System.out.println("입력된 문자는 모음이 아닙니다.");
		}
		
		/*1번
		if (c == 'a'){
			System.out.printf("입력된 문자%c는 모음입니다." , c);
		}
		*/
	}
}
