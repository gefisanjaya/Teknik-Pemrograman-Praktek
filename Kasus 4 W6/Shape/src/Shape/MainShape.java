package Shape;

public class MainShape {
	public static void main(String[] args) {
		Shape s = new Shape("black", false);
		System.out.println(s.toString());
		
		Circle c = new Circle(7.0, "Blue", true);
		System.out.println(c.toString() + 
				", Area = " + c.getArea() +
				", Perimeter = " + c.getPerimeter());
		
		Rectangle r = new Rectangle(10.0, 10.10, "Blue", true);
		System.out.println(r.toString() +
				", Area = " + r.getArea() +
				 ", Perimeter = " + r.getPerimeter());
		
		Square k = new Square(10.0, "Blue", true);
		System.out.println(k.toString() +
				", Area = " + k.getArea() +
				 ", Perimeter = " + k.getPerimeter());
	}
}
