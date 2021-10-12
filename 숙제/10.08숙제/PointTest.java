class Point{
	int x;
	int y;
	public int getX()  //값을 외부로 전달(리턴O)
	{
		return x;   //1
	}
	public void setX(int xCoord)   //외부의 값을 받아서 필드에 저장(리턴X)
	{
		x = xCoord;
	}
	

	//2
	public int getY()
	{
		return y;
	}
	public void setY(int yCoord)
	{
		y = yCoord;
	}
	

}



public class PointTest{
	public static void main(String[] args) 
	{
		Point p1 = new Point();
		//3
		p1.setX(100);
		p1.setY(200);

		//4
		Point p2 = new Point();
		p2.setX(100);
		p2.setY(300);

	}
}
