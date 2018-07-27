package shapeBuildTest;

import org.junit.Test;

import shapeBuild.Rectangle;
import shapeBuild.Shape;
import shapeBuild.Triangle;

public class ShapeTest {
	
	 @Test
	 public void testPeriShape() {
        Triangle t = new Triangle(0, 0, 0);
		assertEquals("Suppose to Fail",t.periShape(12,12,12));
	}
	
	 @Test
	public void testAreaShape() {
		Rectangle r = new Rectangle(0,0);
		assertEquals("Suppose to Fail",r.areaShape(5,10));
	}

}
