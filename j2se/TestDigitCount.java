public class TestDigitCount {
	public static void main(String[] args) {
		int i = 34789;
		double d = 3478.9765;
		digitCount2(String.valueOf(i));
		digitCount2(String.valueOf(d));
	}
	
	public static void digitCount(String s) {
		int index = s.indexOf(".");
		if(index == -1) {
			System.out.println(s.length());
		} else {
			System.out.println("整数：" + index + "\n" + "小数：" + (s.length() - index - 1));
		}
	}
	
	public static void digitCount2(String s) {
		String s1 = s.replace('.', ',');
		String[] ss = s1.split(",");
		if(ss.length == 1) {
			System.out.println(s1.length());
		} else if(ss.length == 2) {
			System.out.println("整数：" + ss[0].length() + "\n" + "小数：" + ss[1].length());
		} else {
			System.out.println("Format Error!");
		}
	}
}