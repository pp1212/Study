import java.util.Scanner;
class Employee
{
	String name;
	String addr;
	int salary;
	String phone;

	
}

//5�� ����� ������ �����ϱ� ���� �迭�� �����-> �Է¹޾�->���

class TestEmployee 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		//�迭 ���� ���� ����
		Employee []e;   //5�� 5��
		
		//�迭�� ����
		e = new Employee[5];
		
		//����ڷκ��� �����͸� �޾Ƽ� �迭�� �߰��Ѵ�
		for (int i=0;i<e.length ;i++ ){
			e[i] = new Employee();   //��ü ����
			System.out.printf("%d��° ����� �̸��� �Է��Ͻÿ�--->",i+1);
			e[i].name = sc.next();
			System.out.printf("%d��° ����� �ּҸ� �Է��Ͻÿ�--->",i+1);
			e[i].addr = sc.next();
			System.out.printf("%d��° ����� ������ �Է��Ͻÿ�--->",i+1);
			e[i].salary = sc.nextInt();
			System.out.printf("%d��° ����� ��ȭ��ȣ�� �Է��Ͻÿ�--->",i+1);
			e[i].phone = sc.next();
		}	
		
		System.out.println("*** ����� ���� ***");
		System.out.println("�̸�\t�ּ�\t����\t��ȭ��ȣ");
		for (int i=0;i<e.length ;i++ ){
			System.out.printf("%s\t%s\t%d\t%s\n",e[i].name,e[i].addr,e[i].salary,e[i].phone);
		}
		
	}
}
