public class TestEqual {
	public static void main(String[] args) {
		Integer i1 = new Integer(1);
		Integer i2 = new Integer(1);
		System.out.println(i1 == i2);
		System.out.println(i1.equals(i2));
		Mao m1 = new Mao("A", "A");
		Mao m2 = new Mao("A", "A");
		System.out.println(m1 == m2);
		System.out.println(m1.equals(m2));
	}
}

class Mao {
	String name;
  String color;
  Mao(String n,String c){
    name = n; color = c;
  }
  
  public boolean equals(Object obj) {
  	return true;
  }
}