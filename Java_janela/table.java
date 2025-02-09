import javax.swing.*;

public class table {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Java");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String[] colunas = {"Pai", "Filho"};
        String[][] dados = {
            {"Java", "Javascript"},
            {"C", "C++"},
            {"Assembly", "Fortran"}
        };

        JTable tabela = new JTable(dados, colunas);
        JScrollPane scrollPane = new JScrollPane(tabela);
        
        frame.add(scrollPane);
        frame.setVisible(true);
    }
}
