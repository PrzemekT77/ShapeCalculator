import java.util.Scanner;

public class ShapeCalculator {

	private static double question(Scanner scan, String shape) {

		System.out.println(shape);
		return scan.nextDouble();
	}

	private static void square(Scanner scan) {
		double side = question(scan, "Enter the length of a side: ");
		System.out.println(side * side);
	}

	private static void rectangle(Scanner scan) {
		double sideOne = question(scan, "Enter the length of side One: ");
		double sideTwo = question(scan, "Enter the length of side Two");
		System.out.println(sideOne * sideTwo);

	}

	private static void triangle(Scanner scan) {
		double base = question(scan, "Enter the length of a base: ");
		double heigth = question(scan, "Enter the heigth of the triangle: ");
		System.out.println(0.5 * base * heigth);
	}

	private static void circle(Scanner scan) {
		double radius = question(scan, "Enter a radius length: ");
		System.out.println(Math.PI * (radius * radius));
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to Shape area calculator " + "Enter 1 for square area, "
				+ "Enter 2 for rectangle area, " + "Enter 3 for triangle area, " + "Enter 4 for circle area");

		switch (scan.nextInt()) {
		case 1:
			square(scan);
			break;
		case 2:
			rectangle(scan);
			break;
		case 3:
			triangle(scan);
			break;
		case 4:
			circle(scan);
			break;
		}
	}

}
