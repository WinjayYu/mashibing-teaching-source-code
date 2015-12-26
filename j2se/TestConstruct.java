class Person2 {
    private String name;
    private String location;

    Person2(String name) {
        this.name = name;
        location = "beijing";
    }
    Person2(String name,String location) {
        this.name = name;
        this.location = location;
    }
    public String info() {
        return 
            "name: "+name+" location: "+location;
    }
}

class Teacher extends Person2 {
	private String capital;
	
	Teacher(String name, String capital) {
		this(name, "beijing", capital);
	}
	
	Teacher(String name, String location, String capital) {
		super(name, location);
		this.capital = capital;
	}
	
	public String info() {
		return super.info() + "capital: " + capital;
	}
}

public class TestConstruct {
	public static void main(String[] args) {
		Teacher t = new Teacher("B", "GG");
		System.out.println(t.info());
	}
}