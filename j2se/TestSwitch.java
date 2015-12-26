public class TestSwitch {
	public static void main(String[] args) {
		int i = 8;
		switch(i) {
			case 8 :
			case 3 :
			case 2 :
				System.out.println("C");
				break;
			case 9 :
				System.out.println("D");
				break;
			default:
				System.out.println("error");
		}
	}
}