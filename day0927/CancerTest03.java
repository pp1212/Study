import java.util.Scanner;
import java.util.Date;
class CancerTest03{
   public static void main(String []args){
      Scanner sc = new Scanner(System.in);  //����ϰ� ����°�->��ü����
      Date today = new Date();   //Date����ϱ� ���� ���� today
      String name;
      int age,userYear;
      int thisYear;
      thisYear = today.getYear()+1900;

      System.out.println("����⵵�� �Է��ϼ���==>");
      userYear = sc.nextInt();
      System.out.println("�̸��� �Է��ϼ���==>");
      name = sc.next();
      age = thisYear - userYear;
      System.out.println("���ش� " + thisYear + "�⵵�Դϴ�.");
      if (age >= 40)
          System.out.println(name + "��, ���ؿ� " + age +"�� �Դϴ�.����ϰ��� ����� �Դϴ�.");
      else
          System.out.println(name + "��, ���ؿ� " + age + "�� �Դϴ�.����ϰ��� ����ڰ� �ƴմϴ�.");


   }
}