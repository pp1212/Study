class DataTypeTest 
{
	public static void main(String[] args) 
	{
		//byte age;
		//short age;
		int age;
		//long age;
		age = 27;  //���Կ������ε� �ڹٿ����� ����,�����϶�� ��   �����ʿ� �ִ� ���� ���ʿ� ����,�����϶�
		System.out.println("�ӻ����� ����:" + age +"���Դϴ�.");

		//double height;
		float height;
		//height = 173.8;
		//height = 173.8f;
		height = (float)173.8;
		System.out.println("�ӻ����� Ű :" + height);


		char gender;
		gender = 'M';   //char�� ''
		//gender = "M";    ""�� ������ ���ڿ�(String)���� ����ϱ� ������ char�� ������ �� ����
		System.out.println("�ӻ����� ������ :" + gender);

		boolean isVaccine;
		isVaccine = true;
		System.out.println("�ӻ����� 1����� ��������:" + isVaccine);
		
	}
}
