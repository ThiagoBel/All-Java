import javax.swing.*;
import java.awt.*;

public class contador {
    public static void main(String[] args) {
        int[] cont = {0};
        
        JFrame frame = new JFrame("Java");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton plus = new JButton("+");
        JButton minus = new JButton("-");
        JLabel contador = new JLabel("" + cont[0]);
        
        plus.addActionListener(_ -> {
            cont[0] = cont[0] + 1;
            contador.setText("" + cont[0]);
        });
        
        minus.addActionListener(_ -> {
            cont[0] = cont[0] - 1;
            contador.setText("" + cont[0]);
        });

        frame.setLayout(new FlowLayout());
        
        frame.add(contador);
        frame.add(plus);
        frame.add(minus);

        // Tornando o frame visível
        frame.setVisible(true);
    }
}
