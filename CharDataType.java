public class CharDataType {
	public static void main(String[] args) {
		char c1 = 'a';
		char c2 = '\u0061';
		char c3 = '°¡';
		char c4 = '\uac00';

		System.out.println(c1 == c2);
		System.out.println(c3 == c4);
	}
}
