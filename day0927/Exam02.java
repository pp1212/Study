
import java.util.Scanner;
class Exam02{
   public static void main(String []args){
      Scanner sc = new Scanner(System.in);
      double x;
      System.out.println("실수x를 입력하세요");
      x = sc.nextDouble();
    //  double r = 3 *( x * x * x ) - 7 *( x * x ) + 9;    괄호 안쳐도 곱하기 먼저 해서 생략 가능
      double r = 3*Math.pow(x,3) - 7*Math.pow(x,2) + 9;
      System.out.println("결과:" + r);

   }
}