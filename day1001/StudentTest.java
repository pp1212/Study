class StudentTest 
{
	public static void main(String[] args) 
	{
		String []name = {"임하연","김수연","정자영","윤서우","박성미"};
		int []age = {27,28,26,29,28};
		
		int tot=0;
		for (int i=0 ; i<age.length ; i++ ){
			System.out.println(name[i] + ":" + age[i]);
			tot += age[i];
		}
		//for은 처음 시작 할 때 조건이 만족해야 문장 진행
		
		double avg = (double)tot/age.length;
		System.out.println("평균나이:"+avg);
	}
}
