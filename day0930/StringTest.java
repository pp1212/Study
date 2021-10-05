class StringTest 
{
	public static void main(String[] args) 
	{
		String data = "";
		data = "아메리카노";
		data = data + ",콜라";
		data = data + ",맥주";

		System.out.println(data);  //data가 축적됨
	}
}
