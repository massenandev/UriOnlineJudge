package iniciante;

import java.util.Scanner;

public class P1041 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x, y;
		x = sc.nextDouble();
		y = sc.nextDouble();

		if (x > 0.0 && y > 0.0) {
			System.out.println("Q1");
		} else if (x < 0.0 && y > 0.0) {
			System.out.println("Q2");
		} else if (x < 0.0 && y < 0.0) {
			System.out.println("Q3");
		} else if (x > 0.0 && y < 0.0) {
			System.out.println("Q4");
		} else if (x == 0.0 && y == 0.0) {
			System.out.println("Origem");
		} else if (y == 0) {
			System.out.println("Eixo X");
		} else if (x == 0) {
			System.out.println("Eixo Y");
		}
		sc.close();
	}
}
