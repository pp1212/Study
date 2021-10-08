import java.util.Scanner;
class CountLetter 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int []count = new int[26]; //[0][0][0][0]~[0] -> 배열은 만들면 자동으로 초기화

		System.out.print("문자열을 입력하시오:");
		//String buffer = sc.next();      //공백문자 못 받음
		String buffer = sc.nextLine();   //공백문자 받음

		System.out.println(buffer);

		//각 문자가 등장하는 횟수를 계산한다(단,빈칸은 제외)
		for (int i=0;i<buffer.length() ;i++ ){   
			char ch = buffer.charAt(i);
			if (ch != ' '){
				if(ch>='A' && ch<='Z'){   //대문자도 세기 위해서 소문자로 바꾸고 횟수 센다
					ch = (char)(ch + 32);
				}
				count[ch-'a']++;
			}
		}

		//배열에 저장된 횟수 출력하는 반복문 //왼쪽에 어떤 문자의 횟수인지 출력하도록 수정
		for (int i=0;i<count.length ;i++ ){
			System.out.printf("%10c%5d\n",(char)('a'+i),count[i]);
		}
	}
}

//'a':97
//'A':65
//'a'-'A'=32

//대문자를  소문자로 바꾸려면 
//(char)(ch+32)