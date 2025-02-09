import javax.swing.*;

public class botao1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Java");
        JButton button = new JButton("Aperta se gosta do Java!");
        button.setBounds(1, 1, 200, 50);
        
        frame.add(button);
        frame.setSize(300, 200);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
