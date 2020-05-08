package iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;

public class P1002 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.0000");
		double n = 3.14159;
		double raio = sc.nextDouble();
		double area = n * (Math.pow(raio, 2));

		System.out.println("A=" + df.format(area));
		sc.close();

	}

}
