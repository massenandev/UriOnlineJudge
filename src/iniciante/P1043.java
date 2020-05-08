package iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;

public class P1043 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("00.0");
		double a, b, c, area, perimetro, condicao1, condicao2, condicao3;
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		area = ((a + b) * c) / 2;
		perimetro = (a + b + c);
		condicao1 = (b - c);
		condicao2 = (a - c);
		condicao3 = (a - b);

		if ((a < (b + c)) && (b < (c + a)) && (c < (b + a)) && (condicao1 < a) && (condicao2 < b) && (condicao3 < c)) {
			System.out.println("Perimetro = " + perimetro);

		} else {
			System.out.println("Area = " + area);
		}
	}

}
