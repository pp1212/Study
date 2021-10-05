import java.util.Scanner;
import java.util.Date;
class CancerTest04{
   public static void main(String []args){
      Scanner sc = new Scanner(System.in); 
      Date today = new Date();   //sc,today같은 변수이름은 내 마음대로
      String name;
      int userYear;
      int thisYear = today.getYear() + 1900;

      System.out.println("출생년도를 입력하세요==>");
      userYear = sc.nextInt();
      System.out.println("이름을 입력하세요==>");
      name = sc.next();   //사용자한테 이름을 입력받음
      int age = thisYear - userYear;
      if ( age >= 40  &&  thisYear % 2 == userYear % 2 )
          System.out.println(name + "님, "+ thisYear + "년도에 무료암검진 대상자 입니다.");      
      else
          System.out.println(name + "님, "+ thisYear + "년도에 무료암검진 대상자가 아닙니다.");
   }
}