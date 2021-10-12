class Goods
{
	private String item;
	private int qty;
	private int price;

	public void setItem(String item){
		this.item = item;
	} 
	public String getItem(){
		return item;
	}

	public void setQty(int qty){
		this.qty = qty;
	}
	public int getQty(){
		return qty;
	}

	public void setPrice(int price){
		this.price = price;
	}
	public int getPrice(){
		return price;
	}

	public String toString(){
		String result = ""; 
		result	+= "��ǰ��:" + item + "\n";
		result	+= "����:" + qty + "\n";
		result	+= "�ܰ�:" + price + "\n";
		//result	= "�ܰ�:" + price + "\n";    => �̷��� �Ǹ� �ܰ��� ��ȯ
		return result;
	}
}



class GoodsTest02
{
	public static void main(String[] args) 
	{
		Goods g1;
		g1 = new Goods();

		g1.setItem("�౸��");
		g1.setQty(10);
		g1.setPrice(35000);

		//System.out.println("��ǰ��:" + g1.getItem());
		//System.out.println("����:" + g1.getQty());
		//System.out.println("�ܰ�:" + g1.getPrice());
		System.out.println(g1);  //��ǰ��,����,�ܰ��� ��ȯ �ǵ��� toString�� �����  
		//��ü�̸��� �ᵵ��
		System.out.println(g1.toString());  //���� �Ȱ���

		int total = g1.getQty() * g1.getPrice();
		System.out.println("�ѱݾ�:" + total);
	}
}
