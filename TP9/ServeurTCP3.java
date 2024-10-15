import java.io.*;
import java.net.*;

public class ServeurTCP3 {
    public static void main(String[] args) throws IOException {
        for (;;) {
            ServerSocket socketserver = new ServerSocket(2016);
            System.out.println("Serveur en attente d'une connexion...");
            Socket socket = socketserver.accept();
            System.out.println("Connexion acceptée.");
            DataInputStream dIn = new DataInputStream(socket.getInputStream()); 
            System.out.println("<<< " + dIn.readUTF());
            DataOutputStream dOut = new DataOutputStream(socket.getOutputStream());
            String rev = new StringBuilder(dIn.readUTF()).reverse().toString();
            dOut.writeUTF(rev);
            System.out.println(rev);

            socket.close();
            socketserver.close();
        }
    }
}
