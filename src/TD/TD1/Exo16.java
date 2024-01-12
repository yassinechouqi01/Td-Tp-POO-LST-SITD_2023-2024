package TD.TD1;

import java.util.Scanner;

public class Exo16 {
    public static void main(String args[]){
        Scanner in = new Scanner (System.in);
        int nbr;
        System.out.println("Donner un nombre : ");
        nbr = in.nextInt();
        int originalNumber = nbr;
        int sumOfCubes = 0;
        if((nbr>=100 ) && (nbr<=999)) {
            do{
                int souNbr = nbr % 10;
                sumOfCubes += souNbr * souNbr * souNbr;
                nbr /= 10;
            }while (nbr > 0);

            if (sumOfCubes == originalNumber) {
                System.out.println(originalNumber + " est un nombre cubique.");
            }
            else{
                System.out.println("c'est pas un nombre cubique.");
            }
        }
        else {
            System.out.println("Please enter a valide Nombre (100<= nbr <= 999)");

        }
    }
}
