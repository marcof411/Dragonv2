import java.awt.*;
/**
 *
 * @author (Marco Ferrante)
 * @version (2.0)
 */
public class TestClass
{
   public static void main(String args[]){
       DrawingPanel panel = new DrawingPanel(800,800);
       Graphics g = panel.getGraphics();
       
       Dragon d = new Dragon();
       String talk = "";
       d.drawDragon(g, talk);
    }
}
