import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

/*
<applet code="KiteApplet" width="400" height="400">
</applet>
*/

public class KiteApplet extends Applet {
    public void paint(Graphics g) {
        g.setColor(Color.RED);

        g.drawLine(200, 50, 250, 150);  
        g.drawLine(250, 150, 200, 250); 
        g.drawLine(200, 250, 150, 150); 
        g.drawLine(150, 150, 200, 50); 

        g.drawLine(200, 50, 200, 250);  
        g.drawLine(150, 150, 250, 150); 

        g.drawLine(200, 250, 200, 300);
        g.drawLine(200, 300, 190, 320); 
        g.drawLine(200, 300, 210, 320);
    }
}
