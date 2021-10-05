import java.util.Scanner;
class  LastDate
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int month,last=31;
		System.out.print("월을 입력하세요==>");
		month = sc.nextInt();
		

		if(month<1 || month>12){
			System.out.println("입력값이 잘못되었습니다.");
		}else{
			if(month==2){
				last = 28;
			}else if(month==4 ||month==6 ||month==9 ||month==11){
				last = 30;
			}
			System.out.println(month+"월은 "+last+"일까지 있어요!");
		}



	}

}
