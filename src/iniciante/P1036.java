package iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;

public class P1036 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00000");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();

		double delta = (Math.pow(b, 2)) - (4 * a * c);
		double r1 = ((-1 * b) + (Math.sqrt(delta))) / (2 * a);
		double r2 = ((-1 * b) - (Math.sqrt(delta))) / (2 * a);

		if ((a == 0) || (delta < 0)) {
			System.out.println("Impossivel calcular");
		} else {
			System.out.println("R1 = " + df.format(r1));
			System.out.println("R2 = " + df.format(r2));
		}
		sc.close();
	}

}
