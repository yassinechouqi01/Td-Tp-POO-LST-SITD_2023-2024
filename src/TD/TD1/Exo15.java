package TD.TD1;

import java.util.Scanner;

public class Exo15 {
    public static void main(String args[]){
        Scanner in = new Scanner (System.in);

        int nbr;
        System.out.println("Entre a chifre: ");
        nbr = in.nextInt();

        String nbrString;
        int count,i,a,sum=0;

        nbrString = Integer.toString(nbr);

        count = nbrString.length();

        for( i = 1 ; i <= count ; i++ ){
            a = nbr%10;
            sum = sum  + a;
            nbr = nbr / 10;
        }
        System.out.println("la somme est : " + sum );

    }
}
