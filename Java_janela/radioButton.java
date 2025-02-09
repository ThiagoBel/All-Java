import javax.swing.*;

public class radioButton {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Java");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JRadioButton opcao1 = new JRadioButton("Java");
        JRadioButton opcao2 = new JRadioButton("Javascript");
        opcao1.setBounds(50, 50, 100, 30);
        opcao2.setBounds(50, 80, 100, 30);

        ButtonGroup grupo = new ButtonGroup(); // Para agrupar os botões
        grupo.add(opcao1);
        grupo.add(opcao2);

        frame.add(opcao1);
        frame.add(opcao2);
        frame.setVisible(true);
    }
}
