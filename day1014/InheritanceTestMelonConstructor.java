class Food
{
	protected double calories;
	protected int price;
	protected double weight;

	public Food(){											//기본생성자
	}
	public Food(double calories,int price,double weight){	//매개변수 갖는 생성자
		this.calories=calories;
		this.price=price;
		this.weight=weight;
	}
	
	public void setCalories(double calories){				//setter,getter
		this.calories=calories;
	}
	public double getCalories(){
		return calories;
	}
	public void setPrice(int price){
		this.price=price;
	}
	public int getPrice(){
		return price;
	}
	public void setWeight(double weight){
		this.weight=weight;
	}
	public double getWeight(){
		return weight;
	}
	
	public String toString(){								//toString
		return "칼로리:" + calories + ",가격:" + price + ",중량:" + weight;
	}
}

class Melon extends Food
{
	private String farm;

	public Melon(){														//기본생성자
		//super();
	}
	public Melon(double calories,int price,double weight,String farm){	//매개변수 갖는 생성자
		super(calories,price,weight);
		this.farm=farm;
	}

	public void setFarm(String farm){									//setter,getter
		this.farm=farm;
	}
	public String getFarm(){
		return farm;
	}

	
	//부모클래스로부터 물려받은 toString은 경작농원을 반환하지 않아
	//나한테 알맞도록 다시 정의 => 메소드 오버라이딩
	public String toString(){											//오버라이딩
		//return "칼로리:"+calories+",가격:"+price+",중량:"+weight+",경작농원:"+farm;
		return super.toString() + ",경작농원:" + farm;
		//부모클래스의 동일한 메소드를 요청하기 위해서는 super.메소드명()으로 사용
		//return toString() + ",경작농원:" + farm; -> 이렇게 하면 우선순위는 내가 높기 때문에 자식의 toString이 동작
	}
}

//Food를 상속한 우유클래스
class Milk extends Food
{
	private String brand;
	
	public Milk(double calories,int price,double weight,String brand){
		super(calories,price,weight);
		this.brand=brand;
	}
	public Milk(){
	}
	
	public void setBrand(String brand){
		this.brand=brand;
	}
	public String getBrand(){
		return brand;
	}

	public String toString(){
		return super.toString() + ",브랜드:" + brand;
	}
}




class  InheritanceTestMelonConstructor
{
	public static void main(String[] args) 
	{
		Food f = new Food(200,3000,0.6);
		System.out.println(f);
		
		Melon m = new Melon(450,18000,1.5,"쌍용농원");

		System.out.println(m);   //부모로부터 toString 메소드도 물려받음, 우선순위는 자식(자기자신)이 더 높음 
		//부모클래스에서 toString메소드가 있고 자식클래스에도 toString 있을 때
		//자식클래스의 toString이 동작

		Milk milk = new Milk(200,900,0.95,"서울우유");
		System.out.println(milk);
	}
}

//toString 다시 정의 => 오버라이딩(오버로딩은 상속과 연관 X)
//상속관계에 있을 때 부모클래스에 있는 것을 자식클래스가 다시 정의(재정의)하는 것 => 오버라이딩
//메소드이름,매개변수,자료형 모두 다 똑같이 다시 정의