import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class host2ip {

    public static void main(String[] args) throws IOException {
        String hostname = "www.naver.com";

        try {
            InetAddress addr = InetAddress.getByName(hostname);
            System.out.println("IP 주소: " + addr.getHostAddress());
        } catch (UnknownHostException e) {
            System.out.println(hostname + "의 IP 주소를 찾을 수 업습니다.");
        }
    }
}
