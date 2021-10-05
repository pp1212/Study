import java.util.Scanner;
class SwitchTest 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("0~9사이의 수를 입력하시오==>");
		n = sc.nextInt();
		switch (n){
			case 0:System.out.println("영");   //case와0사이에 빈칸 있어야함
			case 1:System.out.println("일");
			case 2:System.out.println("이");
			case 3:System.out.println("삼");break;
			case 4:System.out.println("사");
			case 5:System.out.println("오");
			case 6:System.out.println("육");
			case 7:System.out.println("칠");break;
			case 8:System.out.println("팔");
			case 9:System.out.println("구");
			default:System.out.println("입력범위를 넘었습니다.");  //마지막이라서 break 없어도 됨
		}
		System.out.println("종료");

		//1입력하면 일,이,삼(break;있는 곳까지 )
	}
}
