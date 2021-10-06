import java.util.Scanner;
class CorrectTest 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String name,star="",answer;
		
		while(true){   //while1
			System.out.print("이름을 입력하세요==>"); //여기서부터 잘못된 입력한 경우 나가지 못하고 계속 반복
			name = sc.next();                    //밑에서 이 큰 while의 break를 만나기 전까지 계속 반복
			
				int month;
				while (true){  //while2
					System.out.print("월을 입력하세요==>");
					month = sc.nextInt();
					if(month>=1 && month<=12)   //만족하면 while2를 탈출
						break;
					
				}
				

				int day;
				for(;;){
					System.out.print("생일을 입력하세요==>");
					day = sc.nextInt();
					if(day>=1 && day<=31){
						break;
					}
				}
				
				switch (month){
						case 1: 
							if(day>=20)star = "물병자리";
							else star = "염소자리";
							break;
							
						case 2:
							if(day>=19)star = "물고기자리";
							else star = "물병자리";
							break;
							
						case 3:
							if(day>=21)star = "양자리";
							else star = "물고기자리";
							break;
							
						case 4:
							if(day>=20)star = "황소자리";
							else star = "양자리";
							break;
							
						case 5:
							if(day>=21)star = "쌍둥이자리";
							else star = "황소자리";
							break;
							
						case 6:
							if(day>=22)star = "게자리";
							else star = "쌍둥이자리";
							break;
							
						case 7:
							if(day>=23)star = "사자자리";
							else star = "게자리";
							break;
							
						case 8:
							if(day>=23)star = "처녀자리";
							else star = "사자자리";
							break;
							
						case 9:
							if(day>=24)star = "천칭자리";
							else star = "처녀자리";
							break;
							
						case 10:
							if(day>=23)star = "전갈자리";
							else star = "천칭자리";
							break;
							
						case 11:
							if(day>=23)star = "사수자리";
							else star = "전갈자리";
							break;
							
						case 12:
							if(day>=25)star = "염소자리";
							else star = "사수자리";
							break;
							
					}
					
					System.out.printf("%s 님의 별자리는 %s입니다.\n",name,star);
					
					while(true){
						System.out.print("또 하시겠습니까?(Y/N)");
						answer = sc.next();

						if(answer.equals("Y") || answer.equals("N")){
							break;
						}
					}

			System.out.print("또 하시겠어요?(y/n)");
			answer = sc.next();
			if (answer.equals("n")){
				System.out.println("종료하였습니다.");
			}

	}
}
