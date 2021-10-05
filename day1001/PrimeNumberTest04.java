import java.util.Scanner;
class  PrimeNumberTest04
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n,i; //for밖에서도 사용하기 위해 먼저 선언
		System.out.print("N을 입력하세요==>");
		n = sc.nextInt();
		
		for (i=2 ; i<n ; i++ ){  //자기자신으로 나누면 안됨
			if(n%i==0){
				break;
			}
		}

		
		if(i==n){     //소수가 아니라면 그전에 탈출하기 때문에, 자기자신과 같다면->끝까지 돌고 나온 소수
			System.out.println(n+"은 소수입니다.");
		}else{
			System.out.println(n+"은 소수가 아닙니다.");
		}
	}
}

/*만약 n의 값이 100이라고 가정하면
12번의 반복문에서 i가 2일때 13번의 조건식을 만족하여 flag에 false가 나옴
이미 i가 2일때 n은 소수가 아님이 판정됨
그래서 굳이 i를 증가시켜서 계속 물어볼 필요 없음

=>flag에 false를 담는 순간 반복을 탈출 하도록 하는게 좋음
*/