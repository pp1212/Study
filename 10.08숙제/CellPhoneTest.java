class CellPhone
{
	String name;
	String company;
	String color;
	String camera;
	boolean power;
	
	void power(String onoff){
		System.out.printf("%s���� ��õ� %s������ %s�� ī�޶� %s�Ǿ��ְ� ������ %s �����̴�.\n",company,color,name,camera,onoff);
	}
	
	

}


class CellPhoneTest 
{
	public static void main(String[] args) 
	{
		CellPhone a = new CellPhone();

		a.name = "iphone13";
		a.company = "apple";
		a.color = "silver";
		a.camera = "����";
		a.power("����");
		
	}
}
