package TD.TD1;

import java.util.Scanner;

public class Exo22 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int N;

        System.out.println("Donner la taille de tableau: ");
        N = in.nextInt();

        char[] A = new char[N];
        char B[] = new char [N];

        System.out.println("Entrez les caractères :");
        for (int i = 0; i < N; i++) {
            System.out.print("Caractère " + (i + 1) + " : ");
            A[i] = in.next().charAt(0);
        }

        System.out.print("Tableau initial : ");
        for(int i = 0 ; i < N ; i++ ){
            System.out.print(" "+ A[i]);
        }
        System.out.println("");

        //la permutation des elements
        // on va permute la premier elements et la dernier avec un deplacment des elemts
        char premierElemt = A[0];
        for(int i = 0 ; i < N - 1; i++ ){
            A[i] = A[i+1];
        }
        A[(A.length) -1] = premierElemt;
        System.out.println("le tableau apres permutation (decalage): ");
        for(int i = 0 ; i < N ; i++ ){
            System.out.print(" "+ A[i]);
        }
        System.out.println("");

    }
}
