import java.util.Scanner;
import java.util.Date;
class CancerTest03{
   public static void main(String []args){
      Scanner sc = new Scanner(System.in);  //사용하게 만드는거->객체생성
      Date today = new Date();   //Date사용하기 위한 변수 today
      String name;
      int age,userYear;
      int thisYear;
      thisYear = today.getYear()+1900;

      System.out.println("출생년도를 입력하세요==>");
      userYear = sc.nextInt();
      System.out.println("이름을 입력하세요==>");
      name = sc.next();
      age = thisYear - userYear;
      System.out.println("올해는 " + thisYear + "년도입니다.");
      if (age >= 40)
          System.out.println(name + "님, 올해에 " + age +"세 입니다.무료암검진 대상자 입니다.");
      else
          System.out.println(name + "님, 올해에 " + age + "세 입니다.무료암검진 대상자가 아닙니다.");


   }
}