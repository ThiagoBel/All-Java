import javax.swing.*;
import java.awt.*;

public class fonte {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Java");
        JLabel label = new JLabel("Eu gosto bastante de Java!");
        Font fonte = new Font("Arial", Font.BOLD, 24);

        label.setFont(fonte);

        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);;
        frame.setVisible(true);
        frame.setSize(500, 600);
    }
}
