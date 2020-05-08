package iniciante;

import java.util.Scanner;

public class P1013 {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int maiorAB =  calcularMaior(a,b);
        int maior = calcularMaior(maiorAB, c);
        System.out.println(maior + " eh o maior");
        sc.close();

    }
    public static int calcularMaior(int a, int b){
        return (a + b + Math.abs(a - b)) / 2;
    }

}
