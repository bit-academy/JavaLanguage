public class Assertion {
	public static final int OFF = 0;
	public static final int ON = 1;

	private static void evaluteValue(int value) {
		switch (value) {
		case OFF:
			System.out.println("전원을 끕니다.");
			break;

		case ON:
			System.out.println("전원을 켭니다.");
			break;

		default:
			assert value > 0 : value + " -> 음수값은 불허용.";
			System.out.println("잠시후에 전압조정에 들어갑니다.");
			// 전압조정을 위한 코드.
		}
	}

	public static void main(String[] args) {
		assert args.length != 0;
		evaluteValue(Integer.parseInt(args[0]));
	}
}
