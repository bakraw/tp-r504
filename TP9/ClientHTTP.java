import java.io.*;
import java.net.*;

public class ClientHTTP {
    public static void main(String[] args) throws IOException{

        Socket socket = new Socket(args[0], 80);
        OutputStreamWriter osw = new OutputStreamWriter(socket.getOutputStream());
        InputStreamReader isr = new InputStreamReader(socket.getInputStream());

        BufferedWriter buffOut = new BufferedWriter(osw);
        BufferedReader buffIn = new BufferedReader(isr);

        String request = "GET / HTTP/1.0\r\n\r\n";
        buffOut.write(request, 0, request.length());
        buffOut.flush();

        String line = buffIn.readLine();
        while(line != null) {
            System.out.println(line);
            line = buffIn.readLine();
        }

        buffIn.close();
        buffOut.close();
        socket.close();
    }
}