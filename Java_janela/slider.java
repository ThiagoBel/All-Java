import javax.swing.*;

public class slider {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Java");
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JSlider slider = new JSlider(0, 100, 50);
        slider.setBounds(50, 50, 200, 30);

        frame.add(slider);
        frame.setVisible(true);
    }
}