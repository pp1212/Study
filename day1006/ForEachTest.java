class ForEachTest 
{
	public static void main(String[] args) 
	{
		String []name = {"������","������","�ӻ���","���Ͽ�","���ڿ�","����ȣ"};
		

		/*
		for(String i : name){          //i�� �迭������
			System.out.println(i);
		}*/


		for(int i=0;i<name.length;i++){
			System.out.println(name[i]);  //i�� �ε���(��ġ)
		}
	
	}
}
