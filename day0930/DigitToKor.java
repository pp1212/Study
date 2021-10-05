import java.util.Scanner;
class  DigitToKor
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("0~9»çÀÌÀÇ ¼ö¸¦ ÀÔ·ÂÇÏ½Ã¿À==>");
		n = sc.nextInt();

		if(n == 0){
			System.out.println("¿µ");
			}else if(n ==1 ){
				System.out.println("ÀÏ");
			}else if(n ==2 ){
				System.out.println("ÀÌ");
			}else if(n ==3 ){
				System.out.println("»ï");
			}else if(n ==4 ){
				System.out.println("»ç");
			}else if(n ==5 ){
				System.out.println("¿À");
			}else if(n ==6 ){
				System.out.println("À°");
			}else if(n ==7 ){
				System.out.println("Ä¥");
			}else if(n ==8 ){
				System.out.println("ÆÈ");
			}else{
				System.out.println("±¸");
		}
	}
}
