import javax.swing.*;

public class dialog {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Java");
        JDialog dialog = new JDialog(frame, "Java2", true);

        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
        JLabel label = new JLabel("Olá!", SwingConstants.CENTER);
        dialog.add(label);
        
        dialog.setLocationRelativeTo(frame);
        dialog.setSize(250, 250);
        dialog.setVisible(true);
    }
}