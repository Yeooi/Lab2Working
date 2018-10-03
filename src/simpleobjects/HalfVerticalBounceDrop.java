package simpleobjects;

public class HalfVerticalBounceDrop extends Drop {

	boolean bFalling = true;
	int heightLimit = -10;
	int heightCounter = 0;

	public HalfVerticalBounceDrop(int xpos, int ypos, int xvel, int yvel, int size) {

		super(xpos, ypos, xvel, yvel, size);
	}

	public void move(int width, int height) {
		
		if(heightLimit == -10)
		{
			heightCounter = height;
			heightLimit = height/2;
		}

		if(bFalling)
			ypos = ypos + yvel;
		else
			ypos = ypos - yvel;

		if (ypos < heightLimit && !bFalling){
			bFalling = true;
		}
		else if(ypos == height && bFalling){
			bFalling = false;
			heightCounter = heightCounter/2;
			heightLimit = height - heightCounter;
		}
	}
}
