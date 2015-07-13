public class Assertion {
	public static final int OFF = 0;
	public static final int ON = 1;

	private static void evaluteValue(int value) {
		switch (value) {
		case OFF:
			System.out.println("������ ���ϴ�.");
			break;

		case ON:
			System.out.println("������ �մϴ�.");
			break;

		default:
			assert value > 0 : value + " -> �������� �����.";
			System.out.println("����Ŀ� ���������� ���ϴ�.");
			// ���������� ���� �ڵ�.
		}
	}

	public static void main(String[] args) {
		assert args.length != 0;
		evaluteValue(Integer.parseInt(args[0]));
	}
}
