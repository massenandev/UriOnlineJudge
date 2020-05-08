package iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;

public class P1012 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.000");

        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        double pi = 3.14159;

        double triangulo = (a * c) / 2;
        double circulo = pi * (Math.pow(c,2));
        double trapezio = ((a + b)) * (c / 2);
        double quadrado = Math.pow(b,2);
        double retangulo = a * b;

        System.out.println("TRIANGULO: " + df.format(triangulo) +
                "\nCIRCULO: " + df.format(circulo) +
                "\nTRAPEZIO: " + df.format(trapezio) +
                "\nQUADRADO: " + df.format(quadrado) +
                "\nRETANGULO: " + df.format(retangulo));

        sc.close();
    }
}
