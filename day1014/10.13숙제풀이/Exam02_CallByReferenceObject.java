class Goods
{
	private String item;
	private int qty;

	public Goods(String item,int qty){
		this.item = item;
		this.qty=qty;
	}
	public Goods(){
	}

	public void setItem(String item){
		this.item=item;
	}
	public String getItem(){
		return item;
	}
	public void setQty(int qty){
		this.qty=qty;
	}
	public int getQty(){
		return qty;
	}
	public String toString(){
		return "상품명:" + item + ",수량:" + qty;
	}

}


class  Exam02_CallByReferenceObject
{
	
	//상품 하나를 매개변수로 전달받아 그 상품의 수량을 1 감소하는 메소드 정의
	public static void minusOne(Goods g){
		g.setQty(g.getQty()-1);    //g.getQty() 원래 있는 것을 바꿀 때
		/*상품의 원래 수량을 갖고 와서 빼기 1 한 값을 다시 상품의 수량으로 설정
		ex) g.setQty(100)이라면 100으로 바꿔줌
		qty가 public이라면 
		g.qty = g.qty-1;  
		g.qty--;로 할 수 있는데 보통 다들 private이어서 setter,getter로 접근*/
	} 
	
	public static void main(String[] args) 
	{
		Goods g = new Goods("우유",10);
		System.out.println(g);
		minusOne(g);
		System.out.println(g);
	}
}
