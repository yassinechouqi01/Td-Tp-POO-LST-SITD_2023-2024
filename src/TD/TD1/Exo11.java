package TD.TD1;

import java.util.Scanner;

public class Exo11 {
        public static void main(String args []){
            Scanner in = new Scanner (System.in);
            System.out.println("Donner le premier nbr : ");
            int a = in.nextInt();
            System.out.println("Donner la deuxiemme nbr : ");
            int b = in.nextInt();
            int pgcd=0;
            for(int i=1; i<=Math.min(a,b) ;i++){
                    if(a%i==0 && b%i==0){
                        pgcd = i;
                    }
            }
            System.out.println("PGCD est : "+ pgcd);
        }
}
