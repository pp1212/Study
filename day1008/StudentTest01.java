/*
이 프로그램은 5명의 이름,국어,영어,수학을 입력받아 총점과 평균을 구한 다음 성적순으로 정렬하여 출려
성적순으로 정렬한 때,순서가 맞지 않으면 이름도 바꿔주고 국어,영어,수학,총점,평균 일일이 모두
바꾸는 것은 번거로움

이럴때 한 명의 학생의 정보를 관리하기에 필요한 이름,국어,영어,수학,총점,평균을 하나의 세트로 만듬
=>클래스 만드는 것
클래스 만들어 두면 한 명의 정보가 따로 있는 것이 아니라 하나의 세트로 표현 -> 정렬할 때 수월함
*/

import java.util.Scanner;
class Student
{
	String name;
	int kor;
	int eng;
	int math;
	int tot;
	double avg;
}







class StudentTest01 
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		Student s = new Student();   //new->객체생성해라,Student->라는 형태,s->변수
		/*s 안에는 String name;
		int kor;
		int eng;
		int math;
		int tot;
		double avg;*/
		s.name="홍길동";
		s.kor=100;
		s.eng=80;
		s.math=90;

		s.tot = s.kor + s.eng + s.math;
		s.avg = s.tot/3.0;  

		System.out.println("이름:" + s.name);
		System.out.println("국어:"+s.kor);
		System.out.println("영어:"+s.eng);
		System.out.println("수학:"+s.math);
		System.out.println("총점:"+s.tot);
		System.out.println("평균:"+s.avg);

	}
}
