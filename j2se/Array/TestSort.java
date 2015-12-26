public class TestSort {
    public static void main(String args[]) {
        int[] a ={1,7,3,9,2,5,8,4,6};
        //bubbleSort(a);
        //selectionSort(a);
        insertSort(a);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    
    public static int[] bubbleSort(int[] a){
        int len = a.length;
        for(int i = len-1;i>=1;i--){
            for(int j = 0;j<=i-1;j++){
                if(a[j]>a[j+1]){
                    int temp = a[j]; 
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        return a;
    }
    
    public static int[] selectionSort(int[] a) {
    	for(int i=0; i<a.length; i++) {
    		for(int j = i+1; j < a.length; j++) {
    			if(a[i] > a[j]) {
    				int temp = a[i];
    				a[i] = a[j];
    				a[j] = temp;
    			}
    		}
    	}
    	return a;
    }
    
    public static int[] insertSort(int[] a) {
    	for(int i=1; i<a.length; i++) {
    		for(int j=i; j>0; j--) {
    			if(a[j] < a[j-1]) {
    				int temp = a[j];
    				a[j] = a[j-1];
    				a[j-1] = temp;
    			} else {
    				break;
    			}
    		}
    	}
    	return a;
    }
    
}