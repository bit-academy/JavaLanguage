public class Multiplier {
	int value1;
	int value2;

	public Multiplier(int value1, int value2) {
		this.value1 = value1;
		this.value2 = value2;
	}

	public int multiply() {
		int result = value1 * value1;
		return result;
	}

	public static void main(String[] args) throws Exception {
		if (args.length < 2) {
			System.out.println("»ç¿ë¹ý : java Multiplier <°öÇÒ ¼ö1> <°öÇÒ ¼ö2>");
			System.exit(1);
		}

		int value1 = Integer.parseInt(args[0]);
		int value2 = Integer.parseInt(args[1]);
		Multiplier m = new Multiplier(value1, value2);

		while (true) {
			System.out.println(m.multiply());
			Thread.sleep(1000);
		}
	}
}
