import java.applet.Applet;
import java.awt.*;
 
/*
<applet code="TrafficLightApplet" width="200" height="400">
</applet>
*/

public class TrafficLightApplet extends Applet implements Runnable {
    Color redColor = Color.GRAY;
    Color yellowColor = Color.GRAY;
    Color greenColor = Color.GRAY;
    Thread t;

    public void init() {
        t = new Thread(this);
        t.start();
    }

    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(50, 50, 100, 300);

        g.setColor(redColor);
        g.fillOval(75, 70, 50, 50);

        g.setColor(yellowColor);
        g.fillOval(75, 150, 50, 50);

        g.setColor(greenColor);
        g.fillOval(75, 230, 50, 50);
    }

    public void run() {
        while (true) {
            redColor = Color.RED;
            yellowColor = Color.GRAY;
            greenColor = Color.GRAY;
            repaint();
            try { Thread.sleep(3000); } catch (InterruptedException e) {}

            redColor = Color.GRAY;
            yellowColor = Color.YELLOW;
            greenColor = Color.GRAY;
            repaint();
            try { Thread.sleep(1000); } catch (InterruptedException e) {}

            redColor = Color.GRAY;
            yellowColor = Color.GRAY;
            greenColor = Color.GREEN;
            repaint();
            try { Thread.sleep(3000); } catch (InterruptedException e) {}
        }
    }
}
