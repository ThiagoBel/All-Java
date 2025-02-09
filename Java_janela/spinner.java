import javax.swing.*;

public class spinner {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Java");
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JSpinner spinner = new JSpinner(new SpinnerNumberModel(1, 0, 10, 1));
        spinner.setBounds(50, 50, 100, 30);

        frame.add(spinner);
        frame.setVisible(true);
    }
}