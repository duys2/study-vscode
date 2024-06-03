import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpURLTest {
    public static void main(String[] args) throws Exception {
        HttpURLTest httpURLTest = new HttpURLTest();

        String site = "http://www.google.com.search?q=java";

        URL url = new URL(site);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        connection.setRequestMethod("GET");
        connection.setRequestProperty("User-Agent", "Mozillla/5.0");

        int resCode = connection.getResponseCode();

        BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String inputLine;
        StringBuffer output = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            output.append(inputLine);
        }

        in.close();

        System.out.println(output);
    }
}