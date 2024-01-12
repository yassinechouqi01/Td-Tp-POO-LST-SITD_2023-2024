package TD.TD1;

import java.util.Scanner;

public class Exo6 {
    public static void main(String args[]){

        Scanner in = new Scanner(System.in);

        int a,b;

        System.out.println("Entre First nbr 'A' : ");
        a = in.nextInt();

        System.out.println("Entre First nbr 'B' : ");
        b = in.nextInt();

        int res;
        res = a*b;

        if (res < 0 ){
            System.out.println("le signe est negative.");
        }else

        if(res > 0 )
            System.out.println("le signe est positive.");

        else
            System.out.println("le produit est null.");



    }
}
