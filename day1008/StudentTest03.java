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







class StudentTest03 
{
	public static void main(String[] args) 
	{
		
		Student s;
		s = new Student(); //객체 생성하는 문장
		s.name = "홍길동";
		System.out.println(s.name);
	
	
	
	}
}



