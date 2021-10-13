import java.util.Scanner;
class ArrayLengthUserInput 
{
	//다른 클래스 안만들고 현재 클래스에서 메소드 만듬
	static void printArray(double []data){   //객체없어서 static,괄호안에 매개변수 필요
		//인덱스 가져오는 것이 아닌 for-each반복문 써야함
		for(double i:data){      //배열의 인덱스가 아닌 요소를 가져옴
			System.out.printf("%10.1f",i);  //10칸씩 표현하는데 소수점 첫 번째 자리까지
		}
		System.out.println();
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		double []readings;  //배열선언
		int n;
		System.out.print("배열의 크기를 입력하세요==>");
		n = sc.nextInt();
		readings = new double[n];   //배열크기 정함
		
		for (int i=0 ; i<n ; i++ ){     //배열의 요소 입력 받음
			System.out.printf("%d번째 값을 입력하세요==>",i+1);
			readings[i] = sc.nextDouble();
		}

		
		printArray(readings);     //메소드 호출
			
	}
}

