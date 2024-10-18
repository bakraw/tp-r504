import java.io.*;
import java.net.*;

public class ServeurTCP2 {
    public static void main(String[] args) throws IOException {
        ServerSocket socketserver = new ServerSocket(2016);
        for (;;) {
            System.out.println("Serveur en attente d'une connexion...");
            Socket socket = socketserver.accept();
            System.out.println("Connexion acceptée.");
            DataInputStream dIn = new DataInputStream(socket.getInputStream());
            System.out.println("<<< " + dIn.readUTF());

            socket.close();
            socketserver.close();
        }
    }
}
