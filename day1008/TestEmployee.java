import java.util.Scanner;
class Employee
{
	String name;
	String addr;
	int salary;
	String phone;

	
}

//5명 사원의 정보를 저장하기 위한 배열을 만들고-> 입력받아->출력

class TestEmployee 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		//배열 참조 변수 선언
		Employee []e;   //5는 5명
		
		//배열을 생성
		e = new Employee[5];
		
		//사용자로부터 데이터를 받아서 배열에 추가한다
		for (int i=0;i<e.length ;i++ ){
			e[i] = new Employee();   //객체 생성
			System.out.printf("%d번째 사원의 이름을 입력하시오--->",i+1);
			e[i].name = sc.next();
			System.out.printf("%d번째 사원의 주소를 입력하시오--->",i+1);
			e[i].addr = sc.next();
			System.out.printf("%d번째 사원의 연봉를 입력하시오--->",i+1);
			e[i].salary = sc.nextInt();
			System.out.printf("%d번째 사원의 전화번호를 입력하시오--->",i+1);
			e[i].phone = sc.next();
		}	
		
		System.out.println("*** 사원의 정보 ***");
		System.out.println("이름\t주소\t연봉\t전화번호");
		for (int i=0;i<e.length ;i++ ){
			System.out.printf("%s\t%s\t%d\t%s\n",e[i].name,e[i].addr,e[i].salary,e[i].phone);
		}
		
	}
}
