import java.io.IOException;   
class Lab02 
{
	public static void main(String[] args) throws IOException
	{
		System.out.print("���ڸ� �Է��Ͻÿ�:");
		char c = (char)System.in.read();
		
		switch(c){
			/*�̷��� �ص� �ǰ� �ؿ�ó�� �Ϸķ� �ص� ��� ����
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			*/
			
			//2,3,4��
			case 'a': case 'e': case 'i': case 'u': case 'o': case 'A': case 'E': case 'I': case 'U': case 'O':
				System.out.printf("�Էµ� ����%c�� �����Դϴ�." , c); //%c���� �ڿ� c������ �� ���ڰ� ���
				break;
			default:
				System.out.println("�Էµ� ���ڴ� ������ �ƴմϴ�.");
		}
		
		/*1��
		if (c == 'a'){
			System.out.printf("�Էµ� ����%c�� �����Դϴ�." , c);
		}
		*/
	}
}
