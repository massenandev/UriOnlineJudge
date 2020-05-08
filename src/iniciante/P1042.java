package iniciante;

import java.util.Arrays;
import java.util.Scanner;

public class P1042 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		int sort[] = { a, b, c };
		int original[] = { a, b, c };

		Arrays.sort(sort);

		for (int i = 0; i < sort.length; i++) {
			System.out.println(sort[i]);
		}

		System.out.println();

		for (int i = 0; i < original.length; i++) {
			System.out.println(original[i]);
		}
		sc.close();
	}

}
