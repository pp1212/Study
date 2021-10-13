import java.util.Scanner;

class MyUtil   //하나의 클래스에 3개의 메소드
{
	int correctAnswers(char []answer,char []student_answer){
		int cnt = 0;
		for (int i=0 ;i<answer.length ;i++ ){
			if (answer[i] == student_answer[i])	{
				cnt++;
			}
		}
		return cnt;
	}

	int incorrectAnswers(char []answer,char []student_answer){  //다른 클래스여도 메소드가 있는 상태이면 불러와서 사용가능
		//메소드 안에서 다른 메소드 호출 가능
		return 10 - correctAnswers(answer,student_answer);
	}
	
	boolean isPassed(char []answer,char []student_answer){
		return correctAnswers(answer,student_answer)>=7;   //여기다시보기
		
		/*
		if (correctAnswers(answer,student_answer)>=7){
			return true;
		}else{
			return false;
		}
		*/

	}
}






class  Exam
{
	public static void main(String[] args) 
	{
		String []question = {
		"대한민국의 수도는?",
		"미국의 수도는?",
		"모나코의 수도는?",
		"브라질의 수도는?",
		"스위스의 수도는?",
		"싱가폴의 수도는?",
		"영국의 수도는?",
		"인도의 수도는?",
		"캐나다의 수도는?",
		"터키의 수도는?"};
		String []view = {
			"a)아크라  b)서울  c)코펜하겐  d)야렌",
			"a)워싱턴  b)서울  c)코펜하겐  d)야렌",
			"a)아크라  b)서울  c)모나코  d)야렌",
			"a)아크라  b)서울  c)코펜하겐  d)브라질리아",
			"a)베른  b)서울  c)코펜하겐  d)야렌",
			"a)아크라  b)싱가포르  c)코펜하겐  d)야렌",
			"a)아크라  b)런던  c)코펜하겐  d)야렌",
			"a)뉴델리  b)서울  c)코펜하겐  d)야렌",
			"a)아크라  b)서울  c)오타와  d)야렌",
			"a)앙카라  b)서울  c)코펜하겐  d)야렌"};
		char []answer = {'b','a','c','d','a','b','b','a','c','a'};
		char []student_answer = new char[10];

		Scanner sc = new Scanner(System.in);
		for (int i=0 ; i<question.length ; i++ ){
			System.out.print(question[i]);
			System.out.print(view[i]+"==>");
			student_answer[i] = sc.next().charAt(0);
		}

		MyUtil util = new MyUtil();
		int cnt = util.correctAnswers(answer,student_answer);

		System.out.println("*** 시험 결과 ***");
		System.out.printf("정답수:%d\n",cnt);
		System.out.printf("틀린답수:%d\n",util.incorrectAnswers(answer,student_answer));   //매소드 호출한 결과를 바로 써도 됨
		if(util.isPassed(answer,student_answer)){
			System.out.printf("합격여부 : %s\n","합격");
		}else{
			System.out.printf("합격여부 : %s\n","불합격");
		}
	}
}
