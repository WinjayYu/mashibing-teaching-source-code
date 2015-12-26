public class NumSort {
	public static void main(String[] args) {
		int[] a = new int[args.length];
		for (int i=0; i<args.length; i++) {
			a[i] = Integer.parseInt(args[i]);
		}
		print(a);
		selectionSort(a);
		print(a);
	}
	
	private static void selectionSort(int[] a) {
		int k, temp;
		for(int i=0; i<a.length; i++) {
			k = i;
			for(int j=k+1; j<a.length; j++) {
				if(a[j] < a[k]) {
					k = j;
				}
			}
			
			if(k != i) {
				temp = a[i];
				a[i] = a[k];
				a[k] = temp;
			}
		}
	}
	
	private static void print(int[] a) {
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
}