import java.awt.Color;
import java.awt.Graphics;
public class SquareBalloon extends Balloon{
	
	public SquareBalloon(){
		super();
	}
	public SquareBalloon(int x, int y, int r, Color c){
		super(x, y, r, c);
	}
	public void draw(Graphics g, boolean makeItFilled)
	  {
		int xCenter = getX();
		int yCenter = getY();
		int radius = getRadius();
	    g.setColor(getColor());
	    if (makeItFilled)
	      g.fillOval(xCenter - radius,
	                 yCenter - radius, 2*radius, 2*radius);
	    else
	      g.drawOval(xCenter - radius,
	                 yCenter - radius, 2*radius, 2*radius);
	  }
	}