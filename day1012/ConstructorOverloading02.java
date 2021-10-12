class Emp
{
	private String name;
	private int sal;
	private String addr;

	public String toString(){
		return "이름:"+name+",급여:"+sal+",주소:"+addr;
	}

	public Emp(){
		name="홍길동";
		sal=500;
		addr="서울";
	}
	public Emp(String name,int sal,String addr){
		this.name =name;
		this.sal=sal;
		this.addr=addr;
	}

	public Emp(String name){
		this.name=name;
		sal=500;
		addr="서울";
	}

	public Emp(String name,int sal){	//순서가 달라서 중복 가능1
		this.name=name;
		this.sal=sal;
		addr="서울";
	}

	public Emp(int sal,String name){   //순서가 달라서 중복 가능2
		this.sal=sal;
		this.name=name;
		addr="서울";
	}
	
	//setter,getter생략
	
	public Emp(String name,String addr){    //가능
		this.name =name;
		this.addr=addr;
		sal=500;
	}
	
	
	/*오류
	public Emp(int sal,String addr){		//불가능
		this.sal=sal;
		this.addr=addr;
		name="홍길동";
	}
	*/
}

class ConstructorOverloading02
{
	public static void main(String[] args) 
	{
		Emp a = new Emp();
		System.out.println(a);
		Emp b = new Emp("김유신",600,"광주");
		System.out.println(b);
		
		//나머지 3가지 방법으로도 객체 생성
		Emp c = new Emp("이순신");
		System.out.println(c);
		Emp d = new Emp("김유철",800);
		System.out.println(d);
		Emp e = new Emp(900,"김철유");
		System.out.println(e);
	}
}
