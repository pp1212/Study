import java.io.IOException;
class Lab02 
{
	public static void main(String[] args) throws IOException
	{
		String s;
		
		System.out.printf("���ڸ� �Է��Ͻÿ�: ");
		char c = (char) System.in.read();
        
		/* 1��
		if(c=='a' || c=='e' || c=='i' || c=='u' || c=='o'){
			System.out.printf("�Էµ� ���� %c�� �����Դϴ�." , c);
		}else{
			System.out.printf("�Էµ� ���ڴ� ������ �ƴմϴ�.");
		}
		*/
		
		
		//2��,3��,4��
		switch(c)
		{
			case 'a': case 'e': case 'i': case 'u': case 'o':
			case 'A': case 'E': case 'I': case 'U': case 'O':
				System.out.printf("�Էµ� ���� %c�� �����Դϴ�." , c);
				break;
			default:System.out.printf("�Էµ� ���ڴ� ������ �ƴմϴ�.");
		}
		
	}
}
