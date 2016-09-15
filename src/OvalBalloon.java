import java.awt.Color;
import java.awt.Graphics;
public class OvalBalloon extends Balloon{

	public OvalBalloon() {
		
	}
	public OvalBalloon(int x, int y, int r, Color c){
		super(x, y, r ,c);
	}
	public void draw(Graphics g, boolean makeItFilled)
	  {
		int xCenter = getX();
		int yCenter = getY();
		int radius = getRadius();
		
	    g.setColor(getColor());
	    if (makeItFilled)
	      g.fillOval(xCenter - radius,
	                 yCenter - radius, radius, 2*radius);
	    else
	      g.drawOval(xCenter - radius,
	                 yCenter - radius, radius, 2*radius);
	  }
}