class Dog
{
	private String name;
	private int age;
	public String breed;

	public Dog(String name,int age){
		this(name,null,age);
	}
	public Dog(String name,String breed,int age){
		this.name = name;
		this.breed = breed;
		this.age = age;
	}
	
	public String toString(){
		return "강아지이름:"+name+",강아지종류:"+breed+",강아지나이:"+age;
	}
}


class  DogTest
{
	public static void main(String[] args) 
	{
		Dog d1 = new Dog("바둑이",2);
		Dog d2 = new Dog("해피","요크셔테리어",3);

		System.out.println(d1);
		System.out.println(d2);
	}
}
