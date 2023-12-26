package trainingclass;

public class Rectangle {
	public double height;
	public double width;


	public double area() {
		return height * width;
	}
	public double perimeter() {
		return (2*height) + (2*width);
	}
	public double diagonal() {
		return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
	}
	public String toString() {
		return "Area: " + area() 
				+ " Perimeter: " + perimeter()
				+ " Diagonal: " + String.format("%.2f",diagonal());
	}
}
