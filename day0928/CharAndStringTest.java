class CharAndStringTest 
{
	public static void main(String[] args) 
	{
		char firstName;
		firstName = '박';
		System.out.println(firstName);

		String name;
		name = "박성미";
		System.out.println(name);

		//char lastName;
		String lastName;
		lastName = "미";
		System.out.println(lastName);

		String data;
		data = "hello";
		char last = data.charAt(4);
		System.out.println("맨마지막에 있는 문자는" + last + "입니다.");

	}
}
