package base;

public class Triangle extends GeometricObject{
	
	//Create three double data fields with default values 1.0
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;
	
	//A no-argument constructor
	public Triangle(){
	}
	
	//A constructor that creates a triangle with side1, side2, and side3
	public Triangle(double side1, double side2, double side3){
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	//The accessor methods for data fields side1
	public double getSide1(){
		return side1;
	}
	public void setSide1(double side1){
		this.side1 = side1;
	}
	
	//The accessor methods for data fields side2
	public double getSide2(){
		return side2;
	}
	public void setSide2(double side2){
		this.side2 = side2;
	}
	
	//The accessor methods for data field side3
	public double getSide3(){
		return side3;
	}
	public void setSide3(double side3){
		this.side3 = side3;
	}
	
	//A method that returns the area of this triangle
	public double getArea(){
		double p = (getPerimeter()) / 2 ;
		double area = Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
		return area;
	}
	
	//A method that returns the perimeter of this triangle
	public double getPerimeter(){
		double perimeter = side1 + side2 + side3;
		return perimeter;
	}
	
	//A method that returns a string description for the triangle
	public String toString(){
		return "Three sides of this triangle are " + side1 + side2 + side3 
				+ ". Perimeter is " + getPerimeter() + ". Area is " + getArea();
	}
	
	
}