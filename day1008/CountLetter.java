import java.util.Scanner;
class CountLetter 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int []count = new int[26]; //[0][0][0][0]~[0] -> �迭�� ����� �ڵ����� �ʱ�ȭ

		System.out.print("���ڿ��� �Է��Ͻÿ�:");
		//String buffer = sc.next();      //���鹮�� �� ����
		String buffer = sc.nextLine();   //���鹮�� ����

		System.out.println(buffer);

		//�� ���ڰ� �����ϴ� Ƚ���� ����Ѵ�(��,��ĭ�� ����)
		for (int i=0;i<buffer.length() ;i++ ){   
			char ch = buffer.charAt(i);
			if (ch != ' '){
				if(ch>='A' && ch<='Z'){   //�빮�ڵ� ���� ���ؼ� �ҹ��ڷ� �ٲٰ� Ƚ�� ����
					ch = (char)(ch + 32);
				}
				count[ch-'a']++;
			}
		}

		//�迭�� ����� Ƚ�� ����ϴ� �ݺ��� //���ʿ� � ������ Ƚ������ ����ϵ��� ����
		for (int i=0;i<count.length ;i++ ){
			System.out.printf("%10c%5d\n",(char)('a'+i),count[i]);
		}
	}
}

//'a':97
//'A':65
//'a'-'A'=32

//�빮�ڸ�  �ҹ��ڷ� �ٲٷ��� 
//(char)(ch+32)