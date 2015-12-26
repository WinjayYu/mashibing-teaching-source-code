public class TestAccess {
}

class T {
	private int i = 0;
					int j = 0;
	protected int k = 0;
	public int m = 0;
	
	public void m() {
		i = 9;
	}
}

class TT {
	public void m() {
		T t = new T();
		System.out.println(t.j);
	}
}