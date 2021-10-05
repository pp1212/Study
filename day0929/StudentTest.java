import java.util.Scanner;
class  StudentTest
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String name;
		int kor,eng,math,tot;
		double avg;
		System.out.print("학생의 이름을 입력하세요==>");
		name = sc.next();  //변수이름sc는 스캐너를 뜻함
		System.out.print("국어점수 입력하세요==>");
		kor = sc.nextInt();
		System.out.print("영어점수를 입력하세요==>");
		eng = sc.nextInt();
		System.out.print("수학점수를 입력하세요==>");
		math = sc.nextInt();

		tot = kor + eng + math;
		//avg = (double)kor + eng + math / 3;  3을 int로 인식함
		avg = (double)tot / 3;  //아니면 더블 안붙이고 3.0으로 나눠도 됨

		System.out.println("** 결과 출력 **");
		System.out.println("이름: "+name);
		System.out.println("국어: "+kor);
		System.out.println("영어: "+eng);
		System.out.println("수학: "+math);
		System.out.println("총점: "+ tot);
		System.out.println("평균: "+ avg);

		if ( avg >= 60)
			System.out.print(name + "님 합격입니다");
		else
			System.out.print(name + "님 불합격입니다");

	}
}
