class Box
{
	int width;
	int length;
	int height;

	public void setWidth(int w){    //������
		width = w;
	}
	public int getWidth(){   //������ ���ư�
		return width;
	}
	public void setLength(int l){
		length = l;
	}
	public int getLength(){
		return length;
	}
	public void setHeight(int h){
		height = h;
	}
	public int getHeight(){
		return height;
	}

	public int getVolume(){
		int volume = width*length*height;
		return volume;
	}


	//���� ������ �Ӽ����� ���ڿ��� ���� ��ȯ�ϴ� toString() �޼ҵ带 �ۼ�
	/*
	public String toString(){
		String result = "����:" + width + ",����:" + length + ",����:" + height;
		return result;
	}*/
}

class  BoxTest
{
	public static void main(String[] args) 
	{
		//���� ��ü�� ����ų �� �ִ� ���� ���� box1�� �����϶�
		Box box1;

		//���� ��ü�� �����Ͽ��� �������� box1�� ����Ű�� �϶�
		box1 = new Box();
		box1.setWidth(100);
		box1.setLength(100);
		box1.setHeight(100);
		System.out.println(box1.getVolume());
		
		System.out.println(box1);   
		//toString�޼ҵ� ����
		//��ü���������� ��¹��� ���ָ� toString�޼ҵ尡 �ڵ����� ����
		//���� toString�޼ҵ尡 ������ �� ��ü�� Ŭ�����̸��� ��� �ִ��� ������ ���� �ִ� �ּҰ��� ���
		//->Box@41a4555e
		//���� ���� �� Ŭ������ �Ӽ����� ���ڿ��� ����� ���� �ִٸ� String�� ��ȯ�ϴ� toString�� ����� �ش�
		
		//�ι�° ��ü�� box2 �����ϰ� ���μ��γ��̸� 200,200,200���� ����
		Box box2 = new Box();  
		box2.setWidth(200);
		box2.setLength(200);
		box2.setHeight(200);
		
		
		//�������� box2�� ���� box1�� ������ ��, �����ڸ� ���� box1�� �Ӽ����� ���
		box1 = box2;   //box1�� box2�� ���� ��ü�� �ٶ󺸶��� ��
		System.out.println(box1.getWidth());  //200
		System.out.println(box2.getWidth());  //200
		//box1�� box2�� ������ ��ü�� �����Ѵ�!
		//���� box1�� �����ϰ� �ִ� ���μ��γ��̰� 100�� ��ü�� ���� �ƹ��� �����ϰ� ���� ����
		//�׷��� �� ��ü�� ����� �� ����
		//���̻� ����� �� ���� ��ü(�޸�) = garbage
	}
}
