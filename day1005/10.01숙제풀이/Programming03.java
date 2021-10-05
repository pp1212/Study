import java.util.Scanner;
class Programming03 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int price = 100;
		int cnt,total;
		System.out.print("물건의 구매수량을 입력하세요==>");
		cnt = sc.nextInt();
		total = price * cnt;
		if (cnt >= 10){
			total = (int)(total * 0.9);  
			//0.9는 double취급 total은 int로 만들었다-> int는 4byte double은 8byte라서 넣을수가 없지만 (int)해서 int로 바꾸기
		}
		System.out.println("전체가격은 " + total + "입니다.");
	}
}
