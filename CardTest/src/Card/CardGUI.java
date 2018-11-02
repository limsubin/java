package Card;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class CardGUI extends JFrame {
	String[] image = { "img/1.jpg", "img/2.jpg", "img/3.jpg", "img/4.jpg", "img/5.jpg", "img/6.jpg", "img/1.jpg",
			"img/2.jpg", "img/3.jpg", "img/4.jpg", "img/5.jpg", "img/6.jpg" };

	int[][] randInt = { { 8, 11, 0, 1, 9, 4, 7, 10, 5, 3, 6, 2 }, { 4, 0, 1, 3, 11, 10, 9, 6, 5, 7, 2, 8 },
			{ 6, 4, 8, 9, 1, 7, 10, 5, 2, 0, 3, 11 }, { 3, 11, 2, 7, 10, 1, 4, 0, 9, 6, 5, 8 },
			{ 5, 4, 2, 6, 3, 0, 10, 7, 1, 9, 11, 8 }, { 5, 8, 2, 7, 10, 4, 3, 0, 6, 11, 1, 9 } };

	int c = 0;// 카드 뒤집은 숫자 비교를 위한 것
	JPanel panel, panel2, panel3, Card_panel;
	JButton[] button;
	JLabel label;
	ImageIcon[] img = new ImageIcon[10];
	ImageIcon imagcard2;
	int[] card = new int[2];
	int[] Stringcard = new int[2];
	// 새롭게 추가한 것
	int count = 0;
	int GameCount = 0;
	int removeCount = 0;
	ImageIcon blank, imgDefault;
	int tmp[] = { 100, 200 };
	long lastTime;

	Random r = new Random();

	public CardGUI() {
		int[] Imagerandom;
		
		this.setVisible(false);

		
		this.setBounds(50, 50, 1024, 640);
		this.setResizable(false);
		this.setVisible(true);

		panel2 = new JPanel();

		this.setTitle("같은 카드 찾기");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		panel2 = new JPanel() {
			ImageIcon i = new ImageIcon("img/Background.jpg");

			public void paintComponent(Graphics g) {
				g.drawImage(i.getImage(), 0, 0, 500, 540, null);
			}
		};

		button = new JButton[12];
		int index = 0;

		// 새롭게 추가 한것

		Card_panel = new JPanel();
		Card_panel.setLayout(new GridLayout(4, 5));
		Card_panel.setFont(new Font("Dialog plain", 0, 12));
		Card_panel.setBounds(15, 15, 360, 480);

		imgDefault = new ImageIcon("img/CardBack.jpg");
		blank = new ImageIcon("img/blank.jpg");
		int rnk = r.nextInt(5);

		for (int a = 0; a < button.length; a++) {// 열(가로)
			button[a] = new JButton(Integer.toString(a));// 카드 뒷면
			button[a].setBackground(Color.WHITE);
			button[a].setIcon(imgDefault);
			button[a].setMargin(new Insets(0, 0, 0, 0));
			button[a].setFocusPainted(false);
			button[a].setForeground(Color.WHITE);
			button[a].setContentAreaFilled(false);
			button[a].addActionListener((ActionListener) new MyFrame());// 이벤트 리스너 등록
		}

		// 랜덤한 카드 배치
		for (int i = 0; i < 12; i++) {
			Card_panel.add(button[randInt[rnk][i]]);
		}

		// 이미지 아이콘 생성
		for (int i = 0; i < img.length; i++) {
			img[i] = new ImageIcon(image[i]);
			
		}
		panel2.add(Card_panel);
		this.setSize(500, 450);// 가로, 세로
		
		this.validate();
		this.add(panel2);
		this.setVisible(true);
	}// GUI()

	class MyFrame implements ActionListener {// 내부클래스
		public void actionPerformed(ActionEvent e) {// 액션이벤트 처리
			int k = Integer.parseInt(e.getActionCommand());
			if (removeCount != 12) {
				if (count != 2) {
					button[k].setIcon(img[k % 6]);
					tmp[count] = k;
					if (tmp[0] == tmp[1]) {// 마우스 이벤트 잡아냄, 비교한다 같은 이미지인지
						count--;
					}
					count++;
				}

				if (count == 2) {
					if (tmp[0] % 6 == tmp[1] % 6) {
						
						button[tmp[0]].setIcon(blank);
						button[tmp[1]].setIcon(blank);
						button[tmp[0]].removeActionListener(this);
						button[tmp[1]].removeActionListener(this);
						tmp[0] = 100;
						tmp[1] = 200;
						count = 0;
						removeCount += 2;
						GameCount++;
					} else {
						
						button[tmp[0]].setIcon(imgDefault);
						button[tmp[0]].setIcon(imgDefault);
						tmp[0] = 100;
						tmp[1] = 200;
						count = 0;
						GameCount++;

					}
				}
				if (removeCount == 12) {
					lastTime = System.currentTimeMillis();
					JOptionPane.showMessageDialog(null, "축하합니다!!모두 맞추셨습니다");
				}
			}

		}// end of ActionListener
	}// end of Class MyFrame
}// end of Class GUI


