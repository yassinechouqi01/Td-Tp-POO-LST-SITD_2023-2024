package TD.TD1;

import java.util.Scanner;

public class Exo14 {
    public static void main(String args []){
        Scanner in = new Scanner (System.in);
        System.out.println("Donner le N : ");
        int n=in.nextInt();

        for( int i=1 ; i<=n ;i++){
            for(int j=1 ; j<=i ; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println("==========================\n");

        for( int i=1 ; i<=n ;i++){
            for(int j=1 ; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for( int i=n-1 ; i>0 ;i--){
            for(int j=0 ; j< i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
