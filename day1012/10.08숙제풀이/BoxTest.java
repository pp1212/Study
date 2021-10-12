class Box
{
	int width;
	int length;
	int height;

	public void setWidth(int w){    //생성자
		width = w;
	}
	public int getWidth(){   //접근자 돌아감
		return width;
	}
	public void setLength(int l){
		length = l;
	}
	public int getLength(){
		return length;
	}
	public void setHeight(int h){
		height = h;
	}
	public int getHeight(){
		return height;
	}

	public int getVolume(){
		int volume = width*length*height;
		return volume;
	}


	//현재 상자의 속성값을 문자열로 만들어서 반환하는 toString() 메소드를 작성
	/*
	public String toString(){
		String result = "가로:" + width + ",세로:" + length + ",높이:" + height;
		return result;
	}*/
}

class  BoxTest
{
	public static void main(String[] args) 
	{
		//상자 객체를 가리킬 수 있는 참조 변수 box1을 정의하라
		Box box1;

		//상자 객체를 생성하여서 참조변수 box1이 가리키게 하라
		box1 = new Box();
		box1.setWidth(100);
		box1.setLength(100);
		box1.setHeight(100);
		System.out.println(box1.getVolume());
		
		System.out.println(box1);   
		//toString메소드 동작
		//객체참조변수를 출력문에 써주면 toString메소드가 자동으로 동작
		//만약 toString메소드가 없으면 그 객체의 클래스이름과 어디에 있는지 정보를 갖고 있는 주소값이 출력
		//->Box@41a4555e
		//따라서 만약 그 클래스의 속성값을 문자열로 출력할 일이 있다면 String을 반환하는 toString을 만들어 준다
		
		//두번째 객체인 box2 생성하고 가로세로높이를 200,200,200으로 설정
		Box box2 = new Box();  
		box2.setWidth(200);
		box2.setLength(200);
		box2.setHeight(200);
		
		
		//참조변수 box2의 값을 box1에 대입한 후, 접근자를 통해 box1의 속성값을 출력
		box1 = box2;   //box1이 box2와 같은 객체를 바라보라라는 뜻
		System.out.println(box1.getWidth());  //200
		System.out.println(box2.getWidth());  //200
		//box1은 box2와 동일한 객체를 참조한다!
		//원래 box1이 참조하고 있던 가로세로높이가 100인 객체는 이제 아무도 참조하고 있지 않음
		//그래서 그 객체는 사용할 수 없음
		//더이상 사용할 수 없는 객체(메모리) = garbage
	}
}
