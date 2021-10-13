class Dog
{
	private String name;
	private int age;
	public String breed;

	/*public Dog(){   //매개변수 갖지 않는 생성자(기본생성자)-여기 안에 쓰지 않아도 초기화 됨
		//name = null;
		//age = 0;
		//breed = null;
	}*/
	
	public String toString(){
		return "강아지이름:"+name+",강아지종류:"+breed+",강아지나이:"+age;
	}
}


class  DefaultConstructor01
{
	public static void main(String[] args) 
	{
		Dog d1 = new Dog();
		System.out.println(d1);

	}
}
