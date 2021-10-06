import java.util.Scanner;
class StudentTest 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String []name = new String[5];
		int []kor = new int[5];
		int []eng = new int[5];
		int []math = new int[5];
		int []tot = new int[5];
		double []avg = new double[5];

		for (int i=0 ; i<name.length ; i++ ){
			//System.out.print((i+1) + "번째 학생의 이름을 입력하시오===>");
			System.out.printf("%d번째 학생의 이름을 입력하시오===>",i+1);
			name[i] = sc.next();
			System.out.printf("%d번째 학생의 국어점수를 입력하시오===>",i+1);
			kor[i] = sc.nextInt();
			System.out.printf("%d번째 학생의 영어점수를 입력하시오===>",i+1);
			eng[i] = sc.nextInt();
			System.out.printf("%d번째 학생의 수학점수를 입력하시오===>",i+1);
			math[i] = sc.nextInt();
			tot[i] = kor[i] + eng[i] + math[i];
			avg[i] = tot[i]/3.0;
		}

		for (int i=0 ; i<name.length ; i++ ){
			for (int j=i+1 ; j<name.length ; j++ ){
				if (avg[j] > avg[i]){
					String temp1 = name[i];
					name[i] = name[j];
					name[j] = temp1;

					int temp2 = kor[i];
					kor[i] = kor[j];
					kor[j] = temp2;

					temp2 = eng[i];
					eng[i] = eng[j];
					eng[j] = temp2;
					
					temp2 = math[i];
					math[i] = math[j];
					math[j] = temp2;

					temp2 = tot[i];
					tot[i] = tot[j];
					tot[j] = temp2;

					double temp3 = avg[i];
					avg[i] = avg[j];
					avg[j] = temp3;


				}//end if
			}//end forj
		}//end for i
		System.out.println("** 성적 처리 결과 **");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균"); //\t하면 탭만큼  \n은 줄바꿈
		for (int i=0 ;i<name.length ; i++ ){
			//System.out.println(name[i]+"\t"+kor[i]+"\t"+eng[i]+"\t"+math[i]+"\t"+tot[i]+"\t"+avg[i]);
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%.1f\n",name[i],kor[i],eng[i],math[i],tot[i],avg[i]);  //%.1f 소수1번째까지
		}
	}
}
