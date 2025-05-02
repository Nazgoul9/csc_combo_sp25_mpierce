import java.awt.Color;
import java.awt.Graphics;

public class Chip{
	private final int x;
	private final int y;
	private final int size;
	private int state;
	
	
	public Chip(int x, int y, int size) {
		this.x = x;
		this.y = y;
		this.size = size;
	}
	
	public static final Color[] COLORS = {Color.white, Color.yellow, Color.red};
	
	public void draw(Graphics g)
	{
		g.setColor(Color.BLUE);
		g.fillRect(x, y, size, size);
		g.setColor(COLORS[state]);
		g.fillArc(x, y, size, size, 0, 360);;
		g.setColor(Color.LIGHT_GRAY);
		g.drawArc(x, y, size, size, 0, 360);;
	}
	
	public boolean issOff() {
		return state==0;
	}
	public boolean isP1() {
		return state==1;
	}
	public boolean isP2() {
		return state==2;
	}
	public void turnOff()
	{
		state = 0;
	}
	public void setP1()
	{
		state = 1;
	}
	public void setP2()
	{
		state = 2;
	}

}
