import java.util.Scanner;
class ArrayLengthUserInput 
{
	//�ٸ� Ŭ���� �ȸ���� ���� Ŭ�������� �޼ҵ� ����
	static void printArray(double []data){   //��ü��� static,��ȣ�ȿ� �Ű����� �ʿ�
		//�ε��� �������� ���� �ƴ� for-each�ݺ��� �����
		for(double i:data){      //�迭�� �ε����� �ƴ� ��Ҹ� ������
			System.out.printf("%10.1f",i);  //10ĭ�� ǥ���ϴµ� �Ҽ��� ù ��° �ڸ�����
		}
		System.out.println();
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		double []readings;  //�迭����
		int n;
		System.out.print("�迭�� ũ�⸦ �Է��ϼ���==>");
		n = sc.nextInt();
		readings = new double[n];   //�迭ũ�� ����
		
		for (int i=0 ; i<n ; i++ ){     //�迭�� ��� �Է� ����
			System.out.printf("%d��° ���� �Է��ϼ���==>",i+1);
			readings[i] = sc.nextDouble();
		}

		
		printArray(readings);     //�޼ҵ� ȣ��
			
	}
}

