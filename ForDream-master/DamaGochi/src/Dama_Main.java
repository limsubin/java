import java.util.*; //Ŭ���� ���� ���

public class Dama_Main {

	public static void main(String[] args) { // ����Ŭ����
		/*****************************************************
		 * Dama_FirstMenu = first - ù��° �޴� ������ 
		 * Dama_SecondMenu = second - �ι�° �޴� ������
		 * Dama_emotion = emot - ���� ��� �޴� ������ - ����� �ʱ�ȭ ����
		 * Dama_Status = stat - ���������� ����� ���� �ɷ�ġ�� ������ - �ʱ�ȭ ����
		 ******************************************************/
		Dama_FirstMenu first = new Dama_FirstMenu();
		Dama_SecondMenu second = new Dama_SecondMenu();
		Dama_Status stat = new Dama_Status();
		Dama_emotion emot = new Dama_emotion();
		while (true) {
			while (Dama_Status.run == true) {                          // ������ run���� false�� �ٲ㼭 while�� Ż��
				first.firstMenu1();                                    // ù��° �޴� ����
				second.secondMenu();                                   // �ι�° �޴� ����
			}
			stat.Dama_Reset();                                         // ������ ���������� ����Ǿ��� �ɷ�ġ�� ����
			emot.emotion_reset();
			continue;                                                  // ó������ ���ư� �ٽ� ��ȭ��Ŵ
		} // end while
	}
}
