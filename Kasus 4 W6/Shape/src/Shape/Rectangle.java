package Shape;

public class Rectangle extends Shape {
	private double length;
	private double width;
	
	public Rectangle() {
		super();
		this.width = 1.0;
		this.length = 1.0;
	}
	public Rectangle(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}
	public Rectangle(double length, double width, String color, boolean filled) {
		super(color, filled);
		this.length = length;
		this.width = width;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getArea(){
		return width * length;
		}
	public double getPerimeter(){
		return 2 * (width + length);
		}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "A Rectangle with width = " + width + " and length = " +
				length + ", which is a subclass of " + super.toString();
		}
}
