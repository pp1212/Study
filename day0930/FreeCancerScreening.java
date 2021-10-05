import java.util.Scanner;
import java.util.Date;
class  FreeCancerScreening
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Date today = new Date();
		int age,userYear,thisYear;
		String name;
		String items;
		thisYear = today.getYear() + 1900;

		System.out.print("이름을 입력하시오==>");
		name = sc.next();
		System.out.print("출생년도를 입력하시오==>");
		userYear = sc.nextInt();
		
		age = thisYear -  userYear;

		System.out.println(name+"님 올해에 "+age+"살 입니다.");
		if(age>=40 && thisYear%2 == userYear%2 ){
			items = "위암,간암";
			if (age>=50){
				items = items + ",대장암";
			}
			System.out.println(name+"님, "+thisYear+"년도에 무료암검진 대상자입니다.");
			System.out.println("암검진 항목은 "+ items +"입니다.");
		}else{
			System.out.println(name+"님, "+thisYear+"년도에 무료암검진 대상자가 아닙니다.");
		}
	}
}
