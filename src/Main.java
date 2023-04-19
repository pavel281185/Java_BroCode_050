
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JLabel label = new JLabel();
        ImageIcon image = new ImageIcon("logo.png");
        Border border = BorderFactory.createLineBorder(Color.green, 3);

        label.setText("Pavlíkovo tlačítko");
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(new Color(123,34,67));
        label.setFont(new Font("sans serif", Font.PLAIN, 20));
        label.setIconTextGap(-20);
        label.setBackground(Color.black );
        label.setOpaque(true);
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
//        label.setBounds(100,100,200,200);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(500,500);
        frame.setVisible(true);
        frame.add(label);
//        frame.setLayout(null);
        frame.pack();
    }
}