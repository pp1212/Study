class  DecimalOctalHexaBinary
{
	public static void main(String[] args) 
	{
		int a = 12; 
		int b = 014;  //0을 붙이면 8진수로 받아들임
		int c = 0xC;   //0x을 붙이면 16진수로 받아들임 
		int d = 0b1100;  //0b을 붙이면 2진수로 받아들임
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}


/*
8	10	16		2
----------------------------------
0	0	0		0
1	1	1		1
2	2	2		10
3	3	3		11
4	4	4		100
5	5	5		101
6	6	6		110
7	7	7		111
10	8	8		1000
11	9	9		1001
12	10	A		1010
13	11	B		1011
14	12	C		1100
	13	D
	14	E
	15	F
	16	10
	17	11

*/

