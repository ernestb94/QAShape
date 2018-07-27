package shapeBuild;

public class Circle implements Shape {

	private double radius;
	double pi = Math.PI;
	double peri;
	double area;

	public Circle(double radius) {
		this.radius = radius;
	}

	public double periShape() {
		peri = 2 * pi * radius;
		return peri;
	}

	public double areaShape() {
		area = pi * Math.pow(radius, 2);
		return area;
	}

}
