class AvgAge
{
	public static void main(String[] args) 
	{
		int []age = {27,28,26,29,28};
		int tot=0;
		//5���� ��ճ��� ����Ͽ� ���
		
		for(int i=0 ; i<age.length ; i++){  
			tot += age[i]; //tot = tot + age[1];
		}
		//double avg = tot/age.length �̷��� �ϸ� �Ѵ� ������ ��� ���� double�� �ȳ���
		double avg = (double)tot/age.length;

		System.out.print("��ճ��̴� "+ avg +"�Դϴ�");

	}
}
