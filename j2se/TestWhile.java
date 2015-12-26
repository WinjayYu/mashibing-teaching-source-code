public class TestWhile {
	public static void main(String[] args) {
		int i = 0;
		while(i < 10) {
			System.out.println(i);
			i++;
		}
		
		i = 0;
		do {
			i++;
			System.out.println(i);
		} while(i < 10);
	}
}