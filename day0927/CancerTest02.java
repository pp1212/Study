//�̸��� ����⵵�� �Է¹޾� ���̸� ����ϰ� ���̰� 40�� �̻����� �Ǻ��Ͽ� ����ϰ��� ��������� ����� ����ϵ��� 
//���α׷��� ������ ���ϴ�.
//(��, ���ش� 2021������ ���صΰ� ���α׷� �մϴ�.���̴� 2021-����⵵�� ó��) 


import java.util.Scanner;
class CancerTest02{
   public static void main(String []args){
      Scanner sc = new Scanner(System.in);
      String name;
      int age,userYear;
      int thisYear;
      thisYear = 2021;

      System.out.println("����⵵�� �Է��ϼ���==>");
      userYear = sc.nextInt();
      System.out.println("�̸��� �Է��ϼ���==>");
      name = sc.next();
      age = thisYear - userYear;

      if (age >= 40)
          System.out.println(name + "��, ���ؿ� " + age +"�� �Դϴ�.����ϰ��� ����� �Դϴ�.");
      else
          System.out.println(name + "��, ���ؿ� " + age + "�� �Դϴ�.����ϰ��� ����ڰ� �ƴմϴ�.");


   }
}