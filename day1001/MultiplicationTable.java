import java.util.Scanner;
class  MultiplicationTable
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a,i;
		System.out.print("구구단 중에 몇단을 출력할까요?");
		a = sc.nextInt();
		for(i=1 ; i<=9 ; i++){
			System.out.println(a +"*" + i + "=" + (a*i));  //a*i는 꼭 묶기
		}
	}

}
