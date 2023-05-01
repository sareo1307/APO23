import java.awt.*;
import java.applet.*;

public class Punto1 extends Applet {
    Font font;
    Color blackColor;
    Color whiteColor;
    Color grayColor;
    
public void init() {
    
    font = new Font("Arial", Font.ITALIC, 18);
     
    blackColor = new Color(0, 0, 0);   
    whiteColor = new Color(255, 255, 255);    
    grayColor = new Color(128, 128, 128);    
        
    
    setBackground(grayColor);
   }
    
public void stop() {
   }
 
public void paint(Graphics graph) {
   
   graph.setFont(font);

   graph.drawString("Draw Shapes", 90, 20);
 
   graph.setColor(blackColor);

   graph.drawRect(120, 120, 120, 120);

   graph.fillRect(115, 115, 90, 90);
        
   graph.setColor(whiteColor);
        
   graph.fillArc(110, 110, 50, 50, 0, 360);
        
   graph.setColor(grayColor);
        
   graph.drawRect(50, 50, 50, 50);
        
   graph.fillRect(50, 50, 60, 60);
  }
}
