package iniciante;

import java.util.Scanner;

public class P1046 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int horaInicio = sc.nextInt();
		int horaFinal = sc.nextInt();

		sc.close();

		int resultado2 = horaFinal - horaInicio;
		int resultado3 = 24 - (horaInicio - horaFinal);

		if (horaInicio == horaFinal) {
			System.out.println("O JOGO DUROU 24 HORA(S)");
		} else if (horaInicio < horaFinal) {
			System.out.println("O JOGO DUROU " + resultado2 + " HORA(S)");
		} else if (horaInicio > horaFinal) {
			System.out.println("O JOGO DUROU " + resultado3 + " HORA(S)");
		}
	}
}
