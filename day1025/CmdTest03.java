//프로그램 실행시에 url을 전달받아
//url에 따라 해당 메소드를 동작시키는 프로그램 작성
//<실행 예>
//java CmdTest http://www.sist.co.kr/insert.do
//게시물을 등록하였습니다.
//java CmdTest http://www.sist.co.kr/update.do
//게시물을 수정하였습니다.

//import java.util.Scanner;
import java.util.HashMap;
import java.io.FileReader;
import java.util.Properties;
import java.util.Set;
import java.util.Iterator;

class CmdTest03
{
	public static void main(String[] args) throws Exception
	{
		//사용자가 요청하는 서비스명을 key로 하고 일처리담당 객체를 value로 담기 위한 map 생성 
		HashMap<String,SistAction> map = new HashMap<String,SistAction>();

		//서비스명과 일처리담당클래스명이 있는 파일객체를 생성함
		FileReader fr = new FileReader("sist.properties");

		//파일의 내용을 key와 value로 관리하기 위한 객체 생성함
		Properties prop = new Properties();	//분리

		//파일의 내용을 읽어 들임
		prop.load(fr);						//load

		//프로퍼티 파일로부터 key목록(서비스명)을 반복자 객체로 생성함
		Iterator iter = prop.keySet().iterator();		//key 다 뽑아옴

		//key가 있는만큼 반복 실행함
		while(iter.hasNext()){

			//key(서비스명)를 하나씩 꺼내서 옴
			String cmd = (String)iter.next();		//서비스명
			
			//key에 해당하는 value(일처리 담당하는 클래스이름)를 꺼내서 옴
			String clsName = (String)prop.get(cmd);

			//문자열로 되어 있는 클래스이름에 해당하는 객체를 생성함
			SistAction obj = (SistAction) Class.forName(clsName).newInstance();
			
			//사용자가 요청할 서비스명과 일처리 담당하는 객체를 
			map.put(cmd,obj);
		}

		//프로그램 실행시에 전달되는 매개변수를 url변수에 저장함
		String url = args[0];

		//url로 부터 서비스명을 잘라 변수에 저장함
		String cmd = url.substring(  url.lastIndexOf("/") +1 );
		//java CmdTest http://www.sist.co.kr/update.do
		//cmd에는 update.do만 나옴
		
		//map으로부터 서비스명에 해당하는 일처리담당객체를 뽑아옴
		SistAction action = map.get(cmd);

		//일처리를 위한 메소드를 호출함
		action.pro();	//insert.do -> insertBoard에 있는 pro 동작,다 pro라고 해서 이렇게만 쓰면 됨
		
		
	}
}
