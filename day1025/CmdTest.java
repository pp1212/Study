//프로그램 실행시에 url을 전달받아
//url에 따라 해당 메소드를 동작시키는 프로그램 작성
//<실행 예>
//java CmdTest http://www.sist.co.kr/insert.do
//게시물을 등록하였습니다.
//java CmdTest http://www.sist.co.kr/update.do
//게시물을 수정하였습니다.

//import java.util.Scanner;
class CmdTest 
{

	public static void insertBoard(){
		System.out.println("게시물을 등록하였습니다.");
	}

	public static void listBoard(){
		System.out.println("게시물 목록입니다.");
	}

	public static void updateBoard(){
		System.out.println("게시물을 수정하였습니다.");
	}

	public static void main(String[] args) 
	{
		//Scanner sc = new Scanner(System.in);
		String url = aegs[0];

	}
}
