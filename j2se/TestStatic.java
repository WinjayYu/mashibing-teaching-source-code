public class TestStatic {
	static int i = 0;
	public static void main(String[] args) {
		i = 8;
		//T t = new T();
		//T.this.i = 9;
	}
}

class TT {
	int i = 8;
	void m() {
		TestStatic ts = new TestStatic();
		
		System.out.println(TestStatic.i);
		System.out.println(ts.i);
	}
}