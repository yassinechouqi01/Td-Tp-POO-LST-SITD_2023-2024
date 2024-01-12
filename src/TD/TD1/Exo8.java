package TD.TD1;

import java.util.Scanner;

public class Exo8 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int mois ;
        System.out.println("Entre a Valide Month : ");
        mois = in.nextInt();
        if(mois < 1 || mois > 12){
            System.out.println("Please entre a Valide Month , 1<= Month <= 12.");
        }
        else {
            int annee;
            int jour;
            if(mois == 2){
                System.out.println("Entre a Valide Year : ");
                annee = in.nextInt();
                if (annee >= 1900 && annee <= 2100){
                    if((annee % 4 == 0 && annee % 100 != 0) || (annee % 400 == 0)){
                        jour = 29;
                    }
                    else{ jour = 28;}
                }
                else {System.out.println("Please Entre a Valide year (1900 <= Year <= 2100 .");
                    return;
                }
            }else if(mois == 4 || mois == 6 || mois == 9 || mois == 11) {
                jour = 30;
            }else { jour = 31;}
            System.out.println("Le mois " + mois + " a " + jour + " jours.");
        }
    }
}
