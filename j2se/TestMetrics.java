public class TestMetrics {
    public static void main(String args[]) {  
        int[][] m = {{1,2,3},{2,3,4},{4,5,6}};
        int[][] n = {{3,4,5},{5,6,7}}; 
        int[][] mn = new int[3][];
        for(int i = 0; i<m.length;i++) {
            mn[i] = new int[n[0].length];
        }
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < n[0].length; j++) {
                for (int k = 0; k < n.length; k++) {
                    mn[i][j] += m[i][k] * n[k][j];
                }
            }
        }
        for(int i = 0; i<mn.length;i++){
            for(int j =0;j<mn[i].length;j++){
                System.out.print(mn[i][j]);
                if(j<mn[i].length-1) System.out.print(",");
            }
            System.out.println();
        }
    }
}
