import java.util.Scanner;
class Semester{
   public static void main(String []args){
      Scanner sc = new Scanner(System.in);
      int com,prog,eng,math,avg;
   
      System.out.println("��ǻ�� ������ ������ �Է��Ͻÿ�==>");
      com = sc.nextInt();
      System.out.println("C��� ���α׷����� ������ �Է��Ͻÿ�==>");
      prog = sc.nextInt();
      System.out.println("������ ������ �Է��Ͻÿ�==>");
      eng = sc.nextInt();
      System.out.println("�Ϲ� ������ ������ �Է��Ͻÿ�==>");
      math = sc.nextInt();
      avg = (com + prog + eng + math) / 4;

      System.out.println("�̹� �б� ��� ������ " + avg + "�� �Դϴ�.");


   }
}