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


class CallByValueAndCallByreferenceTest 
{
	
	public static void minusOne(int n){    //메소드 오버로딩, 값에 의한 호출
		n = n-1;
		System.out.println(n);
	}


	
	public static void minusOne(double []arr){    //메소드 오버로딩, 참조에 의한 호출
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
	

	public static void minusOne(Goods g){       //메소드 오버로딩, 참조에 의한 호출
		g.setQty(g.getQty()-1);    
	} 


	public static void main(String[] args) 
	{
		int n = 100;					//값에 의한 호출
		double []arr = {10.3,2.7,9.1};	//참조에 의한 호출
		Goods g = new Goods("사과",10);	//참조에 의한 호출(객체가 전달되어야 하니깐 클래스가 하나 만들어져야 함)
		
		minusOne(n);			//값에 의한 호출->메소드 안에서 변경된 내용이 적용되지 않음
		minusOne(arr);			//참조에 의한 호출->메소드 안에서 변경된 내용이 적용 됨
		minusOne(g);			//참조에 의한 호출->메소드 안에서 변경된 내용이 적용 됨
		System.out.println(n);	//100
		printArray(arr);		//9.3,1.7,8.1
		System.out.println(g);	//사과,9
	}
}
