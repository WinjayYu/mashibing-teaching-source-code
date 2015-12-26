abstract class Animal {
  private String name;
  Animal(String name) {this.name = name;}
  /*
  public void enjoy(){
    System.out.println("請汒......");
  }
  */
  public abstract void enjoy();
}

abstract class Cat extends Animal {
  private String eyesColor;
  Cat(String n,String c) {super(n); eyesColor = c;}
  /*
  public void enjoy() {
    System.out.println("癡請汒......");
  }
  */
  //public abstract void enjoy();
}

class Dog extends Animal {
  private String furColor;
  Dog(String n,String c) {super(n); furColor = c;}
 
  public void enjoy() {
    System.out.println("僩請汒......");
  }
}

class Bird extends Animal {
	 Bird() {
	 	 super("bird");
	 }
	 public void enjoy() {
    System.out.println("纏請汒......");
  }
}

class Lady {
    private String name;
    private Animal pet;
    Lady(String name,Animal pet) {
        this.name = name; this.pet = pet;
    }
    public void myPetEnjoy(){pet.enjoy();}
}

public class Test {
    public static void main(String args[]){
        Cat c = new Cat("catname","blue");
        Dog d = new Dog("dogname","black");
        Bird b = new Bird();
        //Lady l1 = new Lady("l1",c);
        Lady l2 = new Lady("l2",d);
        Lady l3 = new Lady("l3",b);
       //l1.myPetEnjoy();
        l2.myPetEnjoy();
        l3.myPetEnjoy();
    }
}
