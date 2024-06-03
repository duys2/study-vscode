import java.net.*;
import java.io.*;

public class URLConnectionReader {
    public static void main(String[] args) throws Exception/* 예외 던지기 */ {
        URL site = new URL("http://www.naver.com/"); // URL 클래스의 객체 생성
        URLConnection url = site.openConnection(); // 연결 객체 오픈
        BufferedReader in = new BufferedReader( // 스트림 연결
                            new InputStreamReader(
                            url.getInputStream()));

        String inLine;

        while ((inLine = in.readLine()) != null)
            System.out.println(inLine);
        in.close();
    }
}