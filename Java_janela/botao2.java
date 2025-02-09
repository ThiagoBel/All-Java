import javax.swing.*;
import java.awt.*;
public class botao2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Java");
        Button button = new Button("Aperta se gosta do Java!");
        
        button.setBounds(1, 1, 150, 50);
        
        frame.setSize(300, 200);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}