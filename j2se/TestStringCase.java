public class TestStringCase {
	public static void main(String[] args) {
		String s = "ABAabb$&^$#BAAb898B#@%aa";
		int cU = 0, cL = 0, cO = 0;
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			
			if(c >= 'A' && c <= 'Z') {
				cU ++;
			} else if( c >= 'a' && c <='z') {
				cL ++;
			} else {
				cO ++;
			}
		}
		
		System.out.println("��д��" + cU);
		System.out.println("Сд��" + cL);
		System.out.println("������" + cO);
	}
}