package Shape;

public class TestShape {
	public static void main(String[] args){
		Shape a = new Shape();
		Shape b = new Shape("Blue",false);
		a.setColor("Orange");
		System.out.println(a.toString());
		if(b.isFilled()){
			System.out.println(b.toString());
		}
		b.setFilled(true);
		if(b.isFilled()){
			System.out.println(b.toString());
		}
	}
}

