import java.util.Scanner;
class  FateTest
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String []fate = {"천귀","천액","천권","천파","천인","천문","천복","천고","천역","천간","천수","천명"};
		String []zod1 = {"쥐","소","범","토끼","용","뱀","말","양","원숭이","닭","개","돼지"};
		String []zod3 = {"자","축","인","묘","진","사","오","미","신","유","술","해"};

		String name,zod2,hour;
		int mon,day,j=0;
		System.out.print("이름을 입력하시오==>");
		name = sc.next();
		System.out.print("띠를 입력하시오==>");
		zod2 = sc.next();
		System.out.print("생월을 입력하시오==>");
		mon = sc.nextInt();
		System.out.print("생일을 입력하시오==>");
		day = sc.nextInt();
		System.out.print("생시를 입력하시오==>");
		hour = sc.next();
		
		for (int i=0 ; i<fate.length ; i++ ){
			if (zod2.equals(zod1[i])){
				System.out.println("생년: " + zod2 + "띠 ==> " + fate[i]);
				System.out.println("생월: " + mon + " ==> " + fate[i-1+mon]);
				System.out.println("생일: " + day + " ==> " + fate[i-1+mon-1+day]);
			}
		}
	}
}
