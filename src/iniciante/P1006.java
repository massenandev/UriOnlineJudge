package iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;

public class P1006 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.0");
		double nota1 = sc.nextDouble() * 2;
		double nota2 = sc.nextDouble() * 3;
		double nota3 = sc.nextDouble() * 5;
		double media = (nota1 + nota2 + nota3) / 10;

		System.out.println("MEDIA = " + df.format(media));

		sc.close();
	}

}
