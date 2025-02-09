import javax.swing.*;

public class scrollPane {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Java");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextArea textArea = new JTextArea(10, 20);
        JScrollPane scrollPane = new JScrollPane(textArea);

        frame.add(scrollPane);
        frame.setVisible(true);
    }
}