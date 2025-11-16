import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

/*
<applet code="CircleAreaApplet" width="400" height="200">
</applet>
*/

public class CircleAreaApplet extends Applet implements ActionListener {
    TextField radiusField, resultField;
    Button calcButton;

    public void init() {
        add(new Label("Enter radius:"));
        radiusField = new TextField(10);
        add(radiusField);

        calcButton = new Button("Calculate Area");
        add(calcButton);

        add(new Label("Area:"));
        resultField = new TextField(15);
        resultField.setEditable(false);
        add(resultField);

        calcButton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            double r = Double.parseDouble(radiusField.getText());
            double area = Math.PI * r * r;
            resultField.setText(String.format("%.2f", area));
        } catch (NumberFormatException ex) {
            resultField.setText("Invalid Input");
        }
    }
}
