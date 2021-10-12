class Goods
{
	private String item;
	private int qty;
	private int price;

	public void setItem(String i){
		item = i;
	} 
	public String getItem(){
		return item;
	}

	public void setQty(int q){
		qty = q;
	}
	public int getQty(){
		return qty;
	}

	public void setPrice(int p){
		price = p;
	}
	public int getPrice(){
		return price;
	}

	public String toString(){
		String result = ""; 
		result	+= "상품명:" + item + "\n";
		result	+= "수량:" + qty + "\n";
		result	+= "단가:" + price + "\n";
		//result	= "단가:" + price + "\n";    => 이렇게 되면 단가만 반환
		return result;
	}
}



class GoodsTest
{
	public static void main(String[] args) 
	{
		Goods g1;
		g1 = new Goods();

		g1.setItem("축구공");
		g1.setQty(10);
		g1.setPrice(35000);

		//System.out.println("상품명:" + g1.getItem());
		//System.out.println("수량:" + g1.getQty());
		//System.out.println("단가:" + g1.getPrice());
		System.out.println(g1);  //상품명,수량,단가가 반환 되도록 toString을 만들기  
		//객체이름만 써도됨
		System.out.println(g1.toString());  //위랑 똑같음

		int total = g1.getQty() * g1.getPrice();
		System.out.println("총금액:" + total);
	}
}
