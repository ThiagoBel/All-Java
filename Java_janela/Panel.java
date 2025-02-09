import javax.swing.*;
import java.awt.*;

public class Panel {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Java");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel();
        panel.setBackground(Color.LIGHT_GRAY);
        
        panel.add(new JLabel("Dentro do panel"));
        panel.add(new JTextField(10));
        
        frame.add(panel);
        frame.setVisible(true);
    }
}
