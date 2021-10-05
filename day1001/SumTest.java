import java.util.Scanner;
class  SumTest
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a,sum=0;  //sum의 초기화 -> VariableInit , VariableInit02 
		System.out.print("1부터 어떤 수까지 더하기 할까요?");
		a = sc.nextInt();  //a는 위에서 받아서 괜찮지만 sum은 밑에 연산식에만 있기 때문에
		
		for(int i=1 ; i<=a ; i++){
			sum += i;   //sum = i + sum;
		}  //i가 a보다 1클때 탈출
		System.out.println("1부터 " + a + "까지의 합은" + sum + "입니다.");
	}
}
/*a는 사용자로부터 입력받기 때문에 꼭 초기화 하지 않아도 됨
sum은 반복문에서 연산을 하기 때문에 반드시 초기값이 있어야 함
지금은 더하기를 할 것이라서 0으로 초기화 함
주어진 문제해결을 위하여 그때그때마다 적합한 값으로 초기화 해야 함*/