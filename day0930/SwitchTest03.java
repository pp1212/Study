import java.util.Scanner;
class SwitchTest03 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("0~9사이의 수를 입력하시오==>");
		n = sc.nextInt();
		if(n<1 || n>9){
			System.out.println("입력 범위를 넘었습니다.");
		}else{

			String result = "";
			switch (n){
				case 0:result = "영";break;   
				case 1:result = "일";break;
				case 2:result = "이";break;
				case 3:result = "삼";break;  
				case 4:result = "사";break;
				case 5:result = "오";break;
				case 6:result = "육";break;
				case 7:result = "칠";break;
				case 8:result = "팔";break;
				case 9:result = "구";break;
				
			}
			System.out.println(result);
		}
	}
}
