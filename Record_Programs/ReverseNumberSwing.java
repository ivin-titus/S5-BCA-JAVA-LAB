import javax.swing.*;
import java.awt.event.*;

public class ReverseNumberSwing {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Reverse Number");
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel label = new JLabel("Enter number:");
        label.setBounds(20, 20, 100, 25);
        frame.add(label);

        JTextField inputField = new JTextField();
        inputField.setBounds(130, 20, 120, 25);
        frame.add(inputField);

        JButton button = new JButton("Reverse");
        button.setBounds(90, 60, 100, 30);
        frame.add(button);

        JLabel resultLabel = new JLabel("Reversed:");
        resultLabel.setBounds(20, 100, 200, 25);
        frame.add(resultLabel);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int num = Integer.parseInt(inputField.getText());
                    int rev = 0;
                    while (num != 0) {
                        rev = rev * 10 + num % 10;
                        num /= 10;
                    }
                    resultLabel.setText("Reversed: " + rev);
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Invalid input");
                }
            }
        });

        frame.setVisible(true);
    }
}