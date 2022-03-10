
abstract class Shapes {

	public String shapeName;

	public abstract double area();

	@Override
	public String toString() {
		return "Shapes ["+ shapeName + "]";
	}

}

class Sphere extends Shapes {

	double radius;
	final double PI = 3.14;

	Sphere(double r) {
		super.shapeName = "SPHERE";
		radius = r;
	}

	@Override
	public double area() {
		return 4 * PI * radius * radius;

	}

}

class Rectangle extends Shapes {

	double length;
	double width;

	Rectangle(double l, double w) {
		super.shapeName = "RECTANGLE";
		length = l;
		width = w;
	}

	@Override
	public double area() {
		return length * width;

	}
}

class Cylinder extends Shapes {

	public double radius;
	public double height;
	public final double PI = 3.14;

	Cylinder(double r, double h) {
		super.shapeName = "CYLINDER";
		radius = r;
		height = h;
	}

	@Override
	public double area() {
		return PI * radius * height * height;
	}

}
