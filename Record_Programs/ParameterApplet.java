import java.applet.Applet;
import java.awt.Graphics;

/*
<applet code="ParameterApplet" width="400" height="200">
    <param name="username" value="Ivin Titus">
</applet>
*/

public class ParameterApplet extends Applet {
    String name;

    public void init() {
        name = getParameter("username");
        if (name == null) {
            name = "No name provided";
        }
    }

    public void paint(Graphics g) {
        g.drawString("Hello, " + name + "!", 50, 100);
    }
}
