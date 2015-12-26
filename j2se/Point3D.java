public class Point3D {
	double x, y, z;
	
	public Point3D(double _x, double _y, double _z) {
		x = _x;
		y = _y;
		z = _z;
	} 
	
	public void setX(double _x) {
		x = _x;
	}
	
	public double distance() {
		return x*x + y*y + z*z;
	}
	
	public static void main(String[] args) {
		Point3D p = new Point3D(1.2, 3.4, 5.8);
		p.setX(1.3);
		System.out.println(p.distance());
	}
}