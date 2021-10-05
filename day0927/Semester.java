import java.util.Scanner;
class Semester{
   public static void main(String []args){
      Scanner sc = new Scanner(System.in);
      int com,prog,eng,math,avg;
   
      System.out.println("컴퓨터 개론의 점수를 입력하시오==>");
      com = sc.nextInt();
      System.out.println("C언어 프로그래밍의 점수를 입력하시오==>");
      prog = sc.nextInt();
      System.out.println("영어의 점수를 입력하시오==>");
      eng = sc.nextInt();
      System.out.println("일반 수학의 점수를 입력하시오==>");
      math = sc.nextInt();
      avg = (com + prog + eng + math) / 4;

      System.out.println("이번 학기 평균 점수는 " + avg + "점 입니다.");


   }
}