import javax.swing.*;
import java.awt.*;

public class botoes2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Java");
        frame.setSize(300, 200);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Button btn1 = new Button("Botão 1");
        btn1.setBounds(10, 50, 80, 30);
        frame.add(btn1);
        
        Button btn2 = new Button("Botão 2");
        btn2.setBounds(100, 50, 80, 30);
        frame.add(btn2);
        
        Button btn3 = new Button("Botão 3");
        btn3.setBounds(190, 50, 80, 30);
        frame.add(btn3);
        
        frame.setVisible(true);
    }
}