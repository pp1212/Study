class Dog
{
	private String name;
	public String breed;
	private int age;

	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setBreed(String breed){
		this.breed = breed;
	}
	public String getBreed(){
		return breed;
	}
	public void setAge(int age){
		this.age = age;
	}
	public int getAge(){
		return age;
	}


	public Dog(String name,int age){
		this.name = name;
		this.age = age;
		breed = null;
	}
	public Dog(String name,String breed,int age){
		this.name = name;
		this.breed = breed;
		this.age = age;
	}

	public String toString(){
		return "�̸�:"+name+",����:"+breed+",����:"+age;
	}

}

class  DogTest
{
	public static void main(String[] args) 
	{
		Dog d1 = new Dog("����",8);
		System.out.println(d1);
		Dog d2 = new Dog("����","��ũ���׸���",6);
		System.out.println(d2);


	}
}
