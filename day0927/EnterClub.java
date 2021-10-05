
import java.util.Scanner;  //나이,키,이름을 입력받아야 하니까
class EnterClub{
   public static void main(String []args){
      Scanner sc = new Scanner(System.in);  //스캐너 사용을 위해 객체 생성 
      String name;
      int age,height;
     
      System.out.println("키를 입력하세요==>");
      height = sc.nextInt();
      System.out.println("나이를 입력하세요==>");
      age = sc.nextInt();
      System.out.println("이름을 입력하세요==>");
      name = sc.next();
     
      if (age >= 20 && height <=160)
          System.out.println(name + "님 입장가능합니다.");
      else
          System.out.println(name + "님 입장불가능합니다.");

    

   }
}