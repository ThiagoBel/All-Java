import javax.swing.*;

public class list {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Java");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String[] itens = {"Java", "Javascript", "C", "C++"};
        JList<String> lista = new JList<>(itens);
        JScrollPane scroll = new JScrollPane(lista);
        
        frame.add(scroll);
        frame.setVisible(true);
    }
}
