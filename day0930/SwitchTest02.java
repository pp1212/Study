import java.util.Scanner;
class SwitchTest02 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("0~9사이의 수를 입력하시오==>");
		n = sc.nextInt();
		switch (n){
			case 0:   //case와0사이에 빈칸 있어야함
			case 1:
			case 2:
			case 3:System.out.println("삼");break;  //n의 값이 0이거나 1이거나 2이거나 3이면 "삼"출력, 크기순서대로 안써도 됨
			case 4:
			case 5:
			case 6:
			case 7:System.out.println("칠");break;
			case 8:
			case 9:
			default:System.out.println("입력범위를 넘었습니다.");  //마지막이라서 break 없어도 됨
		}
		System.out.println("종료");

		//3입력하면 삼(break;있는 곳까지 )
	}
}
