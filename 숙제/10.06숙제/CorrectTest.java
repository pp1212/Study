import java.util.Scanner;
class CorrectTest 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String name,star="",answer;
		int day;

		while(true){   //while1 - 이름
			System.out.print("이름을 입력하세요==>"); //여기서부터 잘못된 입력한 경우 나가지 못하고 계속 반복
			name = sc.next();                    //밑에서 이 큰 while의 break를 만나기 전까지 계속 반복
			
				int month;
				while (true){  //while2 - 생월
					System.out.print("생월을 입력하세요==>");
					month = sc.nextInt();
					if(month>=1 && month<=12)   //만족하면 while2를 탈출, 다음 실행
						break;
					
				}
				

				int last=31;
				switch(month){
					case 2: last=28;break;
					case 4:case 6:case 9:case 11: last=30;break;
				}


				while(true){  //while3 - 생일
					System.out.print("생일을 입력하세요==>");
					day = sc.nextInt();
					if(day>=1 && day<=last){
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
					
					while(true){    //while4 - 다시 시작할지 (while(true)라서 정확한 답이 나올때까지 반복)
						System.out.print("또 하시겠어요?(y/n)");
						answer = sc.next();

						if(answer.equals("y") || answer.equals("n")){
							break;
						}
					}//end while4
					
					if (answer.equals("n"))
						break;   //while1문에서 'n'이면 탈출,'y'면 다시 위에서부터 반복
					
			}//end while1
			
			System.out.println("종료하였습니다.");
	}
}
