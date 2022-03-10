
public class PaintThings {

	public static void main(String[] args) {

		Rectangle deck = new Rectangle(20, 35);

		Sphere bigBall = new Sphere(15);

		Cylinder tank = new Cylinder(10, 30);

		Paint p = new Paint(deck, 25);
		p.amountOfPaint();

		p = new Paint(bigBall, 30);
		p.amountOfPaint();

		p = new Paint(tank, 35);
		p.amountOfPaint();

	}

}
