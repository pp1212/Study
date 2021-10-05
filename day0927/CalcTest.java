
import java.util.Scanner;
class CalcTest{
   public static void main(String []args){
      Scanner sc = new Scanner(System.in);
      int a;
      int b;
      int plus;
      int minus;
      int multi;
      int divi;
      System.out.println("a는 몇인가요?");
      a = sc.nextInt();
      System.out.println("b는 몇인가요?");
      b = sc.nextInt();
      plus = a + b;
      minus = a - b;
      multi = a * b;
      divi = a / b;
      System.out.println(" ** 결과 출력 **");
      System.out.println(plus);
      System.out.println(minus);
      System.out.println(multi);
      System.out.println(divi);

   }
}