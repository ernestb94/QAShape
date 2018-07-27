package shapeBuild;

public class Rectangle implements Shape {

	private double width;
	private double height;
	private double peri;
	private double area;

	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	public double periShape() {
		
		peri = 2 * (width + height);
		return peri;
	}

	public double areaShape() {
		
		area =  width * height;
		return area;
	}
}
