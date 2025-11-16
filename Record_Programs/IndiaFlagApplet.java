import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

/*
<applet code="IndiaFlagApplet" width="400" height="300">
</applet>
*/

public class IndiaFlagApplet extends Applet {
    public void paint(Graphics g) {
        g.setColor(new Color(255, 153, 51));  
        g.fillRect(50, 50, 300, 50);

        g.setColor(Color.WHITE);
        g.fillRect(50, 100, 300, 50);

        g.setColor(new Color(19, 136, 8));  
        g.fillRect(50, 150, 300, 50);

        g.setColor(new Color(0, 0, 128)); 
        g.fillOval(180, 110, 40, 40); 
    }
}
