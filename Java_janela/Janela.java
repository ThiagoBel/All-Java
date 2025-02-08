import javax.swing.*;

public class Janela {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Janela do Java");

        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}