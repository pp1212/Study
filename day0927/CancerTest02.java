//이름과 출생년도를 입력받아 나이를 계산하고 나이가 40세 이상인지 판별하여 무료암검진 대상자인지 결과를 출력하도록 
//프로그램을 수정해 봅니다.
//(단, 올해는 2021년으로 정해두고 프로그램 합니다.나이는 2021-출생년도로 처리) 


import java.util.Scanner;
class CancerTest02{
   public static void main(String []args){
      Scanner sc = new Scanner(System.in);
      String name;
      int age,userYear;
      int thisYear;
      thisYear = 2021;

      System.out.println("출생년도를 입력하세요==>");
      userYear = sc.nextInt();
      System.out.println("이름을 입력하세요==>");
      name = sc.next();
      age = thisYear - userYear;

      if (age >= 40)
          System.out.println(name + "님, 올해에 " + age +"세 입니다.무료암검진 대상자 입니다.");
      else
          System.out.println(name + "님, 올해에 " + age + "세 입니다.무료암검진 대상자가 아닙니다.");


   }
}