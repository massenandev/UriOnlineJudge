package iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;

public class P1005 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00000");
		float nota1 = sc.nextFloat() * 3.5F;
		float nota2 = sc.nextFloat() * 7.5F;
		double media = ((nota1) + (nota2)) / 11;

		System.out.println("MEDIA = " + df.format(media));

	}
}
