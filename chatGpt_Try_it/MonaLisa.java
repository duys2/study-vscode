import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class MonaLisa {

  public static void main(String[] args) {
    try {
      // 모나리자 그림 파일을 엽니다.
      File file = new File("monalisa.jpg");
      BufferedImage image = ImageIO.read(file);

      // 이미지에서 픽셀 값을 가져와서 점을 찍습니다.
      Color color = Color.RED;
      for (int x = 130; x < 450; x += 10) {
        for (int y = 220; y < 520; y += 10) {
          // 유효하지 않은 위치에 대한 예외 처리
          if (
            x >= 0 && x < image.getWidth() && y >= 0 && y < image.getHeight()
          ) {
            if (image.getRGB(x, y) < -1000000) {
              for (int i = -1; i <= 1; i++) {
                for (int j = -1; j <= 1; j++) {
                  if (
                    x + i >= 0 &&
                    x + i < image.getWidth() &&
                    y + j >= 0 &&
                    y + j < image.getHeight()
                  ) {
                    image.setRGB(x + i, y + j, color.getRGB());
                  }
                }
              }
            }
          }
        }
      }

      // 결과 이미지를 저장합니다.
      File output = new File("monalisa_dots.jpg");
      ImageIO.write(image, "jpg", output);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}