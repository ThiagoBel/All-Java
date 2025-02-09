import javax.swing.*;
import java.awt.*;

public class numeroAleatorio {
    public static void main(String[] args) {
        int numero = (int)(Math.random() * 101);

        JFrame frame = new JFrame("Java");
        Label label = new Label("" + numero);
        Font fonte = new Font("Arial", Font.BOLD, 24);

        label.setFont(fonte);

        frame.setLayout(new FlowLayout());
        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(300, 200);
    }
}
