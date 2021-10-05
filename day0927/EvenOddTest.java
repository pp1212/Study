
import java.util.Scanner;
class EvenOddTest{
   public static void main(String []args){
      Scanner sc = new Scanner(System.in);
      int n;
      System.out.println("N을 입력하시오==>");
      n = sc.nextInt();
      if( n % 2 == 0  )
        System.out.println(n+"은 짝수입니다.");
      else
        System.out.println(n+"은 홀수입니다.");

   }
}