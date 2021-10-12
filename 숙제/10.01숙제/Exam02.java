import java.util.Scanner;
class  Exam02
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String i="";
		int width,height;
		double radius;
		System.out.print("하나의 문자를 입력해주세요==>");
		i = sc.next();

		if (i.equals("R")){
			System.out.print("가로길이를 입력하세요==>");
			width = sc.nextInt();
			System.out.print("세로길이를 입력하세요==>");
			height = sc.nextInt();
			System.out.println("사각형의 면적:"+(width*height));
		}else if (i.equals("T")){
			System.out.print("밑변을 입력하세요==>");
			width = sc.nextInt();
			System.out.print("높이를 입력하세요==>");
			height = sc.nextInt();
			System.out.println("삼각형의 면적:"+(width*height*0.5));
		}else if(i.equals("C")){
			System.out.print("반지름을 입력하세요==>");
			radius = sc.nextInt();
			System.out.println("원의 면적:"+(radius*radius*3.14));
		}

	}
}
