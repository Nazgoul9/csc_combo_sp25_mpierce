package komigameoflife;

import java.awt.Color;
import java.awt.Graphics;

public class Cell {
	
	private final int x;
	private final int y;
	private final int size;
	private int state;
	
	
	public Cell(int x, int y, int size) {
		this.x = x;
		this.y = y;
		this.size = size;
	}
	
	public static final Color[] COLORS = {Color.white, Color.black};
	
	public void draw(Graphics g)
	{
		g.setColor(COLORS[state]);
		g.fillRect(x+1, y+1, size-1, size-1);
		g.setColor(Color.LIGHT_GRAY);
		g.drawRect(x, y, size, size);
	}
	
	public boolean issOff() {
		return state==0;
	}
	public boolean issOn() {
		return state==1;
	}
	public void turnOff()
	{
		state = 0;
	}
	public void turnOn()
	{
		state = 1;
	}
	
	
	}
	
	
	
	


