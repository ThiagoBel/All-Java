import javax.swing.*;

public class progressBar {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Java");
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JProgressBar progressBar = new JProgressBar(0, 100);
        progressBar.setBounds(50, 50, 200, 30);
        progressBar.setValue(50);

        frame.add(progressBar);
        frame.setVisible(true);
    }
}