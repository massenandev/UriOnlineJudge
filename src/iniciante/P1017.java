package iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;

public class P1017 {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.000");
        int tempoEmHoras = sc.nextInt();
        int velocidadeMedia = sc.nextInt();
        double litros = (tempoEmHoras * velocidadeMedia) / 12.0;
        System.out.println(df.format(litros));
        sc.close();
    }

}
