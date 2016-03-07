package base;

import static org.junit.Assert.*;

import org.junit.Test;

public class TriangleTest {
	
	//JUnit test getArea()
	@Test
	public void testGetArea(){
		Triangle myTest = new Triangle (5,12,13);
		double area = myTest.getArea();
		assertEquals(30.0, area, 0.1);
	}
	
	@Test
	public void test2GetArea(){
		Triangle myTest = new Triangle (5,12,13);
		double area = myTest.getArea();
		assertNotEquals(31.0, area, 0.1);
	}
	
	//JUnit test getPerimeter()
	@Test
	public void testGetPerimeter(){
		Triangle myTest = new Triangle (2.4,2.5,2.6);
		double perimeter = myTest.getPerimeter();
		assertEquals(7.5, perimeter, 0.1);
	}
	
	//JUnit test getSide1(), getSide2(), getSide3()
	@Test
	public void testSide1(){
		Triangle myTest = new Triangle(7,8,9);
		double side1 = myTest.getSide1();
		assertEquals(7.0,side1,0.1);
	}
	@Test
	public void testSide2(){
		Triangle myTest = new Triangle(7,8,9);
		double side2 = myTest.getSide2();
		assertEquals(8.0,side2,0.1);
	}
	@Test
	public void testSide3(){
		Triangle myTest = new Triangle(7,8,9);
		double side3 = myTest.getSide3();
		assertEquals(9.0,side3,0.1);
	}
	
}
