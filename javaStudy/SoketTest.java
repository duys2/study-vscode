import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.Scanner;

public class SoketTest {
    public static void main(String[] args) throws IOException {
        try (Socket s = new Socket("time-c.nist.gov", 13)) {
            InputStream inputStream = s.getInputStream();
            Scanner in = new Scanner(inputStream);
            
            while (in.hasNextLine()) {
                String line = in.nextLine();
                System.out.println(line);
            }

            in.close();
        }
    }
}