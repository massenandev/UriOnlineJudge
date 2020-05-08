package iniciante;

import java.util.Scanner;

public class P1019 {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int entrada = sc.nextInt();
        int horas = entrada / 3600;
        int minutos = (entrada - (horas * 3600)) / 60;
        int segundos = entrada - (horas * 3600) - (minutos * 60);
        System.out.println(horas + ":" + minutos + ":" + segundos);
        sc.close();
    }

}
