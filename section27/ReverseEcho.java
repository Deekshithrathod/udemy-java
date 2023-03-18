import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * ReverseEcho
 */
public class ReverseEcho {

  public static void main(String[] args) throws Exception {

    ServerSocket serverSocket = new ServerSocket(2000);

    Socket socket = serverSocket.accept();

    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
    PrintStream printStream = new PrintStream(socket.getOutputStream());

    String msg;
    StringBuffer stringBuffer;
    do {
      msg = bufferedReader.readLine();
      stringBuffer = new StringBuffer(msg);

      msg = stringBuffer.reverse().toString();
      printStream.println(msg);

    } while (!msg.equals("dne"));

    serverSocket.close();
    socket.close();
  }
}

class Client {

  public static void main(String[] args) throws Exception {

    Socket socket = new Socket("localhost", 2000);
    BufferedReader keyBoard = new BufferedReader(new InputStreamReader(System.in));

    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
    PrintStream printStream = new PrintStream(socket.getOutputStream());

    String msg;
    do {
      msg = keyBoard.readLine();
      printStream.println(msg);

      msg = bufferedReader.readLine();
      System.out.println(msg);

    } while (!msg.equals("dne"));

    socket.close();
  }
}