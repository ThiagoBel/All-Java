import javax.swing.*;

public class passwordField {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Java");
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JPasswordField senha = new JPasswordField();
        senha.setBounds(50, 50, 150, 30);

        frame.add(senha);
        frame.setVisible(true);
    }
}
