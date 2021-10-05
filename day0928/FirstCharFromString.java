import java.util.Scanner;
class FirstCharFromString 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String data;
		System.out.println("문자열을 입력하세요==>");
		data = sc.next();
		char first;
		first = data.charAt(0);
		//char first = data.charAt(0);  //이렇게 자료형 지정하면서 해도 됨
		System.out.println("첫번째 문자는" + first);
		//System.out.println("첫번째 문자는" + data.charAt(0));  이렇게 해도 됨

		//String first = data.charAt(0) + "";  //String으로 만들기 위해서 + ""
		//String first = data.substring(0,1);
		//System.out.println("첫번째 문자는" + first);


	}
}
