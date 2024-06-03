import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MonalisaDotDrawing extends JPanel {
    private BufferedImage monalisa;

    public MonalisaDotDrawing() {
        try {
            // 이미지 파일을 로드합니다.
            monalisa = ImageIO.read(new File("monalisa.jpg"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // 모나리자 이미지를 그립니다.
        g.drawImage(monalisa, 0, 0, null);

        // 점을 찍습니다.
        g.setColor(Color.RED);
        // 점의 크기와 간격을 조절하면서 모나리자 윤곽선을 따라 점을 찍습니다.
        for (int x = 130; x < 450; x += 10) {
            for (int y = 220; y < 520; y += 10) {
                // 모나리자 윤곽선 위에 있는 점만 그립니다.
                if (isOnOutline(x, y)) {
                    g.fillOval(x, y, 2, 2);
                }
            }
        }
    }

    // 주어진 좌표가 모나리자 윤곽선 위에 있는지 검사합니다.
    private boolean isOnOutline(int x, int y) {
        // 모나리자 윤곽선 색상을 검사합니다.
        int rgb = monalisa.getRGB(x, y);
        Color color = new Color(rgb);
        int red = color.getRed();
        int green = color.getGreen();
        int blue = color.getBlue();
        // 모나리자 윤곽선 색상이 검정색에 가까운지 검사합니다.
        return red < 30 && green < 30 && blue < 30;
    }

    public static void main(String[] args) {
        // JFrame을 만들고 JPanel을 추가합니다.
        JFrame frame = new JFrame("Monalisa Dot Drawing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 800);
        MonalisaDotDrawing panel = new MonalisaDotDrawing();
        frame.add(panel);
        frame.setVisible(true);
    }
}