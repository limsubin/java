
public class Dama_emotion {
	public static boolean born_emotion;
	public static boolean eat_emotion;
	public static boolean speacial_emotion;
	public static boolean Ddong_emotion;
	public static boolean clean_emotion;
	public static boolean levelUp_emotion;
	public static boolean speacial_minusEmotion;
	public static boolean usually_emotion = true;

	public void emotion() {
		if (usually_emotion == true) {//���� ǥ��
			System.out.print("((-o.o-))");
		} else {
			if (born_emotion == true) { // �¾����
				System.out.print("�ȳ�?(*^ ^*)");
				born_emotion = false;
			}

			if (eat_emotion == true) { // �� ������
				System.out.print("�ȳ�('~')����");
				eat_emotion = false;
			}

			if (speacial_emotion == true) {//���� �¸���
				System.out.print("��(!! ^^ !!)��");
				speacial_emotion = false;
			}
			if (Ddong_emotion == true) {//�� ������
				System.out.print("(-//- ;;)");
				Ddong_emotion = false;
			}
			if (clean_emotion == true) { // �� ġ�ﶧ(���� Ȯ�� ����)
				System.out.print("��( ^//^ )��");
				clean_emotion = false;
			}
			if (speacial_minusEmotion == true) {//���� ���̳ʽ� ����ġ ���ý�
				System.out.print("(=_=)");
				speacial_minusEmotion = false;
			}
			if (levelUp_emotion == true) {//������
				System.out.print("\\(^_^)/ \t LEVEL UP!!");
				levelUp_emotion = false;
			}
			usually_emotion = true;
		}
	}//end emotion method

	void emotion_reset() {		//emotion �� reset
		Dama_emotion.born_emotion = false;
		Dama_emotion.eat_emotion = false;
		Dama_emotion.speacial_emotion = false;
		Dama_emotion.speacial_minusEmotion = false;
		Dama_emotion.Ddong_emotion = false;
		Dama_emotion.clean_emotion = false;
		Dama_emotion.levelUp_emotion = false;
		Dama_emotion.usually_emotion = true;
	}

}
