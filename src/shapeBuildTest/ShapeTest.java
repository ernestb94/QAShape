package shapeBuildTest;

import static org.junit.Assert.*;

import org.junit.Test;

import shapeBuild.Circle;
import shapeBuild.Rectangle;
import shapeBuild.Triangle;

public class ShapeTest {
	
	 @Test
	 public void testTrianglePeri() {
        Triangle t = new Triangle(0.0, 0.0, 0.0);
		assertEquals("Suppose to Fail",t.periShape());
	}
	
	 @Test
	public void testRectanglePeri() {
		Rectangle r = new Rectangle(0.0,0.0);
		assertEquals("Suppose to Fail",r.areaShape());
	}
	@Test
	public void testCircleArea() {
		Circle c = new Circle(0.0);
		assertEquals("Suppose to Fail",c.areaShape());
	}

}
