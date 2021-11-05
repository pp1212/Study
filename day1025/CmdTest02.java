//프로그램 실행시에 url을 전달받아
//url에 따라 해당 메소드를 동작시키는 프로그램 작성
//<실행 예>
//java CmdTest http://www.sist.co.kr/insert.do
//게시물을 등록하였습니다.
//java CmdTest http://www.sist.co.kr/update.do
//게시물을 수정하였습니다.

//import java.util.Scanner;
import java.util.HashMap;
interface SistAction
{
	public void pro();
}

class InsertBoard implements SistAction{
	public void pro(){	
		System.out.println("게시물을 등록하였습니다.");
	}
}
class ListBoard implements SistAction{
	public void pro(){
		System.out.println("게시물 목록입니다.");
	}
}
class UpdateBoard implements SistAction{
	public void pro(){
		System.out.println("게시물을 수정하였습니다.");
	}
}

class CmdTest02 
{
	public static void main(String[] args) 
	{
		HashMap<String,SistAction> map = new HashMap<String,SistAction>();
		
		map.put("insert.do",new InsertBoard());
		map.put("list.do",new ListBoard());
		map.put("update.do",new UpdateBoard());

		String url = args[0];
		String cmd = url.substring(  url.lastIndexOf("/") +1 );
		//java CmdTest http://www.sist.co.kr/update.do
		//cmd에는 update.do만 나옴

		SistAction action = map.get(cmd);
		action.pro();	//insert.do -> insertBoard에 있는 pro 동작,다 pro라고 해서 이렇게만 쓰면 됨
		
		
	}
}
