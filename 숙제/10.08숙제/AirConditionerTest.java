class AirConditioner
{
	String company;
	String color;
	String app;
	boolean power;
	int temperature;
	
	String getC1(){
		return company;
	}
	void setC1(String i){
		company = i; 
	}
	String getC2(){
		return color;
	}
	void setc2(String j){
		color = j;
	}
	String geta(){
		return app;
	}
	void seta(String k){
		app = k;
	}
	int getT(){
		return temperature;
	}
	void setT(int l){
		temperature = l;
	}


	void onoff(boolean power){
		if (power == true){
			power = true;
			System.out.println("������ �׽��ϴ�.");
		}else{
			power = false;
			System.out.println("������ �����ϴ�.");
		}
	}
	
	
	void temperatureUp(){
		++temperature;
	}
	void temperatureDown(){
		--temperature;
	}

}


class AirConditionerTest 
{
	public static void main(String[] args) 
	{
		AirConditioner a = new AirConditioner();

		a.company = "LG";
		a.color = "white";
		a.app = "���� ����";
		a.temperature = 18;
		a.temperatureUp();
		a.onoff(true);
		
		System.out.printf("���÷� %s�ϰ� %s������ %s�������� �µ��� %d���� �����մϴ�."
			,a.app,a.color,a.company,a.temperature);

	}
}
