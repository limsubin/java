import java.util.*;

public class Dama_Gift {
	public static int giftButton = 0;

	public void gift() {
		if (Dama_Status.finalLev % 10 == 0) {
			giftButton = giftButton + 1;
			System.out.println("����" + Dama_Status.finalLev + "�޼� ������� ���� 1�� ȹ��");
		} // end if1
	}
}
