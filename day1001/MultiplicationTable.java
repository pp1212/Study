import java.util.Scanner;
class  MultiplicationTable
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a,i;
		System.out.print("������ �߿� ����� ����ұ��?");
		a = sc.nextInt();
		for(i=1 ; i<=9 ; i++){
			System.out.println(a +"*" + i + "=" + (a*i));  //a*i�� �� ����
		}
	}

}
