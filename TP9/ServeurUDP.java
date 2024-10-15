import java.io.*;
import java.net.*;

public class ServeurUDP {
	public static void main(String args[]) throws IOException {
        InetAddress addr = InetAddress.getLocalHost();
        
        System.out.println("--- En attente de données");

        for (;;) {
            DatagramSocket socket = new DatagramSocket(1234);
            DatagramPacket packet = new DatagramPacket(new byte[1024], 1024);
            socket.receive(packet);
            String string = new String(packet.getData());
            System.out.println("<< string = " + string);

            DatagramPacket response = new DatagramPacket(packet.getData(), packet.getLength(), addr, 1234);
            socket.send(response);
            System.out.println(">> " + string);
            socket.close();
        }
    }
}