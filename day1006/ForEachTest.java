class ForEachTest 
{
	public static void main(String[] args) 
	{
		String []name = {"김지현","윤서우","임상진","임하연","정자영","최현호"};
		

		/*
		for(String i : name){          //i는 배열데이터
			System.out.println(i);
		}*/


		for(int i=0;i<name.length;i++){
			System.out.println(name[i]);  //i는 인덱스(위치)
		}
	
	}
}
