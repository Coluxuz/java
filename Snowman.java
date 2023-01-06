import javax.swing.*;
import java.awt.*;

public class Snowman extends JApplet {
    public void init(){
        getContentPane().setBackground(Color.BLACK);
    }
    public void paint(Graphics page){
        final int mid = 150;
        final int top = 50;
        super.paint(page);
        setBackground(Color.cyan);

        page.setColor(Color.BLUE);
        page.fillRect(0,175,300,50);

        page.setColor(Color.ORANGE);
        page.fillRect(-40,-40,80,80);

        page.setColor(Color.white);
        page.fillOval(mid-20,top,40,40);
        page.fillOval(mid-35,top+35,70,50);
        page.fillOval(mid-50,top+80,100,60);

        page.setColor(Color.BLACK);
        page.fillOval(mid-10,top+10,5,5);
        page.fillOval(mid+5,top+10,5,5);

        page.drawArc(mid-10,top+20,20,10,190,160);
        page.drawLine(mid-25,top+60,mid-50,top+40);
        page.drawLine(mid+25,top+5,mid+50,top+60);

        page.drawLine(mid-20,top+5,mid+20,top+5);
        page.fillRect(mid-15,top-20,30,25);
    }
}
