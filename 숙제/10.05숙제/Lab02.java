import java.io.IOException;
class Lab02 
{
	public static void main(String[] args) throws IOException
	{
		String s;
		
		System.out.printf("문자를 입력하시오: ");
		char c = (char) System.in.read();
        
		/* 1번
		if(c=='a' || c=='e' || c=='i' || c=='u' || c=='o'){
			System.out.printf("입력된 문자 %c은 모음입니다." , c);
		}else{
			System.out.printf("입력된 문자는 모음이 아닙니다.");
		}
		*/
		
		
		//2번,3번,4번
		switch(c)
		{
			case 'a': case 'e': case 'i': case 'u': case 'o':
			case 'A': case 'E': case 'I': case 'U': case 'O':
				System.out.printf("입력된 문자 %c은 모음입니다." , c);
				break;
			default:System.out.printf("입력된 문자는 모음이 아닙니다.");
		}
		
	}
}
