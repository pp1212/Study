class Bike				
{
	private int gear;			
	public int speed;
	
}
//class MountainBike expands Bike -> extends
class MountainBike extends Bike		 
{
	public int seatHeight;
	//public void MountainBike(int g){	//생성자이름 왼쪽에는 void를 쓸 수 없음
	public MountainBike(int g){
		super();
		gear = g; 
		//부모클래스의 private영역에는 접근할 수 없음
		//부모클래스를 만들 때 gear를 protected로 하거나
		//setter를 통해서 접근해야 함
	}
	
}



class  Exercise03
{
	public static void main(String[] args) 
	{
		
	}
}
