import javax.swing.*;

public class checkBox {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Java");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JCheckBox box = new JCheckBox("a");
        box.setBounds(50, 50, 100, 30);

        frame.add(box);
        frame.setVisible(true);
    }
}
