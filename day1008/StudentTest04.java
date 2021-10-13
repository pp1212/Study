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







class StudentTest04 
{
	public static void main(String[] args) 
	{
		
		

		Student []s = new Student[1];   //Student 배열 1개 만들어라(객체 생성은 아님)
		//s[0].name = "홍길동";  위에 객체생성을 아직 하지 않았기 때문에 이렇게 바로 사용할 수 없음
		s[0] = new Student(); //객체생성
		s[0].name = "홍길동";  //그 다음에 값 넣을 수 있음
		System.out.println(s[0].name);



		
		/*
		//Student s1;
		//Student s2;

		Student []s = new Student[2]; 
		//이것은 Student의 객체 생성은 아니고 Student의 객체를 참조할 수 있는 Student2개 만들어 주세요
		
		s[0].name = "홍길동";

		*/
	}
}



