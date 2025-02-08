import javax.swing.*;

public class texto {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Java");

        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Eu amo Java!", SwingConstants.CENTER);
        frame.add(label);

        frame.setVisible(true);
    }
}