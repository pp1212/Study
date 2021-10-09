import java.util.Scanner;
class  Exam11
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("n을 입력하시오==>");
		n = sc.nextInt();
		if (n<0){
			System.out.println("잘못된 입력입니다.");
		}else{
			for (int i=1 ; i<=n ; i++ ){
				if (i%3==0){
					System.out.println(i);
				}
			}
		}
	}
}
