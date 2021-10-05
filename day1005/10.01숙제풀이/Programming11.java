import java.util.Scanner;
class Programming11 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("0이상의 정수를 입력하세요==>");
		n = sc.nextInt();
		if (n<0){
			System.out.println("잘못된 입력입니다.");
		}else{
			for ( int i=0 ; i<=n ; i++ ){
				if (i%3==0){
					System.out.print(i+" ");
				}
			}
		}
	}
}
