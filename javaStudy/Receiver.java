import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Receiver {
    public static void main(String[] args) throws IOException {
        byte[] buffer = new byte[256];

        DatagramSocket socket = new DatagramSocket(5000);

        DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
        socket.receive(packet);
        System.out.println(new String(buffer));
    }
}