import java.awt.*;
import java.applet.*;

public class image  extends applet {
    public void paint(Graphics g){
        g.drawOval(60, 60, 400, 400);
        g.fillOval(90, 120, 65, 65);
        g.fillOval(190, 120, 65, 65);
        g.drawLine(160, 125, 160, 125);
        g.drawArc(110, 130, 90, 90, 0, -180);
    }
    
}
