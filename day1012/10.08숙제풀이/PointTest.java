class Point{
	int x;
	int y;
	public int getX(){  //�Ӽ�(�������) x�� ������ ��ȯ�ϴ� ��� =>������
		return x;
	}
	public void setX(int xCoord){   //�Ű������� ���޹��� ���� �Ӽ�(�������)x�� ����(����)�ϴ� ���  =>������
		x = xCoord;
	}
	
	public int getY(){
		return y;
	}
	public void setY(int yCoord){  //200�� yCoord�� �޾Ƽ� �������y�� ����(����)
		y = yCoord;
	}

}




class  PointTest
{
	public static void main(String[] args) 
	{
		Point p1 = new Point();  //��ü�� ����
		p1.setX(100);
		p1.setY(200);

		Point p2 = new Point();
		p2.setX(100);
		p2.setY(300);
	
		System.out.printf("ù ��° ��ü�� x:%d, y:%d\n",p1.getX(),p1.getY());
		System.out.printf("�� ��° ��ü�� x:%d, y:%d\n",p2.getX(),p2.getY());
	}
}
