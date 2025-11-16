import javax.swing.*;
import java.awt.event.*;

public class SimpleInterestSwing {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Interest Calculator");
        frame.setSize(350, 250);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel pLabel = new JLabel("Principal (P):");
        pLabel.setBounds(20, 20, 100, 25);
        frame.add(pLabel);

        JTextField pField = new JTextField();
        pField.setBounds(130, 20, 150, 25);
        frame.add(pField);

        JLabel rLabel = new JLabel("Rate (%) :");
        rLabel.setBounds(20, 60, 100, 25);
        frame.add(rLabel);

        JTextField rField = new JTextField();
        rField.setBounds(130, 60, 150, 25);
        frame.add(rField);

        JLabel tLabel = new JLabel("Time (years):");
        tLabel.setBounds(20, 100, 100, 25);
        frame.add(tLabel);

        JTextField tField = new JTextField();
        tField.setBounds(130, 100, 150, 25);
        frame.add(tField);

        JButton calcButton = new JButton("Calculate SI");
        calcButton.setBounds(100, 140, 120, 30);
        frame.add(calcButton);

        JLabel resultLabel = new JLabel("Simple Interest: ");
        resultLabel.setBounds(20, 180, 300, 25);
        frame.add(resultLabel);

        calcButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double p = Double.parseDouble(pField.getText());
                    double r = Double.parseDouble(rField.getText());
                    double t = Double.parseDouble(tField.getText());

                    double si = (p * r * t) / 100;
                    resultLabel.setText("Simple Interest: " + si);
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Invalid Input");
                }
            }
        });

        frame.setVisible(true);
    }
}
