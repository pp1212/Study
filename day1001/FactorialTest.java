import java.util.Scanner;
class  FactorialTest
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n,sum=1;  //곱하기 해야 되니까 1이어야 함
		System.out.print("N을 입력하세요==>");
		n = sc.nextInt();
		
		for(int i=n ; i>=1 ; i--){   //i:5,4,3,2,1 하기 위해서
			sum *= i;  //sum = sum*i
			System.out.print(i);
			if(i!=1){
				System.out.print("*");
			}
		}
		System.out.println("=" + sum);
	}
}
