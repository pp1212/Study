//중첩반복문 사용 해야 함
class  Exercise06_2
{
	public static void main(String[] args) 
	{
		int sum = 0;
		for (int i=10 ; i<=30 ; i++ ){
			for (int j=0; j<=5 ; j++ ){
				sum = sum + (i*j);  //sum += i*j;   //총 반복하는 횟수 21*6, i가10부터 시작해서
			}
		}
		System.out.println(sum);
	}
}
//1.sum이 누적되는 과정을 보려면 for1번 끝나고 출력 반복
//2.지금은 한 번만 출력해도 돼서 for2 바깥에