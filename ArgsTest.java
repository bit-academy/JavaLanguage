/**
 * �� ���α׷��� Ŀ�ǵ� ���� ���ڸ� �׽�Ʈ�մϴ�.
 */
public class ArgsTest {
	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("���ڰ� �ϳ��� �����ϴ�.");
			System.exit(1);
		}

		for (int i = 0, len = args.length; i < len; i++) {
			System.out.println(i + "�� ���� : " + args[i]);
		}
	}
}