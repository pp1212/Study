
import java.util.Scanner;
class CalcTest02{
   public static void main(String []args){
      Scanner sc = new Scanner(System.in);
      int a;
      int b;

      System.out.println("a�� ���ΰ���?");
      a = sc.nextInt();
      System.out.println("b�� ���ΰ���?");
      b = sc.nextInt();
      
      System.out.println(" ** ��� ��� **");
      System.out.println("���ϱ�:" + (a + b));
      System.out.println("����:" + (a-b));
      System.out.println("���ϱ�:" + (a*b));
      System.out.println("������:" + (a/b));

   }
}