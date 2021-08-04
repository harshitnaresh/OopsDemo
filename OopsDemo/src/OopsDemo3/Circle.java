package OopsDemo3;

public class Circle implements Shape {
	private double r;
	
	public Circle(double r) {
		this.r = r;
	}

	@Override
	public void draw() {
		System.out.println("drawing circle");

	}

	@Override
	public double getArea() {
		return Math.PI*this.r;
	}

	public double getRadius() {
		return r;
	}
	

}