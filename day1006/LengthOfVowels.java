import java.util.Scanner;
class  LengthOfVowels
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String data;
		int cnt = 0;
		char c;
		System.out.print("���ڿ��� �Է��Ͻÿ�==>");
		data = sc.next();
		
		for (int i=0 ; i<data.length() ; i++ ){
			c = data.charAt(i);
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'U' || c == 'O' ){
				cnt++;
			}//end if
		}//end for
		System.out.println("������ ������ " + cnt + "�� �Դϴ�.");
		//System.out.printf("������ ���� %d���� �ϴ�.",cnt); 

	}
}
