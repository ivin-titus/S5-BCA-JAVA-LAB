import java.applet.Applet;
import java.awt.Graphics;

/*
<applet code="StarApplet" width="300" height="300">
</applet>
*/

public class StarApplet extends Applet {
    public void paint(Graphics g) {
        g.drawLine(150, 50, 190, 200);   
        g.drawLine(150, 50, 110, 200);   
        g.drawLine(110, 200, 220, 120);  
        g.drawLine(190, 200, 80, 120);   
        g.drawLine(80, 120, 220, 120);
    }
}
