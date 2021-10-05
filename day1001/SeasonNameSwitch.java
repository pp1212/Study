import java.util.Scanner;
class  SeasonNameSwitch
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int month;
		String name ="";
		System.out.print("월을 입력하시오==>");
		month = sc.nextInt();

		if(month<1 || month>12){
			System.out.println("입력값이 잘못되었습니다.");
		}else{
			switch(month){
				case 3:
				case 4:
				case 5:name="봄"; break;  //case 3:case 4: case 5: name="봄"; break;  이렇게 한줄로 써도 됨
				case 6:
				case 7:
				case 8:name="여름";break;
				case 9:
				case 10:
				case 11:name="가을";break;
				case 12:
				case 1:
				case 2:name="겨울";break;
			}
			System.out.println(month+"월은 "+name+ "입니다.");
		}

		

	}
}
