

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.util.Arrays;

public class UDPRecever {

	public static void main(String[] args) {
		
		//�����͸� �ְ� �ޱ� ���ؼ� DatagramSocket���� ����
		//DatagramSocket(int port)
		
		try {
			DatagramSocket socket = new DatagramSocket(9002);
			
			//�������� �����͸� ��� ���� byte�� �迭�� ����
			byte []data = new byte[100];		//�ȳ��ϼ���
												//��ġ
			
			//Sender�� �������� �����͸� �ޱ� ���Ͽ� DatagramPacket�� ����
			DatagramPacket packet = new DatagramPacket(data, data.length);
			

			System.out.println("Receiver�� ���۵Ǿ����ϴ�.");
			//Sender�� �������� �����͸� ��� �ޱ� ���Ͽ� ���ѹݺ������� ǥ��
			while(true) {
				//DatagramSocket�� receive�޼ҵ带 ���� �����͸� ����
				socket.receive(packet);
				
				//��¥ �޾��� �����ʹ� byte���� �迭��(��Ŷ�� ���� �� �� �迭) data�� ����� ����
				//�̰��� String �����ڸ� �̿��Ͽ� ���ڿ��� ����
				String msg = new String(data);
				System.out.println("���ŵȵ�����:"+msg.trim());
				
				//������ ���ŵǴ� �����͸� ���Ͽ�
				//byte�� �迭 data�� ����� �� 
				Arrays.fill(data, (byte)0);
			}
			
			
		} catch (Exception e) {
			System.out.println("���ܹ߻�:"+e.getMessage());
		}
	}
}
