class Shape {
	public void area() {
		System.out.println("Calculating area of a shape...");
	}
}

class Rectangle extends Shape {
	private int length;
	private int width;

	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}

	@Override
	public void area() {
		System.out.println("Calculating area of a rectangle...");
		int area = length * width;
		System.out.println("Area: " + area);
	}
}

class Triangle extends Shape {
	private int base;
	private int height;

	public Triangle(int base, int height) {
		this.base = base;
		this.height = height;
	}

	@Override
	public void area() {
		System.out.println("Calculating area of a triangle...");
		double area = 0.5 * base * height;
		System.out.println("Area: " + area);
	}
}

public class Main {
	public static void main(String[] args) {
		Shape s1 = new Shape();
		s1.area();

		Shape s2 = new Rectangle(10, 20);
		s2.area();

		Shape s3 = new Triangle(10, 20);
		s3.area();
	}
}
