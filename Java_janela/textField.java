import javax.swing.*;

public class textField {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Java");
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JTextField textField = new JTextField();
        textField.setBounds(50, 50, 200, 30);
        
        frame.add(textField);
        frame.setVisible(true);
    }
}
