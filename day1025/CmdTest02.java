//���α׷� ����ÿ� url�� ���޹޾�
//url�� ���� �ش� �޼ҵ带 ���۽�Ű�� ���α׷� �ۼ�
//<���� ��>
//java CmdTest http://www.sist.co.kr/insert.do
//�Խù��� ����Ͽ����ϴ�.
//java CmdTest http://www.sist.co.kr/update.do
//�Խù��� �����Ͽ����ϴ�.

//import java.util.Scanner;
import java.util.HashMap;
interface SistAction
{
	public void pro();
}

class InsertBoard implements SistAction{
	public void pro(){	
		System.out.println("�Խù��� ����Ͽ����ϴ�.");
	}
}
class ListBoard implements SistAction{
	public void pro(){
		System.out.println("�Խù� ����Դϴ�.");
	}
}
class UpdateBoard implements SistAction{
	public void pro(){
		System.out.println("�Խù��� �����Ͽ����ϴ�.");
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
		//cmd���� update.do�� ����

		SistAction action = map.get(cmd);
		action.pro();	//insert.do -> insertBoard�� �ִ� pro ����,�� pro��� �ؼ� �̷��Ը� ���� ��
		
		
	}
}
