package simpleobjects;

import java.awt.Color;
import java.awt.Graphics;

public class RedDrop extends Drop{

	Color color = Color.BLUE;
	
	public RedDrop(int xpos, int ypos, int xvel, int yvel, int size){
		
		super(xpos, ypos, xvel, yvel, size);
		this.yvel=30;
	}
	
	public void draw(Graphics g){ 
		
		g.setColor(color);
		g.fillOval(xpos, ypos, size, size);
	}
}
