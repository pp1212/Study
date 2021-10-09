//배열-프로그래밍 2번
class MyUtil 
{
	boolean isPassed (String []a,String []b){
			
		int cnt = 0;
		for (int i=0 ; i<a.length ; i++ ){
			if (a[i] == b[i]){
				cnt++;
			}
		}
		
		boolean flag = true;
		if (cnt >= 7){
			System.out.println(flag);
		}else{
			flag = false;
			System.out.println(flag);
		}return flag;

	}
}


class MyUtil02
{
	void correctAnswers(String []a,String []b){
		
		int cnt = 0;
		for (int i=0 ; i<a.length ; i++ ){
			if (a[i] == b[i]){
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}


class MyUtil03
{
	void incorrectAnswers(String []a,String []b){
		
		int cnt = 0;
		for (int i=0 ; i<a.length ; i++ ){
			if (a[i] != b[i]){
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}







class  Exam
{
	public static void main(String[] args) 
	{
		String []answer = {"a","b","c","d","a","b","c","d","a","b"};
		String []user = {"a","b","c","d","a","b","c","a","c","b"};
		
		MyUtil util = new MyUtil();
		util.isPassed(answer,user);

		MyUtil02 util02 = new MyUtil02();
		util02.correctAnswers(answer,user);

		MyUtil03 util03 = new MyUtil03();
		util03.incorrectAnswers(answer,user);
	}
}
