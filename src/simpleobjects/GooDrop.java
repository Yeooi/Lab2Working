package simpleobjects;

import goo.Goo; // A
import java.awt.Graphics;

public class GooDrop extends Goo { // B

	SimpleDrop[] multiDrops;
	RedDrop redDrop;
	WobblyDrop wobblyDrop;
	WobblyUp wobblyUpDrop;
	VerticalBounceDrop vbDrop;
	HalfVerticalBounceDrop hvbDrop;
	// SimpleDrop drop;

	public GooDrop(int width, int height, int numDrops) { // C

		super(width, height);

		// multiDrops = new SimpleDrop[numDrops];
		// for(int i = 0; i < numDrops ;i++)
		// {
		// 	int xpos = (int) (Math.random() * width) + 1;
		// 	int ypos = 0;
		// 	int xvel = (int) (Math.random() * 10) + 1;
		// 	int yvel = (int) (Math.random() * 10) + 1;
		// 	int size = (int) (Math.random() * 20) + 10;
		// 	multiDrops[i] = new SimpleDrop(xpos, ypos, xvel, yvel, size);
		// }

		redDrop = new RedDrop(0, 0, 0, 5, 20);
		wobblyDrop = new WobblyDrop(400,0,  0,  5, 20);
		wobblyUpDrop = new WobblyUp(200, 500, 0, 5, 20);
		vbDrop = new VerticalBounceDrop(300, 0, 0, 20, 20);
		hvbDrop = new HalfVerticalBounceDrop (100, 0, 10, 20, 20);
	}

	public void draw(Graphics g) { // D

		// for(SimpleDrop drop : multiDrops)
		// {
			// if(drop.CheckCollision(multiDrops))
			// {
			// 	drop.red = (int) (Math.random() * 255);
			// 	drop.green = (int) (Math.random() * 255);
			// 	drop.blue = (int) (Math.random() * 255);
			// }
		// 	drop.move(getWidth(), getHeight());
		// 	drop.draw(g);
		// }

		redDrop.draw(g);

		wobblyDrop.move(getWidth(),getHeight());
		wobblyDrop.draw(g);

		wobblyUpDrop.move(getWidth(), getHeight());
		wobblyUpDrop.draw(g);

		vbDrop.move(getWidth(), getHeight());
		vbDrop.draw(g);

		hvbDrop.move(getWidth(), getHeight());
		hvbDrop.draw(g);
	}
}
