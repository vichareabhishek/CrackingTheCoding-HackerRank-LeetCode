package Implementation;

import java.util.Random;
import java.util.Scanner;

public class Distance {
	public static void main(String[] args) {
		double x1, y1, x2, y2; // coordinates of two points
		double distance; // distance between the points
		Scanner scan = new Scanner(System.in);
		// Read in the two points
		System.out.print("Enter the coordinates of the first point " + "(put a space between them): ");
		x1 = scan.nextDouble();
		y1 = scan.nextDouble();
		System.out.print("Enter the coordinates of the second point: ");
		x2 = scan.nextDouble();
		y2 = scan.nextDouble();
		double x = (x1 - x2);
		double w = Math.pow(x, 2);
		double y = (y1 - y2);
		double p = Math.pow(y, 2);
		double z = Math.sqrt(w + p);
		System.out.println(z);
		// Your code here: Compute the distance
		// Your code here: Print out the answer
	}

}
