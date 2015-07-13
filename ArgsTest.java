/**
 * 이 프로그램은 커맨드 라인 인자를 테스트합니다.
 */
public class ArgsTest {
	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("인자가 하나도 없습니다.");
			System.exit(1);
		}

		for (int i = 0, len = args.length; i < len; i++) {
			System.out.println(i + "번 인자 : " + args[i]);
		}
	}
}