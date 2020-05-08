package iniciante;

import java.util.Scanner;

public class P1020 {
	
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        calculaDias(a);
        sc.close();
    }

    public static void calculaDias(int valor) {
    int ano = 0;
    int meses = 0;
    int dias = 0;

    while (valor != 0){
        if (valor >= 365){
            ano++;
            valor -= 365;
        } else if (valor >= 30){
            meses++;
            valor -= 30;
        } else if (valor >= 1){
            dias++;
            valor -= 1;
        }
    }
        System.out.println(ano + " ano(s)");
        System.out.println(meses + " mes(es)");
        System.out.println(dias + " dia(s)");
    }

}
