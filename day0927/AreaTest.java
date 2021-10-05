
import java.util.Scanner;
class AreaTest{
   public static void main(String []args){
      Scanner sc = new Scanner(System.in);
      int width,height,area;
      
      System.out.println("사각형의 가로길이를 입력하시오");
      width = sc.nextInt();
      System.out.println("사각형의 세로길이를 입력하시오");
      height = sc.nextInt();
      area = width * height;

      System.out.println("사각형의 면적은 " + area + " 입니다.");

   }
}