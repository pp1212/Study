class RangeByte 
{
	public static void main(String[] args) 
	{
		byte data;
		data = -128;
		System.out.println(data);
		data = (byte)(data - 1); //=>underFlow
		System.out.println(data);

		/*data = 127;
		System.out.println(data);
		data = (byte)(data+1);   에러는 안나지만 128은 안나옴
		
		System.out.println(data);  => overFlow*/  
	}
}
/*
C:\javaStudy\day0928>java RangeByte
127
-128

*/