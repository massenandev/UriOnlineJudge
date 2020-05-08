package iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;

public class P1009 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");

		String vendedor = sc.nextLine();
		double salarioFixo = sc.nextDouble();
		double totalVendas = (sc.nextDouble() * 0.15F) + salarioFixo;

		System.out.println("TOTAL = R$ " + df.format(totalVendas));

		sc.close();
	}
}
