public class TestMethod2 {
	public int Max(int a, int b) {
      return a > b ? a : b;
  }
  
  public int Min(int a, int b) {
      return a < b ? a : b;
  }
  
  public static void main(String[] args) {
      TestMethod2 t = new TestMethod2();
      System.out.println("Max = "+t.Max(3,4));
      System.out.println("Min = "+t.Min(3,4));
      //System.out.println(Max(3, 4));
  }

}