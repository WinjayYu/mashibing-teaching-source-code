public class Count3Quit {
	public static void main(String[] args) {
		int[] a = new int[500];
		for(int i=0; i<a.length; i++) {
			a[i] = 1;
		}
		
		int leftCount = 500;
		int countNum = 0;
		int index = 0;
		
		while(leftCount != 1) {
			if(a[index] == 1) {
				countNum ++;
				if(countNum == 3) {
					countNum = 0;
					a[index] = 0;
					leftCount --;
				}
			}
			
			index ++;
			if(index == a.length) {
				index = 0;
			}
		}
		
		for(int i=0; i<a.length; i++) {
			if(a[i] == 1) {
				System.out.println(i);
			}
		}
	}
}