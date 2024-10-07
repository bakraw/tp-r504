import java.io.*;
import java.net.*;

public class ClientUDP {
	public static void main(String args[]) throws IOException {
		InetAddress addr = InetAddress.getLocalHost();
		System.out.println("adresse = " + addr.getHostName());
		
		String dataString = "abcdef";
		byte[] data = dataString.getBytes();
		int dataLength = data.length;

		DatagramPacket packet = new DatagramPacket(data, dataLength, addr, 1234);
		DatagramSocket socket = new DatagramSocket();
		socket.send(packet);

		System.out.println("--- En attente de données");

		DatagramPacket packet2 = new DatagramPacket(new byte[1024], 1024);
		socket.receive(packet2);
		String string = new String(packet2.getData());
		System.out.println("<< string = " + string);
	
		socket.close();
	}
}
