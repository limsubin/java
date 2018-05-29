package eunsoo;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;

public class HUD {
	private int score;

	public HUD() {
		init();
	}

	public void init() {
		score = 0;
	}

	public void draw(Graphics2D g) {
		g.setFont(new Font("Segoe Print", Font.PLAIN, 20));
		g.setColor(Color.BLACK);
		g.drawString("score : " + score, 30, 30);
	}

	public int getScore() {
		return score;
	}

	public void addScore(int scoreToAdd) {
		score += scoreToAdd;
	}
}
