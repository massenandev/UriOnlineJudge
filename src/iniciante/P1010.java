package iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;

public class P1010 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		int codPeca1 = sc.nextInt();
		int numPeca1 = sc.nextInt();
		double valorPeca1 = sc.nextDouble();
		double preco1 = numPeca1 * valorPeca1;

		int codPeca2 = sc.nextInt();
		int numPeca2 = sc.nextInt();
		double valorPeca2 = sc.nextDouble();
		double preco2 = numPeca2 * valorPeca2;

		double valorTotal = preco1 + preco2;

		System.out.println("VALOR A PAGAR: R$ " + df.format(valorTotal));
		sc.close();
	}

}
