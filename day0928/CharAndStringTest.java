class CharAndStringTest 
{
	public static void main(String[] args) 
	{
		char firstName;
		firstName = '��';
		System.out.println(firstName);

		String name;
		name = "�ڼ���";
		System.out.println(name);

		//char lastName;
		String lastName;
		lastName = "��";
		System.out.println(lastName);

		String data;
		data = "hello";
		char last = data.charAt(4);
		System.out.println("�Ǹ������� �ִ� ���ڴ�" + last + "�Դϴ�.");

	}
}
