class Bike				
{
	private int gear;			
	public int speed;
	
}
//class MountainBike expands Bike -> extends
class MountainBike extends Bike		 
{
	public int seatHeight;
	//public void MountainBike(int g){	//�������̸� ���ʿ��� void�� �� �� ����
	public MountainBike(int g){
		super();
		gear = g; 
		//�θ�Ŭ������ private�������� ������ �� ����
		//�θ�Ŭ������ ���� �� gear�� protected�� �ϰų�
		//setter�� ���ؼ� �����ؾ� ��
	}
	
}



class  Exercise03
{
	public static void main(String[] args) 
	{
		
	}
}
