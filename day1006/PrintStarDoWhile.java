import java.util.Scanner;
class  PrintStarDoWhile
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int rows,cols;
		System.out.print("�ټ��� �Է��ϼ���==>");
		rows = sc.nextInt();
		System.out.print("ĭ���� �Է��ϼ���==>");
		cols = sc.nextInt();

		int i,j;
		
		i=1;
		do{
			j=1;
			do{
				System.out.print("*");
				j++;
			}
			while (j<=cols);
			System.out.println();
			i++;
		}while (i<=rows);
	}
}
