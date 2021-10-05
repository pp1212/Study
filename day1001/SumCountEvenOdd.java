import java.util.Scanner;
class  SumCountEvenOdd
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n,even_sum=0,odd_sum=0,even_cnt=0,odd_cnt=0;
		System.out.print("N을 입력하시오==>");
		n = sc.nextInt();
		//i:1,2,3,4,5...n  

		for(int i=1 ; i<=n ; i++){
			if(i%2==0){
				even_sum += i; //even_sum = even_sum+i
				even_cnt++; //개수라서 +1
			}else{
				odd_sum += i;
				odd_cnt++; 
			}
		}
		System.out.println("1에서 "+n+"까지의 짝수의 합:"+even_sum);
		System.out.println("1에서 "+n+"까지의 짝수의 개수:"+even_cnt);
		System.out.println("1에서 "+n+"까지의 홀수의 합:"+odd_sum);
		System.out.println("1에서 "+n+"까지의 홀수의 개수:"+odd_cnt);

	}
}
