import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public class DownloadImage {
    public static void main(String[] args) throws Exception {
        String website = "https://www.oracle.com/node/oce/storyhub/prod/api/v1.1/assets/CONTDE4E2BE3985A4984A54118D32443DF2D/native/rh09v3-heungkuk-group.jpg";
        System.out.println("" + website + "사이트에서 이미지 다운로드합니다.");
        URL url = new URL(website);
        byte[] buffer = new byte[2048];
        
        try (InputStream in = url.openStream();
            OutputStream out = new FileOutputStream("test.jpg");) {
            int length = 0;
            
            // 버퍼가 2048 바이트로 한정되어 있으므로 읽기를 되풀이한다.
            while ((length = in.read(buffer)) != -1) {
                System.out.println("" + length + "바이트만큼 읽었음!");
                out.write(buffer, 0, length);
            }

        } catch (Exception e) {
            System.err.println("예외: " + e.getMessage());
        }
    }
}