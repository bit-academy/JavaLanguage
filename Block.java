public class Block {
	int instanceValue;

	public Block(int value) {
		int constructValue = value;
		call(constructValue);
	}

	void call(int constructValue) {
		constructValue += instanceValue;

		String instanceValue = "" + constructValue;

		for (int value = 0; value < 5; value++) {
			this.instanceValue += value;
		}

		{
			int localValue = 1;
			// int constructValue = 2;
		}

		// localValue++;
	}

	public static void main(String[] args) {
		new Block(1);
	}
}
