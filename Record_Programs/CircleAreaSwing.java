import javax.swing.*;
import java.awt.event.*;

public class CircleAreaSwing {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Circle Area Calculator");
        frame.setSize(350, 200);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel radiusLabel = new JLabel("Radius:");
        radiusLabel.setBounds(20, 20, 100, 25);
        frame.add(radiusLabel);

        JTextField radiusField = new JTextField();
        radiusField.setBounds(120, 20, 150, 25);
        frame.add(radiusField);

        JButton calcButton = new JButton("Calculate Area");
        calcButton.setBounds(100, 60, 150, 30);
        frame.add(calcButton);

        JLabel resultLabel = new JLabel("Area: ");
        resultLabel.setBounds(20, 100, 300, 25);
        frame.add(resultLabel);

        calcButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double r = Double.parseDouble(radiusField.getText());
                    double area = Math.PI * r * r;
                    resultLabel.setText("Area: " + String.format("%.2f", area));
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Invalid Input");
                }
            }
        });

        frame.setVisible(true);
    }
}
