class Rectangle
{
	double width;
	double height;

	double getArea(){
		double area = width*height;
		return area;
	}
}


class RectangleTest 
{
	public static void main(String[] args) 
	{
		Rectangle r = new Rectangle();
		
		r.width = 20.5;
		r.height = 15.7;
		System.out.printf("사각형의 면적은 %.1f입니다\n",r.getArea());
			
	}
}
