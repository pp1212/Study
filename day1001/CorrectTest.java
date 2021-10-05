import java.util.Scanner;
class  CorrectTest
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int []answer = {1,2,3,4,1,2,3,4,1,2};  //정답 초기화
		int []user = new int[10];              //사용자 정답 저장할 배열 선언
		
		for (int i=0 ; i<user.length ; i++ ){  //정답 입력 for문
			System.out.print((i+1) + "번 답을 입력하세요==>");
			user[i]=sc.nextInt();
		}
		
		int answer_cnt=0,wrong_cnt=0;   //맞은문제,틀린문제 개수 저장 변수
		for (int i=0 ; i<answer.length ; i++ ){  //맞았는지 틀렸는지 여부 계산 for문
			if (answer[i] == user[i]){
				System.out.println((i+1)+""+"O");
				answer_cnt++;  //맞은 문제 개수 증가
			}else{
				System.out.println((i+1)+""+"X");
				wrong_cnt++;  //틀린 문제 개수 증가
			}
		}
		System.out.println("정답수: " + answer_cnt + "개");
		System.out.println("틀린답수: " + wrong_cnt + "개");

	}
}
