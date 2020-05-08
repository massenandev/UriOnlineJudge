package iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;

public class P1008 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		int number = sc.nextInt();
		int horasTrab = sc.nextInt();
		double valorHora = sc.nextDouble();
		double salario = (horasTrab) * (valorHora);

		System.out.println("NUMBER = " + number + "\nSALARY = U$ " + df.format(salario));
		sc.close();

	}

}
