package TD.TD1;

import java.util.Scanner;

public class Exo9 {
    static int factorielNbr(int N){
        if(N==1 || N==0)
            return 1;
        else
            return N * factorielNbr(N-1);
    }
    public static void main(String args []){
        Scanner in = new Scanner (System.in);

        System.out.println("Entre un nbr A : ");
        int a = in.nextInt();

        int fct,sum_imp,i;

        fct=1;
        sum_imp=0;
        for (i=1 ; i <= a ; i++){
            fct *= i;
            if(i%2!=0)
                sum_imp += i ;
        }

        System.out.println("le factoriel est egale: " + fct);
        System.out.println("la somme est egale: " + sum_imp);
    }
}
