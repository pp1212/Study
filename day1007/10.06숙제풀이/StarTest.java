import java.util.Scanner;
class  StarTest
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String name,result="";
		int month,day;
		int []last = {31,28,31,30,31,30,31,31,30,31,30,31};
		char again; //큰 do while문안에 있으면 밑에 모르니까 do while 보다 먼저 선언
		
		do{
			System.out.print("이름을 입력하시오==>");
			name = sc.next();


			do{
				System.out.print("생월을 입력하시오==>");
				month = sc.nextInt();
			}while(month<1 || month>12);

			
			do{
				System.out.print("생일을 입력하시오==>");
				day = sc.nextInt();
			}while(day<1 || day>last[month-1]);
			

			switch(month){
				case 1:if(day<=19)	result = "염소"; else result = "물병";break;  //한 줄로 표현 가능,하지만 ;뒤 아니면 띄어쓰기 잘하기
				case 2:if(day<=18)	result = "물병"; else result = "물고기";break;
				case 3:if(day<=20)	result = "물고기"; else result = "양";break;
				case 4:if(day<=19)	result = "양"; else result = "황소";break;
				case 5:if(day<=20)	result = "황소"; else result = "쌍둥이";break;
				case 6:if(day<=21)	result = "쌍둥이"; else result = "게";break;
				case 7:if(day<=22)	result = "게"; else result = "사자";break;
				case 8:if(day<=22)	result = "사자"; else result = "처녀";break;
				case 9:if(day<=23)	result = "처녀"; else result = "천칭";break;
				case 10:if(day<=22)	result = "천칭"; else result = "전갈";break;
				case 11:if(day<=22)	result = "전갈"; else result = "사수";break;
				case 12:if(day<=24)	result = "사수"; else result = "염소";break;
			}//end switch
			System.out.printf("%s님의 별자리는 %s자리입니다.\n",name,result);
			

			
			do{
				System.out.print("또, 하시겠어요?(y/n)==>");
				again = sc.next().charAt(0); //String에서 인덱스에 있는 한 글자 뽑아줌
			}while(again!='y' && again!='n' && again!='Y' && again !='N'); //y,n이 아니면 계속 되물음


		}while(again == 'y' || again == 'Y');   //큰 do while문에서 while(조건-y이면)이면 반복
		
		System.out.println("종료합니다.");
	}
}
