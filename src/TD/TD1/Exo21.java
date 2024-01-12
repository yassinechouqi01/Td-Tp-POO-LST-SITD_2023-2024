package TD.TD1;

import java.util.Scanner;

public class Exo21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N, M;

        System.out.println("Donner la taille de deux matrices (N ligne , M colonne ): ");

        N = in.nextInt();
        M = in.nextInt();

        int A[][] = new int[N][M];
        int B[][] = new int[N][M];
        int C[][] = new int[N][M];

        System.out.println("Donner les elements de matrice A : ");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                A[i][j] = in.nextInt();
            }
        }
        System.out.println("Donner les elements de matrice B : ");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                B[i][j] = in.nextInt();
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                C[i][j] = B[i][j] + A[i][j];
            }
        }

        System.out.println("LA somme de deux matrices est :");

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print("" + C[i][j] + "  ");
            }
            System.out.println("");

        }
    }
}
