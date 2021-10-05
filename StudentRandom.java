//숙제 검사하는 용도
import java.util.Random;
class  StudentRandom
{
	public static void main(String[] args) 
	{
		String []names = {"김수연","김시아","김지현","노유나","박성미","박지예","유하림","윤서우","윤태인","이건우","임상진","임하연","전세영","정자영","최현호"};
	
		for (int i=0 ; i<100 ; i++ ){
			System.out.print(names[i%names.length]+"\b\b\b");

			try{
				Thread.sleep(100);  //0.1초만큼 대기시간을 가짐
			}catch(Exception e){}
		}

		Random rand = new Random();
		int n = rand.nextInt();
		n = n>>>1;  //무조건 양수 만들려고 함
		n = n%15;
		System.out.println("*** 당첨자 ***");
		System.out.println(names[n]);
	}
}
