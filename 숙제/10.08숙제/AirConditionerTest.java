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
			System.out.println("전원을 켰습니다.");
		}else{
			power = false;
			System.out.println("전원을 껐습니다.");
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
		a.app = "관리 가능";
		a.temperature = 18;
		a.temperatureUp();
		a.onoff(true);
		
		System.out.printf("어플로 %s하고 %s색상인 %s에어컨의 온도를 %d도로 조정합니다."
			,a.app,a.color,a.company,a.temperature);

	}
}
