import javax.swing.*;

public class textArea {
    public static void main(String[] args) {
        JTextArea textarea = new JTextArea("");
        JFrame frame = new JFrame("Java");

        frame.add(textarea);
        frame.setSize(300, 200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
