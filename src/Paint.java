
public class Paint {

	int coverage;
	Shapes s;

	Paint(Shapes shape, int c) {
		s = shape;
		coverage = c;
	}

	public double amountOfPaint() {

		double paints = s.area() / coverage;

		System.out.println("Paint needed for " + s.toString() + " is " + paints);

		return paints;
	}

}
