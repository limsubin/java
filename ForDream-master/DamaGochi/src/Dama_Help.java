import java.util.Scanner;

public class Dama_Help {
	public void help() { // ���� Ŭ����
		boolean helpCont = true;
		boolean allHelpCont = true;

		while (allHelpCont) {
			Scanner scan = new Scanner(System.in);
			System.out.println("1. ��ü�޴� ���� | 2. ���(��������)�ϴ� ���| 3.��ȭ");
			int help_die = scan.nextInt();

			while (helpCont) {
				switch (help_die) {                                                                        // �޴� ����
				case 1:                                                                                    // 1. ��ü�޴� ����
					System.out.println(
							"1. ���ֱ� ���� | 2. � ���� | 3. û�� ���� | 4. Ư���޴� ���� | 5. ������");
					int help_num = scan.nextInt();

					switch (help_num) {
					case 1:                                                                               // 1. ���ֱ� ����
						System.out.println("< 1. ���ֱ� >");
						System.out.println("- ���ý� �������� ��԰� ���������, ����ġ20 ȹ���մϴ�");
						System.out.println("*������ ����(5�ǹ���� ~50����)��� Ȯ�������� ������ɼ����ֽ��ϴ�.");
						System.out.println("*���� �ι������� '��'�ϳ� ���� '��'�� 3�� ������ ĳ���� ����մϴ�.");
						break;

					case 2:                                                                               // 2. � ����
						System.out.println("< 2. � >");
						System.out.println(
								"1.��å  | 2.���ڱ� | 3.�ٷ¿ | 4.����ҿ �� ��� ���ð����մϴ�");
						System.out.println("- �� ��� ü�� �������� ���� �Ǵ� �����մϴ�.");
						System.out.println("- ü�¶��� �׸�ĭ ���� �׸�ĭ�� 8�����Ǹ� ����ġ 30�߰� ���޵˴ϴ�.");
						System.out.println(
								"- ������ -20 ��������  0���� �϶� � ���ý� ���� �����ʰ� '���� 2��'���� ���ư��ϴ�.");
						break;

					case 3:                                                                               // 3. û�� ����
						System.out.println("< 3. û�� >");
						System.out.println("- �̶����� �Ծ ���� '��'�� ���δ� û�����ݴϴ�.");
						System.out.println("- �����ʱ����� ���÷� �����ϴ� ���� ��õ�մϴ�.");
						break;

					case 4:                                                                               // 4. Ư���޴� ����
						System.out.println("< 4. Ư���޴� >");
						System.out.println(
								"1.����ġ���� | 2.��å | 3.�ʱ�ȭ | 4. ������  �� ������ �����մϴ�");
						System.out.println(
								"- 1. ����ġ ���� : �������� ����ġ ȹ�氡�� ������, �ʹ� ���� �ϸ� ������ɼ��Խ��ϴ�.");
						System.out.println("- ����ġ�� �������� ��ų� �ҽ��ϴ�. ");
						System.out.println(
								"* ������ 0�̰ų� 0�̾ƴϴ��� �̶������� ����ġ���� �������� ���� ���� ����ġ�� ������� ĳ���Ͱ� ����մϴ�.\n ������ �̶������� ����ġ�� ��������ġ���� ������� ������ �����ϰ� '200-���� ���� ����ġ'�� ���ݴϴ�. ");
						System.out.println(
								"- 2. ?? : ���� ��� ���� 4���� �޴��� ������ �ο� �̱�� ���� ����ġ�� ����ϴ�.");
						System.out.println("- 3. �ʱ�ȭ : ó������ ���۰����� �ʱ�ȭ �޴����ֽ��ϴ�.");
						System.out.println("- 4. ������ : ���� 2��'���� ���ϴ�.");
						break;
					case 5:
						helpCont = false;
						break;
					}// end switch
					break;

				case 2:                                                                                     // 2. ���(��������)�ϴ� ���
					System.out.println("<����� ���(��������) �� ��>");
					System.out.println("1. ���� 2���̻��̸� ���� �ҷ����� ���");
					System.out.println("2. ������ ���� �� ���������� ������ ���ߵ����� ���");
					System.out.println("3. ������ �� ���� �Ǵ� ���ġ�� ���");
					System.out.println("4. ���� ���ָ� ��� ���");
					System.out.println("5. ���� �ʹ� ���� ������ �谡 ������ ��� ");
					helpCont = false;
					break;
					
				case 3:                                                                                       // 3. ��ȭ
					helpCont = false;
					allHelpCont = false;
					System.out.println("��ȭ��ŵ�ϴ�.");
				}// help_die switch end
			} // while end
			helpCont = true;
		}
	} // end help
}
