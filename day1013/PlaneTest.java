class Plane
{
	private String company;
	private String model;
	private int number;
	public static int planes;
	
	
	public void setCompany(String company){
		this.company=company;
	}
	public String getCompany(){
		return company;
	}
	public void setModel(String model){
		this.model=model;
	}
	public String getModel(){
		return model;
	}
	public void setNumber(int number){
		this.number=number;
	}
	public int getNumber(){
		return number;
	}

	public Plane(){
		planes++;    //여기서도 추가
	}

	public Plane(String company,String model,int number){
		this.company=company;
		this.model=model;
		this.number=number;
		planes++;     //여기서도 추가해야 함
	}

	public static int getPlanes(){
			return planes;
		}
	}


	public String toString(){
		return "company:" + company + " ,model:" + model + " ,number:" + number;
	}


}

class  PlaneTest
{
	public static void main(String[] args) 
	{
		Plane p1 = new Plane();
		System.out.println(p1);
		Plane p2 = new Plane("에어버스2","B800",900);
		System.out.println(p2);
		Plane.getPlanes(p1);

		p1.setCompany();
	}
}
