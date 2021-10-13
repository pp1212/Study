class Movie
{
	private String title;
	private String director; 
	private String company;

	public void setTitle(String title){
		this.title = title;
	}
	public String getTitle(){
		return title;
	}
	public void setDirector(String director){
		this.director = director;
	}
	public String getDirector(){
		return director;
	}
	public void setCompany(String company){
		this.company = company;
	}
	public String getCompany(){
		return company;
	}




	public Movie(String title,String director,String company){
		this.title=title;
		this.director=director;
		this.company=company;
	}
	public Movie(){
		this("제목","감독","회사");
		/*title="제목";
		director="감독";
		company="회사";  
		같은 뜻*/
	}

	public String toString(){
		return "[title:"+ title +"]" + "[director:" + director +"]"+ "[company:"+ company + "]";
	}
}


class  MovieTest
{
	public static void main(String[] args) 
	{
		Movie m1 = new Movie("바람과 함께 사라지다","빅터 플레밍","피터맨픽쳐스");
		Movie m2 = new Movie();

		System.out.println(m1);
		System.out.println(m2);

		m2.setTitle("수어사이드스쿼드2");
		m2.setDirector("제임스 건");
		m2.setCompany("워너 브라더스");

		System.out.println(m2);
		
	}
}
