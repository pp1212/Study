import java.util.Scanner;
class  ScoreTest
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String []name = new String[5];
		int []score = new int[5];

		for (int i=0 ; i<name.length ; i++){
			System.out.print(i+1 +"번째 학생의 이름 ==> ");
			name[i] = sc.next();
			System.out.print(i+1 +"번째 학생의 점수 ==> ");
			score[i] = sc.nextInt();
		}
		
		for ( int i=0 ; i<score.length ; i++ ){
			for (int j=i+1 ; j<score.length ; j++ ){
				if (score[j] > score[i]){
					int temp = score[i]; 
					score[i] = score[j];  
					score[j] = temp;

					String temp2 = name[i];
					name[i] = name[j];  
					name[j] = temp2;
				}

			}
		}
		System.out.println("*** 성적순 정렬 ***");
		for (int i=0 ; i<score.length ; i++ ){
			System.out.println(name[i] + "   " + score[i]);
		}
	}
}