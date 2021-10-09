import java.util.Scanner;
class  ScoreTest02
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String []name = new String[5];
		int []kor = new int[5];
		int []eng = new int[5];
		int []math = new int[5];
		int []tot = new int[5];
		int []avg = new int[5];

		for (int i=0 ; i<name.length ; i++){
			System.out.print(i+1 +"번째 학생의 이름 ==> ");
			name[i] = sc.next();
			System.out.print(i+1 +"번째 학생의 국어점수 ==> ");
			kor[i] = sc.nextInt();
			System.out.print(i+1 +"번째 학생의 영어점수 ==> ");
			eng[i] = sc.nextInt();
			System.out.print(i+1 +"번째 학생의 수학점수 ==> ");
			math[i] = sc.nextInt();
			tot[i] = kor[i] + eng[i] + math[i];
			avg[i] = (double)tot[i]/3;
		}
		

		for ( int i=0 ; i<kor.length ; i++ ){
			for (int j=i+1 ; j<kor.length ; j++ ){
				if (avg[j] > avg[i]){
					int temp = avg[i]; 
					avg[i] = avg[j];  
					avg[j] = temp;

					String temp2 = name[i];
					name[i] = name[j];  
					name[j] = temp2;
				}

			}
		}
		System.out.println("*** 성적순 정렬 ***");
		for (int i=0 ; i<kor.length ; i++ ){
			System.out.println(name[i] + "   " + avg[i]);
		}
	}
}

//홍-50,100,60  이-80,70,50  유-60,30,20  김-30,70,80  문-90,90,30
//70               66.6       36.6          60          70