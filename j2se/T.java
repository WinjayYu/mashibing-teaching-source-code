public class T {
	
	int i;
	
	void m(int i) {
		this.i = i;
	}
	
	void m(short i) {
		System.out.println("short");
	}
	
	
	public static void main(String[] args) {
		this.i = 8;
		T t = new T();
		t.m(5);
	}
}