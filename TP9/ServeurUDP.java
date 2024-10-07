import java.io.*;
import java.net.*;

public class ServeurUDP {
	public static void main(String args[]) throws IOException {
        DatagramSocket socket = new DatagramSocket(1234);
        System.out.println("--- En attente de données");
        for (;;) {
            DatagramPacket packet = new DatagramPacket(new byte[1024], 1024);
            socket.receive(packet);
            String string = new String(packet.getData());
            System.out.println("<< string = " + string);

            InetAddress addr = InetAddress.getLocalHost();
            DatagramPacket response = new DatagramPacket(packet.getData(), packet.getLength(), addr, 1234);
            socket.send(response);
            System.out.println(">> " + string);
        }
    }
}