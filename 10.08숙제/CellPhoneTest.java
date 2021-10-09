class CellPhone
{
	String name;
	String company;
	String color;
	String camera;
	boolean power;
	
	void power(String onoff){
		System.out.printf("%s에서 출시된 %s색깔의 %s은 카메라가 %s되어있고 전원이 %s 상태이다.\n",company,color,name,camera,onoff);
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
		a.camera = "장착";
		a.power("켜진");
		
	}
}
