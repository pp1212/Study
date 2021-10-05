class IncreamentDeCreament 
{
	public static void main(String[] args) 
	{
		int i = 5;  
		int j = 5;  
		i++;   //i = i+1 변수명 뒤,앞 증감연산자옴 ->어디에 붙던 똑같음  
		++j;  // j = j+1
		System.out.println(i);
		System.out.println(j);
		
		System.out.println("----------------------------------------");
		//a++와 a+1은 다름
		int a = 10;
		int b = 10;
		System.out.println(a+1);  //a에 그냥1을 더하는 것
		System.out.println(b++);  //a에 1을 더하고 다시 대입하는 것
		System.out.println("----------------------------------------");
		System.out.println(a);
		System.out.println(b);
		System.out.println("----------------------------------------");

		int n =5;
		int m =5;
		n--;
		--m;
		System.out.println(n);
		System.out.println(m);
		System.out.println("----------------------------------------");

		i = 5;
		j = 5;
		a = ++i;  //지금은 대입연산자랑 있어서 의미가 다름
		b = j++;
		System.out.println("i:" + i);
		System.out.println("j:" + j);
		System.out.println("a:" + a);
		System.out.println("b:" + b);
		System.out.println("----------------------------------------");

		i = 5;
		j = 5;
		int k = 5;
		System.out.println(++i);  //6
		System.out.println(j++);  //5
		System.out.println(k+1);  //6
		System.out.println(i);    //6
		System.out.println(j);    //6
		System.out.println(k);    //5
			


	}
}
