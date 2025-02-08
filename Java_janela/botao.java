import javax.swing.*;

public class botao {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Java");
        JButton button = new JButton("Aperta se gosta do Java!");

        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(button);
    }
}
