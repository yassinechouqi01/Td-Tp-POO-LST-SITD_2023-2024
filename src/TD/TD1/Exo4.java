package TD.TD1;

import java.util.Scanner;

public class Exo4 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        int moy;
        System.out.println("");

        System.out.println("donner la moyenne de l'etudient : ");
        moy = in.nextInt();

        if(moy>=10 && moy<12)
            System.out.println(" moyenne Passable");

        else if(moy>= 12 && moy<14)
            System.out.println(" moyenne Assez bien ");
        else if (moy>=14 && moy <16)
            System.out.println(" moyenne bien");
        else if (moy>=16)
            System.out.println("moyenne tres bien");
        else
            System.out.println("aucun monssion");
    }
}
