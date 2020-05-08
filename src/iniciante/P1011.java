package iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;

public class P1011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.000");

        double pi = 3.14159;
        float raio = sc.nextFloat();
        double volume = (4 / 3.0) * (pi * Math.pow(raio,3));

        System.out.println("VOLUME = " + df.format(volume));
        sc.close();
    }

}
