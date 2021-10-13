class SistUtil
{
	//두 개의 정수를 매개변수로 전달받아 그 중에 큰수를 찾아 출력하는 메소드 정의
	public void max(int a,int b){    //메소드 자료형 다름
		int r = a;
		if(b>r){
			r = b;
		}
		System.out.println("큰수는 "+ r +"입니다.");
		
		
	}


	//두 개의 실수를 매개변수로 전달받아 그 중에 큰수를 찾아 출력하는 메소드 정의
	public void max(double a,double b){      //메소드 자료형 다름
		double r = a;
		if (b>r){
			r = b;
		}
		System.out.println("큰수는 "+ r +"입니다.");
	}

}


class  MethodOverloadingTest
{
	public static void main(String[] args) 
	{
		//두 개의 max메소드를 호출
		SistUtil su = new SistUtil();
		su.max(20,30);
		su.max(25.7,25.8);
	}
}

//메소드 중복 정의 = 메소드 오버로딩
//자료형,개수 달라야 함
