import java.awt.Color;
import java.awt.Graphics;
public class SquareBalloon extends Balloon{
	
	public SquareBalloon(){
		super();
	}
	public SquareBalloon(int x, int y, int r, Color c){
		super(x, y, r, c);
	}
	  public double distance(int x, int y)
	  {
	    double dx = x - getX();
	    double dy = y - getY();
	    return Math.sqrt(dx*dx + dy*dy);
	  }
	public void draw(Graphics g, boolean makeItFilled)
	  {	
		int xCenter = getX();
		int yCenter = getY();
		int radius = getRadius();
	    g.setColor(getColor());
	    if (makeItFilled)
	      g.fillRect(xCenter - radius,
	                 yCenter - radius, radius, radius);
	    else
	      g.drawRect(xCenter - radius,
	                 yCenter - radius, radius, radius);
	  }
	}