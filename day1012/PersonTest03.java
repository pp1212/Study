class Person
{
	private String name;

	public void setName(String name){
		name = name;   //'�Ű������� ���� �Ű������� �����϶�'�̱� ������ ���� ������� ����
	}

	public String getName(){
		return name;
	}
}


class PersonTest03 
{
	public static void main(String[] args) 
	{
		Person p1 = new Person();
		p1.setName("ȫ�浿");
		System.out.println(p1.getName());
	}
}

/*�� Ŭ������ ���� ���� ����޼ҵ��� �Ű����� �̸��� �ǹ��ִ� �̸����� �����ִ� ����
��������� �̸��� �����ϰ� ��
�޼ҵ� �ȿ��� ��������� �����ϱ� ���ؼ��� this.������������� ���� ����
class Person
{
	private String name;

	public void setName(String name){
		this.name = name;   
		//�޼ҵ� �ȿ��� ��������� �����ϱ� ���ؼ��� thisŰ���� ���
		//�Ű������� �޶� ������ ����
	}

}
*/