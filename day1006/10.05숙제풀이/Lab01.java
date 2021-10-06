import java.util.Scanner;
class  Lab01
{
	public static void main(String[] args) 
	{
		int score;

		Scanner input = new Scanner(System.in);
		System.out.printf("성적을 입력하시오:"); 
		score = input.nextInt();
		/*1번-1
		String result = (score>=60)?"합격":"불합격";
		System.out.println(result);
		*/

		//1번-2 System.out.println( (score>=60)?"합격":"불합격" );
		

		//2번
		/*
		if( score >= 60 ){
			System.out.println("합격!");
			System.out.println("축하합니다.");  //문장 추가하려면 {}해야 함
		}
		else
			System.out.println("불합격!");
		System.out.println("종료");  //들여쓰기 했더라도 중괄호를 안 하면 if,else 모두 끝나고 실행
		*/

		//3번
		if (score < 50){
			System.out.println("불합격입니다.");
		}else if (score < 60){  //여기로 내려온건 이미 50점보다 작지 않다(크거나 같다)라서 60점 미만인지만 묻기
			System.out.println("안타깝게 불합격입니다.");
		}else if (score < 70){
			System.out.println("합격입니다.");
		}else if (score < 80){
			System.out.println("우수하게 합격하였습니다.");
		}else{
			System.out.println("아주 우수하게 합격하였습니다.");
		}
	}
}
