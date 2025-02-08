import javax.swing.*;

public class input {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite o seu nome: ");

        JFrame frame = new JFrame("Java");
        JLabel label = new JLabel("Olá " + nome + "!", SwingConstants.CENTER);
        
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(label);
    }
}