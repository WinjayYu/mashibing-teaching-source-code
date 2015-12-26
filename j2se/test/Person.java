public class Person {
	int id;
	int age = 20;
	
	void Person(int _id, int _age) {
		id = _id;
		age = _age;
	}
	
	public static void main(String[] args) {
		Person tom = new Person();
		tom.Person(1, 25);
		//Person jerry = new Person();
		Point p = new Point();
	}
}

class Point {
	Point() {}
	int x;
	int y;
}