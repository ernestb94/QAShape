package shapeBuild;

public class BuilderMain {
	public static void main(String[] args) {

	
		
		//Builds a Triangle
		
		double tside1 = 5, tside2 = 8, tside3 = 6; 
		Triangle t = new Triangle (tside1, tside2, tside3);
		System.out.println("Triangle");
		System.out.println("Length of Sides are : " + tside1+ ", " + tside2 + ", "+ tside3);
		System.out.println("Area : " + t.areaShape());
		System.out.println("Perimeter : " + t.periShape());
		System.out.println("\n");
		
		//Builds a Rectangle
		double width = 10, height = 4; 
		Rectangle r = new Rectangle (width, height);
		System.out.println("Rectangle");
		System.out.println("Length of Sides are : " + width + ", " + height);
		System.out.println("Area : " + r.areaShape());
		System.out.println("Perimeter : " + r.periShape());
		System.out.println("\n");
		
		//Builds a Circle
		double radius = 8;
		Circle c = new Circle(radius);
		System.out.println("Circle");
		System.out.println("Radius is : " + radius);
		System.out.println("Area : " + c.areaShape());
		System.out.println("Perimeter : " + c.periShape());
		

	}
}
