class Food
{
	protected double calories;
	protected int price;
	protected double weight;

	public Food(){											//�⺻������
	}
	public Food(double calories,int price,double weight){	//�Ű����� ���� ������
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
		return "Į�θ�:" + calories + ",����:" + price + ",�߷�:" + weight;
	}
}

class Melon extends Food
{
	private String farm;

	public Melon(){														//�⺻������
		//super();
	}
	public Melon(double calories,int price,double weight,String farm){	//�Ű����� ���� ������
		super(calories,price,weight);
		this.farm=farm;
	}

	public void setFarm(String farm){									//setter,getter
		this.farm=farm;
	}
	public String getFarm(){
		return farm;
	}

	
	//�θ�Ŭ�����κ��� �������� toString�� ���۳���� ��ȯ���� �ʾ�
	//������ �˸µ��� �ٽ� ���� => �޼ҵ� �������̵�
	public String toString(){											//�������̵�
		//return "Į�θ�:"+calories+",����:"+price+",�߷�:"+weight+",���۳��:"+farm;
		return super.toString() + ",���۳��:" + farm;
		//�θ�Ŭ������ ������ �޼ҵ带 ��û�ϱ� ���ؼ��� super.�޼ҵ��()���� ���
		//return toString() + ",���۳��:" + farm; -> �̷��� �ϸ� �켱������ ���� ���� ������ �ڽ��� toString�� ����
	}
}

//Food�� ����� ����Ŭ����
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
		return super.toString() + ",�귣��:" + brand;
	}
}




class  InheritanceTestMelonConstructor
{
	public static void main(String[] args) 
	{
		Food f = new Food(200,3000,0.6);
		System.out.println(f);
		
		Melon m = new Melon(450,18000,1.5,"�ֿ���");

		System.out.println(m);   //�θ�κ��� toString �޼ҵ嵵 ��������, �켱������ �ڽ�(�ڱ��ڽ�)�� �� ���� 
		//�θ�Ŭ�������� toString�޼ҵ尡 �ְ� �ڽ�Ŭ�������� toString ���� ��
		//�ڽ�Ŭ������ toString�� ����

		Milk milk = new Milk(200,900,0.95,"�������");
		System.out.println(milk);
	}
}

//toString �ٽ� ���� => �������̵�(�����ε��� ��Ӱ� ���� X)
//��Ӱ��迡 ���� �� �θ�Ŭ������ �ִ� ���� �ڽ�Ŭ������ �ٽ� ����(������)�ϴ� �� => �������̵�
//�޼ҵ��̸�,�Ű�����,�ڷ��� ��� �� �Ȱ��� �ٽ� ����