import javax.swing.*;
import java.awt.*;

public class MoveLabel {
    public static void main(String[] args) {
        // 创建 JFrame 窗口
        JFrame frame = new JFrame("Move Label");

        // 创建 JLabel
        JLabel label = new JLabel("Label");

        // 设置标签的位置
        label.setLocation(100, 100);

        // 添加标签到窗口中
        frame.add(label);

        // 设置窗口的大小
        frame.setSize(300, 300);

        // 显示窗口
        frame.setVisible(true);

        // 为了便于演示，这里我们每隔一段时间移动标签的位置
        while (true) {
            // 移动标签到新的位置
            label.setLocation((int) (Math.random() * 200), (int) (Math.random() * 200));

            // 等待一段时间
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
