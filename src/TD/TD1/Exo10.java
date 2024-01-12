package TD.TD1;

import java.util.Scanner;

public class Exo10 {
    public static void main(String args []){
        Scanner in = new Scanner (System.in);

        System.out.println("entre 20 nbr successivement : ");

        int nbr;
        int max=0;
        int pos=0;
        /*
        int max = Integer.MIN_VALUE;
        */
        int i=1;
        do{
            nbr = in.nextInt();
            if(i==1)
                max = nbr;
            else {
                if (nbr > max){
                    max=nbr;
                    pos = i;
                }
            }
            i++;
        }while(nbr!=0);
        System.out.println("Le maximum est : "+ max);
        System.out.println("Le position est : "+ pos);

    }
}
