import javax.swing.*;
import java.awt.*;

public class FundoCor {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Java");

        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.ORANGE);
        frame.setVisible(true);
    }
}
