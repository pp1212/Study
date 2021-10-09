import java.util.Scanner;
class  Constellation
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String name,star="";
		int month,day;
		System.out.print("이름을 입력하세요==>");
		name = sc.next();
		System.out.print("생월을 입력하세요==>");
		month = sc.nextInt();
		System.out.print("생일을 입력하세요==>");
		day = sc.nextInt();

		if(month<1 || month>12){
			System.out.println("입력 범위를 넘었습니다.");
		}else if(day<1 || day>31){
			System.out.println("입력 범위를 넘었습니다.");
		}else if(month==2 && day>29){
			System.out.println("입력 범위를 넘었습니다.");
		}else if(month==4 && day>30){
			System.out.println("입력 범위를 넘었습니다.");
		}else if(month==6 && day>30){
			System.out.println("입력 범위를 넘었습니다.");
		}else if(month==9 && day>30){
			System.out.println("입력 범위를 넘었습니다.");
		}else if(month==11 && day>30){
			System.out.println("입력 범위를 넘었습니다.");
		}else{
			switch (month){
				case 1: 
					if(day>=20)
						star = "물병자리";
					else
						star = "염소자리";
					break;
					
				case 2:
					if(day>=19)
						star = "물고기자리";
					else
						star = "물병자리";
					break;
					
				case 3:
					if(day>=21)
						star = "양자리";
					else
						star = "물고기자리";
					break;
					
				case 4:
					if(day>=20)
						star = "황소자리";
					else
						star = "양자리";
					break;
					
				case 5:
					if(day>=21)
						star = "쌍둥이자리";
					else
						star = "황소자리";
					break;
					
				case 6:
					if(day>=22)
						star = "게자리";
					else
						star = "쌍둥이자리";
					break;
					
				case 7:
					if(day>=23)
						star = "사자자리";
					else
						star = "게자리";
					break;
					
				case 8:
					if(day>=23)
						star = "처녀자리";
					else
						star = "사자자리";
					break;
					
				case 9:
					if(day>=24)
						star = "천칭자리";
					else
						star = "처녀자리";
					break;
					
				case 10:
					if(day>=23)
						star = "전갈자리";
					else
						star = "천칭자리";
					break;
					
				case 11:
					if(day>=23)
						star = "사수자리";
					else
						star = "전갈자리";
					break;
					
				case 12:
					if(day>=25)
						star = "염소자리";
					else
						star = "사수자리";
					break;
					
			}

			System.out.println(name + "님의 별자리는 " + star + "입니다.");
		}

	}
}