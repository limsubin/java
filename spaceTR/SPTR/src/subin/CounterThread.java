package subin;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class CounterThread extends Thread {
	private JLabel lblCounter;

	public CounterThread(JLabel lbl) {
		lblCounter = lbl;
	}

	public void run() {
		int cnt = 30;// �̰� 0���� ū ��� ���ƶ�
		while (cnt >= 0) {
			lblCounter.setText(String.valueOf(cnt));// cnt�� int���̶� String���� �޾ƿ��� ���� �̷��� ���
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				return;//��ġ�ϸ� ���� �����������ϱ� ������ return
			}
			cnt--;
		}
		
	}
}
