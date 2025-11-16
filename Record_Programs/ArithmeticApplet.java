import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

/*
<applet code="ArithmeticApplet" width="400" height="300">
</applet>
*/

public class ArithmeticApplet extends Applet implements ActionListener {
    TextField num1, num2, resultField;
    Button addBtn, subBtn, mulBtn, divBtn;

    public void init() {
        num1 = new TextField(10);
        num2 = new TextField(10);
        resultField = new TextField(15);
        resultField.setEditable(false);

        addBtn = new Button("Add");
        subBtn = new Button("Subtract");
        mulBtn = new Button("Multiply");
        divBtn = new Button("Divide");

        add(new Label("Number 1:"));
        add(num1);
        add(new Label("Number 2:"));
        add(num2);

        add(addBtn);
        add(subBtn);
        add(mulBtn);
        add(divBtn);

        add(new Label("Result:"));
        add(resultField);

        addBtn.addActionListener(this);
        subBtn.addActionListener(this);
        mulBtn.addActionListener(this);
        divBtn.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            double a = Double.parseDouble(num1.getText());
            double b = Double.parseDouble(num2.getText());
            double res = 0;

            if (e.getSource() == addBtn) {
                res = a + b;
            } else if (e.getSource() == subBtn) {
                res = a - b;
            } else if (e.getSource() == mulBtn) {
                res = a * b;
            } else if (e.getSource() == divBtn) {
                res = a / b;
            }

            resultField.setText(String.valueOf(res));
        } catch (NumberFormatException ex) {
            resultField.setText("Invalid Input");
        }
    }
}
