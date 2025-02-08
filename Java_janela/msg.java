import javax.swing.*;

public class msg {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Bem-Vindo!");

        JFrame frame = new JFrame("Java");

        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}