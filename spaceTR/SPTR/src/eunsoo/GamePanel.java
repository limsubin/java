package eunsoo;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.util.*;

import javax.swing.*;
import javax.swing.border.*;

public class GamePanel extends JPanel implements Runnable {

	// Fields
	private boolean running;
	private BufferedImage image;
	private Graphics2D g;
	private MouseMotionListener theMouseListener;
	private int mousex;

	// entities
	private Ball theBall;
	private Paddle thePaddle;
	private Map theMap;
	private HUD theHud;
	private ArrayList<PowerUp> powerUps;
	private ArrayList<BrickSplosion> brickSplosions;

	/**
	 * Create the frame.
	 */
	public GamePanel() {

		init();
	} // MemberShip_App(생성자) of end

	public void init() {
		mousex = 0;
		theBall = new Ball();
		thePaddle = new Paddle(100, 20);
		theMap = new Map(6, 10);
		theHud = new HUD();
		theMouseListener = new MyMouseMotionListener();
		powerUps = new ArrayList<PowerUp>();
		brickSplosions = new ArrayList<BrickSplosion>();
		addMouseMotionListener(theMouseListener);

		running = true;
		image = new BufferedImage(700, 500, BufferedImage.TYPE_INT_BGR);
		g = (Graphics2D) image.getGraphics();

		//Ball의 윤관석 보정기능
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
	}// init of end

	@Override
	public void run() {
		while (running) {
			update();
			draw();
			repaint();
			
			//ball and block의 떨어지는 speed
			try {
				Thread.sleep(10);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public void checkCollisions() {
		Rectangle ballRect = theBall.getRect();
		Rectangle paddleRect = thePaddle.getRect();

		for (int i = 0; i < powerUps.size(); i++) {
			Rectangle puRect = powerUps.get(i).getRect();
			if (paddleRect.intersects(puRect)) {
				if (powerUps.get(i).getType() == PowerUp.WIDEPADDLE && !powerUps.get(i).getWasUsed()) {
					thePaddle.setWidth(thePaddle.getWidth() * 2);
					thePaddle.setWidthTimer();
					powerUps.get(i).setWasUsed(true);
				}
			}
		}

		if (ballRect.intersects(paddleRect)) {
			theBall.setDY(-theBall.getDY());
			if (theBall.getX() < mousex + thePaddle.getWidth() / 4) {
				theBall.setDX(theBall.getDX() - .5);
			}
			if (theBall.getX() < mousex + thePaddle.getWidth() && theBall.getX() > mousex + thePaddle.getWidth() / 4) {
				theBall.setDX(theBall.getDX() - .5);
			}
		}

		int[][] theMapArray = theMap.getMapArray();
		A: for (int row = 0; row < theMap.getMapArray().length; row++) {
			for (int col = 0; col < theMap.getMapArray()[0].length; col++) {
				if (theMap.getMapArray()[row][col] > 0) {
					int brickx = col * theMap.getBrickWidth() + theMap.HOR_PAD;
					int bricky = row * theMap.getBrickHeight() + theMap.VERT_PAD;
					int brickWidth = theMap.getBrickWidth();
					int brickHeight = theMap.getBrickHeight();

					Rectangle brickRect = new Rectangle(brickx, bricky, brickWidth, brickHeight);

					if (ballRect.intersects(brickRect)) {

						if (theMap.getMapArray()[row][col] == 1) {
							brickSplosions.add(new BrickSplosion(brickx, bricky, theMap));
						}
						if (theMap.getMapArray()[row][col] > 3) {
							powerUps.add(new PowerUp(brickx, bricky, theMap.getMapArray()[row][col], brickWidth,
									brickHeight));
							theMap.setBrick(row, col, 3);
						} else {
							theMap.hitBrick(row, col);
						}

						if (ballRect.intersects(brickRect))
							theMap.hitBrick(row, col);
						theBall.setDY(-theBall.getDY());
						theHud.addScore(50);
						break A;
					}
				}

			}
		}
	}

	public void update() {
		checkCollisions();
		theBall.update();
		thePaddle.update();

		for (PowerUp pu : powerUps) {
			pu.update();
		}
		for (int i = 0; i < brickSplosions.size(); i++) {
			brickSplosions.get(i).update();
			if (!brickSplosions.get(i).getIsActive()) {
				brickSplosions.remove(i);
			}
		}
	} // update of end

	public void draw() {
		// draw background
		g.setColor(new Color(250, 236, 197));
		g.fillRect(0, 0, 700, 500);

		theMap.draw(g);

		theBall.draw(g);

		thePaddle.draw(g);

		theHud.draw(g);

		drawPowerUps();

		if (theMap.isThereAWin() == true) {
			drawWin();
			running = false;
		}

		if (theBall.youLose()) {
			drawLoser();
			running = false;
		}
		for (BrickSplosion bs : brickSplosions) {
			bs.draw(g);
		}
	} // draw of end

	public void drawWin() {
		g.setColor(new Color(0, 0, 117));
		g.setFont(new Font("Segoe Print", Font.BOLD, 50));
		g.drawString("Winner!!", 280, 200);
	}

	public void drawPowerUps() {
		for (PowerUp pu : powerUps) {
			pu.draw(g);
		}
	}

	public void drawLoser() {
		g.setColor(new Color(0, 0, 117));
		g.setFont(new Font("Segoe Print", Font.BOLD, 50));
		g.drawString("Loser!!", 280, 200);
	}

	// background
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		g2.drawImage(image, 0, 0, 700, 500, null);
		g2.dispose();
	}

	// 바 움직임
	private class MyMouseMotionListener implements MouseMotionListener {

		@Override
		public void mouseDragged(MouseEvent arg0) {
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			mousex = e.getX();
			thePaddle.mouseMoved(e.getX());
		}

	}
} // class of end
