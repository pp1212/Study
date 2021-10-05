import java.util.Scanner;
class StudentTest02 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int []age = new int[5];
		for (int i=0; i<age.length ;i++ ){  //반복문안에서 변수 겹쳐도 상관 없음 어차피 끝나니까
			System.out.print((i+1) + "번째 학생의 나이를 입력하시오==>"); 
			  //i+1은 i는 0부터 시작하니까 0번째 학생의~가 아니라 1번째 학생의~ 이렇게 출력하려고
			age[i] = sc.nextInt();
		}


		int tot=0;
		for (int i=0 ; i<age.length ; i++ ){
			tot += age[i];
		}
		
		double avg = (double)tot/age.length;
		System.out.println("평균나이:"+avg);
	}
}
