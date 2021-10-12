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
			System.out.printf("%d월의 카드 사용 금액을 입력하세요==>",i+1);
			if(price[i]<0){
				System.out.print("잘못된 입력입니다.");
			}else{
				price[i] = sc.nextDouble();
				sum += price[i];
			}
		}
		
		avg = sum / 12;

		max = price[0];  //최대값 구할 때 일단 처음에 값 넣고 비교
		min = price[0];
		for (i=1 ; i<price.length ; i++ ){
			if (max<price[i]){
				max = price[i];
				maxMonth = i;
			}
			if(min>price[i]){	
				min = price[i];  //최대값이랑 최소값을 구하는 if문은 따로 사용!!
				minMonth = i;
			} 
		}

		System.out.println("1년 동안의 전체 사용 금액: " + sum + "원");
		System.out.println("월별 평균 사용 금액: " + avg + "원");

		//System.out.printf("1년 동안의 전체 사용 금액: %d원\n",sum);
		//System.out.printf("월별 평균 사용 금액: %d원\n",avg);
		System.out.printf("가장 지출이 많았던 월: %d월\n",maxMonth+1); //i는 0부터 시작해서 +1해야함
		System.out.printf("가장 지출이 적었던 월: %d월",minMonth+1);
	}
}
