import java.awt.*;
import java.util.Scanner;
/**
 * @author (Marco Ferrante)
 * @version (2.0)
 */
public class Dragon
{
    // Instance Variables
    private int x;
    private int y;
    private int size;
    private Color c;
    private String talk;
    private boolean specialmove;

    /**
     * Default Constructor for objects of class Dragon
     */
    public Dragon()
    {
        //Initialize Instance Variables
        x = 400;
        y = 400;
        size = 2;
        c = Color.RED; //Color of Dragon
        talk = ""; //Dragon Says
        specialmove = false;
        
    }
    public Dragon(int x,int y, int size, Color c, String talk){
        this.x = x;
        this.y = y;
        this.size = size;
        this.c = c;
        this.talk = talk;
    }
        
    
    /**
     * Overloaded Constructors go here
     */

    /** 
     * Accessor Methods
     */
    public String getTalk(String talk)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("What will the Dragon say?: ");
        talk = scan.nextLine();
        return talk;
    }
    /**
     * drawDragon(Graphics g)
     */
    public void drawDragon(Graphics g, String talk)
    {
        g.setColor(c); //Color
        g.fillRect(x, y , size * 25, size * 25); //Draw Head
        g.fillOval(x, y , size * 50, size * 25); //Draw Neck
        g.fillRect(x + size * 25, y + size * 25, size * 60, size * 50); //Draw Body
        g.fillRect(x + size * 25, (y + size * 25) + size * 50, size * 10, size * 50); //Draw Leg #1
        g.fillRect(x + size * 75, (y + size * 25) + size * 50, size * 10, size * 50); //Draw Leg #2
        g.fillRect(x + size * 50, (y + size * 25) + size * 25, size * 75, size * 10); //Draw Tail
        g.drawString(talk, x, y); //Draw Text
    }
    
    /**
     * Mutator Methods
     */
    
    /**
     * toString
     */
}
