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
		return "��ǰ��:" + item + ",����:" + qty;
	}

}


class CallByValueAndCallByreferenceTest 
{
	
	public static void minusOne(int n){    //�޼ҵ� �����ε�, ���� ���� ȣ��
		n = n-1;
		System.out.println(n);
	}


	
	public static void minusOne(double []arr){    //�޼ҵ� �����ε�, ������ ���� ȣ��
		for (int i=0;i<arr.length ;i++){
			arr[i] = arr[i]-1;
		}
		printArray(arr);    
	}
	

	public static void printArray(double []arr){
		for (double a:arr ){
			System.out.printf("%10.2f",a);
		}
		System.out.println();
	}
	

	public static void minusOne(Goods g){       //�޼ҵ� �����ε�, ������ ���� ȣ��
		g.setQty(g.getQty()-1);    
	} 


	public static void main(String[] args) 
	{
		int n = 100;					//���� ���� ȣ��
		double []arr = {10.3,2.7,9.1};	//������ ���� ȣ��
		Goods g = new Goods("���",10);	//������ ���� ȣ��(��ü�� ���޵Ǿ�� �ϴϱ� Ŭ������ �ϳ� ��������� ��)
		
		minusOne(n);			//���� ���� ȣ��->�޼ҵ� �ȿ��� ����� ������ ������� ����
		minusOne(arr);			//������ ���� ȣ��->�޼ҵ� �ȿ��� ����� ������ ���� ��
		minusOne(g);			//������ ���� ȣ��->�޼ҵ� �ȿ��� ����� ������ ���� ��
		System.out.println(n);	//100
		printArray(arr);		//9.3,1.7,8.1
		System.out.println(g);	//���,9
	}
}
