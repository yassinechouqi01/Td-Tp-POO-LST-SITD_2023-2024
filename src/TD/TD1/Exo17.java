package TD.TD1;

import java.util.Scanner;

public class Exo17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Entre un taill N :  ");
        int N = in.nextInt();

        int T[] = new int[N];
        int i;
        System.out.println("entre les valeur de Tableau T : ");
        for (i = 0; i < N; i++) {
            T[i] = in.nextInt();
        }
        int max = T[0], min = T[0];

        for (i = 0; i < N; i++) {
            if (max < T[i]) {
                max = T[i];
            }
            if (min > T[i]) {
                min = T[i];
            }
        }
        System.out.println("le maximum est = " + max);
        System.out.println("le minimum est = " + min);
    }
}
