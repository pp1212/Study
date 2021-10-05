class ContinueTest 
{
	public static void main(String[] args) 
	{
		System.out.println("a");
		System.out.println("b");
		for (int i=1 ;i<=10 ;i++ ){
			System.out.println(i);
			if (i%3 == 0){
				continue;
			}
			System.out.println("hello");
		}
		System.out.println("c");
		System.out.println("d");
	}
}
/*
C:\javaStudy\day1005>java ContinueTest
a
b
1
hello
2
hello
3   //hello만나지 않고 다음 반복 계속
4
hello
5
hello
6
7
hello
8
hello
9
10
hello
c
d
*/