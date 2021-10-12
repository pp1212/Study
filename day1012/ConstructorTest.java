class Person
{
	private String name;
	private int age;
	public Person(){    //´ë¼Ò¹®ÀÚ È®½ÇÈ÷ ±¸º°,¿ÞÂÊ¿¡ void,return type ´Ù ¾È¾¸
		name = "±èÀ¯½Å";
		age = 20;
	}

	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setAge(int age){
		this.age = age;
	}
	public int getAge(){
		return age;
	}
}


class ConstructorTest 
{
	public static void main(String[] args) 
	{
		Person kim = new Person();
		System.out.println(kim.getName());
		System.out.println(kim.getAge());

		kim.setName("±èÀ¯Ã¶");
		kim.setAge(21);
		System.out.println(kim.getName());
		System.out.println(kim.getAge());
	}
}
