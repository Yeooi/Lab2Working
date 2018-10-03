package simpleobjects;

public class VerticalBounceDrop extends Drop {

	boolean bFalling = true;

	public VerticalBounceDrop(int xpos, int ypos, int xvel, int yvel, int size) {

		super(xpos, ypos, xvel, yvel, size);
	}

	public void move(int width, int height) {

		if(bFalling)
			ypos = ypos + yvel;
		else
			ypos = ypos - yvel;

		if (ypos == 0)
			bFalling = true;
		else if(ypos == height)
			bFalling = false;
	}
}
