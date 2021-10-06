import java.util.Scanner;
class WhileCorrectValueInPut 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int month=-1;
		
		do{
			System.out.print("월을 입력하세요==>");
			month = sc.nextInt();
		}while(month<1 || month>12);  //잘못된 입력값을 넣으면 반복하도록
		
		/*
		while(month<1 || month>12){
			System.out.print("월을 입력하세요==>");
			month = sc.nextInt();
		}
		*/

		/*
		for(;;){
			System.out.print("월을 입력하세요==>");
			month = sc.nextInt();
			if(month>=1 && month<=12){
				break;
			}
		}*/

		/*
		while (true){
			System.out.print("월을 입력하세요==>");
			month = sc.nextInt();
			if(month>=1 && month<=12){
				break;
			}
		}
		*/

		String name = "";
		if (month >= 3 && month<=5){
			name = "봄";
		}else if(month >= 6 && month<=8){
			name="여름";
		}else if(month >= 9 && month<=11){
			name="가을";
		}else{
			name="겨울";
		}
		System.out.printf("%d월은 %s입니다.",month,name);
	
	
	
	
	
	
	
	
	
	}
}
