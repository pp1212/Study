import java.util.Scanner;
class FirstCharFromString 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String data;
		System.out.println("���ڿ��� �Է��ϼ���==>");
		data = sc.next();
		char first;
		first = data.charAt(0);
		//char first = data.charAt(0);  //�̷��� �ڷ��� �����ϸ鼭 �ص� ��
		System.out.println("ù��° ���ڴ�" + first);
		//System.out.println("ù��° ���ڴ�" + data.charAt(0));  �̷��� �ص� ��

		//String first = data.charAt(0) + "";  //String���� ����� ���ؼ� + ""
		//String first = data.substring(0,1);
		//System.out.println("ù��° ���ڴ�" + first);


	}
}
