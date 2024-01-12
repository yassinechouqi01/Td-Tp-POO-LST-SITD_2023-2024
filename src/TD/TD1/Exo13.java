package TD.TD1;

import java.util.Scanner;

public class Exo13 {
    public static void main(String args []){
        Scanner in = new Scanner (System.in);
//        System.out.println("Donner le N : ");
//        int n=in.nextInt();
        int p=0;
        for( int i=1 ; i<=9 ;i++){
            for(int j=1 ; j<=9 ; j++){
                for(int k=1; k<=9 ; k++){
                    if(i+k+j == 15){
                        System.out.println(i+"+"+j+"+"+k);
                        p++;
                    }
                }
            }
        }
        System.out.println("le nombre de possibilite c'est : " + p);
    }
}
