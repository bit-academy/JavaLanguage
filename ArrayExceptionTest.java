class ArrayExceptionTest {
    public static void main(String[] args) {
    	int a[] = {1, 2};

	// 배열형 변수 a 가 가리키는 배열의 길이는 2 이므로, 사용할 수 있는 첨자는 0 과 1.
	// System.out.println(a[-1]);
	// System.out.printkl(a[2]);

	a = null;
	
	// 변수 a 가 배열을 가리키지 않고 있으므로, 예외발생.
	//a[0] = 3;
    }
}

