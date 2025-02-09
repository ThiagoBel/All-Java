import javax.swing.*;

public class comboBox {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Java");
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        String[] opcoes = {"Java", "Javascript", "C++"};
        JComboBox<String> comboBox = new JComboBox<>(opcoes);
        comboBox.setBounds(50, 50, 150, 30);

        frame.add(comboBox);
        frame.setVisible(true);
    }
}
