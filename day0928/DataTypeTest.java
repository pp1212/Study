class DataTypeTest 
{
	public static void main(String[] args) 
	{
		//byte age;
		//short age;
		int age;
		//long age;
		age = 27;  //대입연산자인데 자바에서는 저장,대입하라는 것   오른쪽에 있는 것을 왼쪽에 저장,대입하라
		System.out.println("임상진의 나이:" + age +"살입니다.");

		//double height;
		float height;
		//height = 173.8;
		//height = 173.8f;
		height = (float)173.8;
		System.out.println("임상진의 키 :" + height);


		char gender;
		gender = 'M';   //char는 ''
		//gender = "M";    ""로 묶으면 문자열(String)으로 취급하기 때문에 char에 저장할 수 없음
		System.out.println("임상진의 성별은 :" + gender);

		boolean isVaccine;
		isVaccine = true;
		System.out.println("임상진의 1차백신 접종여부:" + isVaccine);
		
	}
}
