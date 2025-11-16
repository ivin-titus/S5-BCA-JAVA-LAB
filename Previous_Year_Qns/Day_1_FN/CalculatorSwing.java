/* 
QP CODE: S508FN01

1. Write a program using Swing to accept values in two textboxes and display the results
of mathematical operations in the third text box. Use four buttons add, subtract,
multiply, and divide.
*/ 

import javax.swing.*;
import java.awt.event.*; 

public class CalculatorSwing { 
    public static void main(String[] args) { 
        JFrame frame = new JFrame("Calculator"); 
        frame.setSize(350, 250);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel l1 = new JLabel("Number 1:"); 
        l1.setBounds(20, 20, 100, 25);
        frame.add(l1);

        JTextField t1 = new JTextField();
        t1.setBounds(120, 20, 150, 25);
        frame.add(t1);

        JLabel l2 = new JLabel("Number 2:");
        l2.setBounds(20, 60, 100, 25);
        frame.add(l2);

        JTextField t2 = new JTextField();
        t2.setBounds(120, 60, 150, 25);
        frame.add(t2);

        JLabel l3 = new JLabel("Result:");
        l3.setBounds(20, 160, 100, 25);
        frame.add(l3);

        JTextField result = new JTextField();
        result.setBounds(120, 160, 150, 25);
        result.setEditable(false);
        frame.add(result);

        JButton add = new JButton("Add");
        add.setBounds(20, 110, 70, 30);
        frame.add(add);

        JButton sub = new JButton("Sub");
        sub.setBounds(100, 110, 70, 30);
        frame.add(sub);

        JButton mul = new JButton("Mul");
        mul.setBounds(180, 110, 70, 30);
        frame.add(mul);

        JButton div = new JButton("Div");
        div.setBounds(260, 110, 70, 30);
        frame.add(div);

        ActionListener action = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double n1 = Double.parseDouble(t1.getText());
                    double n2 = Double.parseDouble(t2.getText());
                    double r = 0;

                    if (e.getSource() == add) r = n1 + n2;
                    else if (e.getSource() == sub) r = n1 - n2;
                    else if (e.getSource() == mul) r = n1 * n2;
                    else if (e.getSource() == div) r = n1 / n2;

                    result.setText("" + r);
                } catch (Exception ex) {
                    result.setText("Invalid Input");
                }
            }
        };

        add.addActionListener(action);
        sub.addActionListener(action);
        mul.addActionListener(action);
        div.addActionListener(action);

        frame.setVisible(true);
    }
}
