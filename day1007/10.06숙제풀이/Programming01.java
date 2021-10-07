import java.util.Scanner;
class  Programming01
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		double []pay = new double[12];
		double total=0;
		double avg;

		for (int i=0 ; i<pay.length ; i++ ){
			
			do{
				System.out.printf("%d월의 카드 사용금액을 입력하세요==>",i+1);
				pay[i] = sc.nextDouble();
			}while(pay[i]<0);
			total += pay[i];  //음수는 더하지 않도록 하기 위해서 여기서 total을 모두 합한다
		}

		avg = total/pay.length;

		double max = pay[0];  //일단 첫 번째에 집어 넣음,제일 카드값이 많이 나온 금액
		double min = pay[0];
		int max_month = 0;   //제일 카드값이 많이 나온 달
		int min_month = 0;

		for (int i=1 ; i<pay.length ; i++ ){
			if (pay[i]>max){
				max = pay[i];
				max_month = i;
			}
			if (pay[i]<min){
				min = pay[i];
				min_month = i;
			}
		}
		
		System.out.printf("1년 동안의 전체 사용금액 : %.1f\n",total); //위에 double이어서
		System.out.printf("월별 평균 사용 금액 : %.1f\n",avg);
		System.out.printf("가장 지출이 많았던 월 : %d\n",max_month+1);
		System.out.printf("가장 지출이 적었던 월 : %d\n",min_month+1);
	}
}
