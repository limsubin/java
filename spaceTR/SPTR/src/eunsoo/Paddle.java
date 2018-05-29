package eunsoo;

import java.awt.*;

import javax.swing.*;

public class Paddle {

	private double x;
	private int width, height, startWidth;

	private long widthTimer;
	private boolean altWidth;

	public final int YPOS = 500 - 100; // Bar 높이

	public Paddle(int theWidth, int theHeight) {
		width = 100;
		startWidth = theWidth;
		height = 20;
		x = 700 / 2 - width / 2;
	}

	public void update() {
		if (System.nanoTime() - widthTimer / 1000 > 4000000) {
			width = startWidth;
			altWidth = false;
		}
	}

	public void draw(Graphics2D g) {
		g.setColor(Color.DARK_GRAY);
		g.fillRect((int) x, YPOS, width, height);
	}

	// 마우스 바 움직임
	public void mouseMoved(int mouseXPos) {
		x = mouseXPos;

		if (x > 700 - width) {
			x = 700 - width;
		}
	}

	public Rectangle getRect() {
		return new Rectangle((int) x, YPOS, width, height);
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int newWidth) {
		altWidth = true;
		width = newWidth;
		setWidthTimer();
	}

	public void setWidthTimer() {
		widthTimer = System.nanoTime();
	}
}
