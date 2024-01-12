package TD.TD1;

import java.util.Scanner;

public class Exo12 {
    public static void main(String args []){
        Scanner in = new Scanner (System.in);
        System.out.println("Donner le N : ");
        int n=in.nextInt();

        int i;
        int Un = 1 , Un1 = 1 , Un2 = 1;

        for(i=2; i <= n ; i++){
            Un = Un1 + Un2;
            Un2 = Un1;
            Un1 = Un;
            System.out.println("Un = " + Un);
        }
    }
}
