class CellPhone
{
	String name;
	String company;
	String color;
	String camera;
	boolean power;

	String getN(){
		return name;
	}
	void setN(String i){
		name = i;
	}
	String getC1(){
		return company;
	}
	void setC1(String j){
		company = j;
	}
	String getc2(){
		return color;
	}
	void setc2(String k){
		color = k;
	}
	String getc3(){
		return camera;
	}
	void setc3(String l){
		camera = l;
	}
	

	void onoff(boolean power){
		if (power == true){
			power = true;
			System.out.println("������ �����ֽ��ϴ�.");
		}else{
			power = false;
			System.out.println("������ �����ֽ��ϴ�.");
		}
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
		a.onoff(true);
		
		System.out.printf("%s���� ��õ� %s������ %s�� ī�޶� %s�Ǿ��ִ�.\n"
			,a.company,a.color,a.name,a.camera);
	}
}
