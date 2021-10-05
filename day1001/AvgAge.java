class AvgAge
{
	public static void main(String[] args) 
	{
		int []age = {27,28,26,29,28};
		int tot=0;
		//5명의 평균나이 계산하여 출력
		
		for(int i=0 ; i<age.length ; i++){  
			tot += age[i]; //tot = tot + age[1];
		}
		//double avg = tot/age.length 이렇게 하면 둘다 정수라서 결과 값이 double이 안나옴
		double avg = (double)tot/age.length;

		System.out.print("평균나이는 "+ avg +"입니다");

	}
}
