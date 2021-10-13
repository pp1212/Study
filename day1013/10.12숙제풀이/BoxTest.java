class Box
{
	private double width;
	private double length;
	private double height;
	private boolean empty;
	private String things="없음";//담을 물건

	public Box(double width,double length,double height){
		this.width=width;
		this.length=length;
		this.height=height;
		empty=true;
	}

	public Box(){
		width=100;
		length=100;
		height=100;
		empty=true;  //boolean의 기본값은 false니까
	}

	public String toString(){
		String r ="비어있음";
		if(!empty){     //empty == false 같은 뜻
			r="비어있지 않음";
		}
		return "가로:"+width+",세로:"+length+",높이:"+height+","+r+",담긴물건:"+things;
	}

	public void put(String things){
		this.things= things;
		empty = false;
		System.out.println("박스에 " + things + "를 담았어요");
	}

	public String take(){
		String r = things;
		things = "없음";
		empty = true;
		return r;
	}
}


class  BoxTest
{
	public static void main(String[] args) 
	{
		Box b1 = new Box(10,20,30);
		Box b2 = new Box();
		System.out.println(b1);
		System.out.println(b2);

		b1.put("공");
		b2.put("책");

		System.out.println(b1);
		System.out.println(b2);

		String r = b2.take();
		System.out.println("박스2에 담긴물건:"+r);
		System.out.println("============================");
		System.out.println(b1);
		System.out.println(b2);
	}
}
