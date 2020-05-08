package iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;

public class P1015 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0000");
        float x1 = sc.nextFloat();
        float y1 = sc.nextFloat();
        float x2 = sc.nextFloat();
        float y2 = sc.nextFloat();
        double distanciaParcialX = Math.pow((x2-x1),2);
        double distanciaParcialY = Math.pow((y2-y1),2);
        double distanciaTotal1 = (distanciaParcialX + distanciaParcialY);
        double distanciaTotal2 = Math.sqrt(distanciaTotal1);
        System.out.println(df.format(distanciaTotal2));
        sc.close();

    }
}
