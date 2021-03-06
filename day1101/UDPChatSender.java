

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.Socket;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UDPChatSender extends JFrame implements ActionListener,Runnable{

	//대화내용을 출력할 텍스트에리어를 맴버변수로 만듬
	JTextArea jta;
	
	//내가 대화내용을 입력할 텍스트필드를 맴버변수로 만듬
	JTextField jtf;
	
	//입출력 스트림을 맴버변수로 만듬
	InputStream is;
	OutputStream os;
	
	public UDPChatSender() {
		
		//멤버변수 텍스트에리어와 텍스트필드를 생성
		jta = new JTextArea();
		jtf = new JTextField(50);
		
		//전송을 위한 버튼 생성
		JButton btn = new JButton("전송");
		
		//버튼에 이벤트 등록 -> 버튼 눌리면 actionperformed로 감
		btn.addActionListener(this);
		
		//텍스트필드와 버튼을 담기 위한 패널 생성
		JPanel p = new JPanel();
		p.add(jtf);
		p.add(btn);
		
		//텍스트에리어를 스크롤팬으로 감싸기
		JScrollPane jsp = new JScrollPane(jta);
		
		//프레임의 가운데에 텍스트에리어를 감싸고 있는 스크롤팬을 담기
		add(jsp,BorderLayout.CENTER);
		
		//텍스트필드와 버튼을 담고 있는 패널을 프레임의 아래에 담기
		add(p,BorderLayout.SOUTH);
		
		//프레임 크기 설정
		setSize(800,600);
		
		//프레임이 화면에 보이도록 설정
		setVisible(true);
		
		
		Thread t = new Thread(this);
		t.start();
		//->이렇게 해야 run 동작함
		
		
	}//end 생성자
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String ip = args[0];
		String msg = args[1];
		
		try {
			DatagramSocket socket = new DatagramSocket(9002);
			
			//목적지의 주소 ip를 갖고 InetAddress객체 생성
			InetAddress addr = InetAddress.getByName(ip);
			
			//전송하고자 하는 문자열 msg를 byte의 배열로 만듬
			byte[]data = msg.getBytes();
			
			//UDP방식의 데이터전송단위 패킷을 생성
			DatagramPacket packet = new DatagramPacket(data, data.length, addr,9002);
			
			//DatagramSocket클래스의 send메소드를 통해 데이터 전송
			socket.send(packet);
			
			//소켓을 닫아줌
			socket.close();
			
			
		} catch (Exception e) {
			System.out.println("예외발생:"+e.getMessage());
		}
		
		
		
		new UDPChatSender();
		//1.main start
		//2.생성자 start
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		try {
			//사용자가 입력한 텍스트필드의 내용을 서버로 보냄
			//OutputStream void	write(byte[] b) 메소드 이용
			//가져와서 byte로 바꿔줌
			byte []data = jtf.getText().getBytes();
			os.write(data);
			
			//계속 내보내야 하니까 close 안 함
			
			//메세지를 전송하고 다음 메세지 입력을 위하여 텍스트필드를 깨끗이 지움
			jtf.setText("");
			
			
		} catch (Exception ex) {
			System.out.println("예외발생:"+ex.getMessage());
		}
	}

	
	//서버로부터 수신된 데이터를 계속 받도록 함
	//여러개의 클라이언트가 있을 때 내가(클라이언트) 말 안해도 다른 클라이언트의 말을 계속 받도록
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		byte []data = new byte[100];
		while(true) {
			try {
				is.read(data);
				String msg = new String(data);
				msg = msg.trim();
				jta.append(msg+"\n");
				
			}catch (Exception e) {
				// TODO: handle exception
			}//end catch
		}//end while
	}//end run

}
