import javax.swing.*;
import java.awt.event.*;

public class SimpleCalculatorSwing {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Calculator");
        frame.setSize(350, 300);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel num1Label = new JLabel("Number 1:");
        num1Label.setBounds(20, 20, 100, 25);
        frame.add(num1Label);

        JTextField num1Field = new JTextField();
        num1Field.setBounds(120, 20, 150, 25);
        frame.add(num1Field);

        JLabel num2Label = new JLabel("Number 2:");
        num2Label.setBounds(20, 60, 100, 25);
        frame.add(num2Label);

        JTextField num2Field = new JTextField();
        num2Field.setBounds(120, 60, 150, 25);
        frame.add(num2Field);

        JButton addBtn = new JButton("Add");
        addBtn.setBounds(20, 100, 80, 30);
        frame.add(addBtn);

        JButton subBtn = new JButton("Subtract");
        subBtn.setBounds(110, 100, 100, 30);
        frame.add(subBtn);

        JButton mulBtn = new JButton("Multiply");
        mulBtn.setBounds(220, 100, 100, 30);
        frame.add(mulBtn);

        JButton divBtn = new JButton("Divide");
        divBtn.setBounds(20, 140, 80, 30);
        frame.add(divBtn);

        JLabel resultLabel = new JLabel("Result: ");
        resultLabel.setBounds(20, 200, 300, 25);
        frame.add(resultLabel);

        ActionListener action = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double n1 = Double.parseDouble(num1Field.getText());
                    double n2 = Double.parseDouble(num2Field.getText());
                    double res = 0;

                    if (e.getSource() == addBtn) res = n1 + n2;
                    else if (e.getSource() == subBtn) res = n1 - n2;
                    else if (e.getSource() == mulBtn) res = n1 * n2;
                    else if (e.getSource() == divBtn) res = n1 / n2;

                    resultLabel.setText("Result: " + res);
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Invalid Input");
                }
            }
        };

        addBtn.addActionListener(action);
        subBtn.addActionListener(action);
        mulBtn.addActionListener(action);
        divBtn.addActionListener(action);

        frame.setVisible(true);
    }
}