package iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;

public class P1038 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		int codigo = sc.nextInt();
		int quantidade = sc.nextInt();

		if (codigo == 1) {
			System.out.println("Total: R$ " + df.format(quantidade * 4.00));
		} else if (codigo == 2) {
			System.out.println("Total: R$ " + df.format(quantidade * 4.50));
		} else if (codigo == 3) {
			System.out.println("Total: R$ " + df.format(quantidade * 5.00));
		} else if (codigo == 4) {
			System.out.println("Total: R$ " + df.format(quantidade * 2.00));
		} else if (codigo == 5) {
			System.out.println("Total: R$ " + df.format(quantidade * 1.50));
		}

		sc.close();
	}

}
