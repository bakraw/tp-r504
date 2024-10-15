import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class ClientTCP2 {
    public static void main(String[] args) throws IOException{
        Socket socket = new Socket("localhost", 2016);
        DataOutputStream dOut = new DataOutputStream(socket.getOutputStream());
        dOut.writeUTF(args[0]);
        socket.close();
    }
}
