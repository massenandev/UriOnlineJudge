package iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;

public class P1014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.000");
        int distanciaTotal = sc.nextInt();
        double combustivelTotal = sc.nextDouble();
        double consumoMedio = distanciaTotal / combustivelTotal;

        System.out.println(df.format(consumoMedio) + " km/l");
        sc.close();
    }

}
