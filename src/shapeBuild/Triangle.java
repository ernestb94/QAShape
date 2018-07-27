package shapeBuild;

public class Triangle implements Shape {

	private double tside1; 
	private double tside2; 
	private double tside3;
	private double peri;
	private double area = 0;


	public Triangle(double tside1, double tside2, double tside3) {
		this.tside1 = tside1;
		this.tside2 = tside2;
		this.tside3 = tside3;
	}

	public double periShape() {
		peri = tside1 + tside2 + tside3;
		return peri;
	}

	public double areaShape() {
		double s = (tside1 + tside2 + tside3) / 2;
		area = Math.sqrt(s * (s - tside1) * (s - tside2) * (s - tside3));
		return area;

	}
}
