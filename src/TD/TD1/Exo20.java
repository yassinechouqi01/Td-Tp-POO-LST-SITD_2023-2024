package TD.TD1;

import java.util.Scanner;

public class Exo20 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Donner le nbr des etudient : ");
        int N = in.nextInt();

        double []T = new double [N];


        for(int i = 0 ; i < N ; i++){
            System.out.print("Donner le moyennes de etudient "+(i+1)+ " :" );
            T[i] = in.nextDouble();
        }

        System.out.print("donner la seuil des moyennes : ");
        double seuil = in.nextDouble();
        int count = 0;
        double sum = 0;
        for(int i = 0 ; i < N ; i++){
            if(T[i] >= seuil ){
                count++;
            }
            sum = sum + T[i];
        }
        System.out.println("le nbr des etudient qui ont un moyenne superieur de la seuil est : " + count);

        System.out.println("la somme des moyennes : "+ sum);

    }
}
