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
			System.out.println("전원이 켜져있습니다.");
		}else{
			power = false;
			System.out.println("전원이 꺼져있습니다.");
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
		a.camera = "장착";
		a.onoff(true);
		
		System.out.printf("%s에서 출시된 %s색깔의 %s는 카메라가 %s되어있다.\n"
			,a.company,a.color,a.name,a.camera);
	}
}
