import java.util.Scanner;
class  CreditCard
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		double []price = new double[12];
		double min,max; //sum=0,avg
		int i,maxMonth=0,minMonth=0,avg,sum=0;
		
		for (i=0 ; i<price.length ; i++ ){
			System.out.printf("%d���� ī�� ��� �ݾ��� �Է��ϼ���==>",i+1);
			if(price[i]<0){
				System.out.print("�߸��� �Է��Դϴ�.");
			}else{
				price[i] = sc.nextDouble();
				sum += price[i];
			}
		}
		
		avg = sum / 12;

		max = price[0];  //�ִ밪 ���� �� �ϴ� ó���� �� �ְ� ��
		min = price[0];
		for (i=1 ; i<price.length ; i++ ){
			if (max<price[i]){
				max = price[i];
				maxMonth = i;
			}
			if(min>price[i]){	
				min = price[i];  //�ִ밪�̶� �ּҰ��� ���ϴ� if���� ���� ���!!
				minMonth = i;
			} 
		}

		System.out.println("1�� ������ ��ü ��� �ݾ�: " + sum + "��");
		System.out.println("���� ��� ��� �ݾ�: " + avg + "��");

		//System.out.printf("1�� ������ ��ü ��� �ݾ�: %d��\n",sum);
		//System.out.printf("���� ��� ��� �ݾ�: %d��\n",avg);
		System.out.printf("���� ������ ���Ҵ� ��: %d��\n",maxMonth+1); //i�� 0���� �����ؼ� +1�ؾ���
		System.out.printf("���� ������ ������ ��: %d��",minMonth+1);
	}
}
