import javax.swing.*;

public class botoes1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Java");
        frame.setSize(300, 200);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JButton btn1 = new JButton("Botão 1");
        btn1.setBounds(10, 50, 80, 30);
        frame.add(btn1);
        
        JButton btn2 = new JButton("Botão 2");
        btn2.setBounds(100, 50, 80, 30);
        frame.add(btn2);
        
        JButton btn3 = new JButton("Botão 3");
        btn3.setBounds(190, 50, 80, 30);
        frame.add(btn3);
        
        frame.setVisible(true);
    }
}