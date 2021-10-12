class Box{
	//1,2,3
	int width;
	int length;
	int height;
	
	//4
	public int getW(){
		return width;
	}
	public void setW(int a){
		width = a;
	}
	
	public int getL(){
		return length;
	}
	public void setL(int b){
		length = b;
	}
	
	public int getH(){
		return height;
	}
	public void setH(int c){
		height = c;
	}
	
	//5
	int getVolume(){
		int volume = width*length*height;
		return volume;
	}
	
	//6 X

}


//7
class  BoxTest
{
	public static void main(String[] args) 
	{
		Box box1;
		box1 = new Box();  //8
		
		//9
		box1.setW(100);
		box1.setL(100);
		box1.setH(100);
		
		//10
		System.out.println(box1.getVolume());
		
		//11
		System.out.println(box1);
		
		//12
		Box box2 = new Box();
		box2.setW(200);
		box2.setL(200);
		box2.setH(200);

		//13
		box1 = box2;
		System.out.println(box1.getW());
		System.out.println(box1.getL());
		System.out.println(box1.getH());
		

	}
}
