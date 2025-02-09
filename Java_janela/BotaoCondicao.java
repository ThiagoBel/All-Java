import javax.swing.*;

public class BotaoCondicao {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Java");
        JButton button = new JButton("Clique se gosta do Java");
        button.addActionListener(_ -> System.out.println("Que bom"));

        frame.add(button);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}