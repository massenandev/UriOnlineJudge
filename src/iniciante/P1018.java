package iniciante;

import java.util.Scanner;

public class P1018 {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(a);
        calculaCedulas(a);
        sc.close();
    }

    public static void calculaCedulas(int valor) {

        int cem = 0;
        int cinquenta = 0;
        int vinte = 0;
        int dez = 0;
        int cinco = 0;
        int dois = 0;
        int um = 0;

        while (valor != 0) {
            if (valor >= 100) {
                cem++;
                valor -= 100;
            } else if (valor >= 50) {
                cinquenta++;
                valor -= 50;
            } else if (valor >= 20) {
                vinte++;
                valor -= 20;
            } else if (valor >= 10) {
                dez++;
                valor -= 10;
            } else if (valor >= 5) {
                cinco++;
                valor -= 5;
            } else if (valor >= 2) {
                dois++;
                valor -= 2;
            } else if (valor >= 1) {
                um++;
                valor -= 1;

            }
        }
        System.out.println(cem + " nota(s) de R$ 100,00");
        System.out.println(cinquenta + " nota(s) de R$ 50,00");
        System.out.println(vinte + " nota(s) de R$ 20,00");
        System.out.println(dez + " nota(s) de R$ 10,00");
        System.out.println(cinco + " nota(s) de R$ 5,00");
        System.out.println(dois + " nota(s) de R$ 2,00");
        System.out.println(um + " nota(s) de R$ 1,00");
    }

}
