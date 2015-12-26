public class TestFinal {
	public static void main(String[] args) {
		T t = new T();
		//t.i = 8;
	}
}

final class T {
	final int i = 8;
	public final void m() {
		//j = 9;
	}
}

class TT extends T {
	
}