class Point{
	int x;
	int y;
	public int getX(){  //속성(멤버변수) x의 값으로 반환하는 기능 =>접근자
		return x;
	}
	public void setX(int xCoord){   //매개변수로 전달받은 값을 속성(멤버변수)x로 설정(변경)하는 기능  =>설정자
		x = xCoord;
	}
	
	public int getY(){
		return y;
	}
	public void setY(int yCoord){  //200을 yCoord가 받아서 멤버변수y로 변경(설정)
		y = yCoord;
	}

}




class  PointTest
{
	public static void main(String[] args) 
	{
		Point p1 = new Point();  //객체를 생성
		p1.setX(100);
		p1.setY(200);

		Point p2 = new Point();
		p2.setX(100);
		p2.setY(300);
	
		System.out.printf("첫 번째 객체의 x:%d, y:%d\n",p1.getX(),p1.getY());
		System.out.printf("두 번째 객체의 x:%d, y:%d\n",p2.getX(),p2.getY());
	}
}
