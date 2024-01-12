package TD.TD1;

import java.util.Scanner;

public class EXo7{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        int N;
        int a,b,c;
        System.out.println("Donner un nbr de trois chifres # ");
        N = in.nextInt();

        a = N/100;
        b = (N%100)/10;
        c = (N%100)%10;
        System.out.println("a = "+ a + " b = "+ b + " c = " + c);
        System.out.println("\n");
        System.out.println("les nombres qui peuvent etres formes par le chiffre "+ N);
        System.out.println("\n");
        System.out.println("premier chifre : " + a + b + c);
        System.out.println("deuxiemme chifre : " + a + c + b);
        System.out.println("troisiemme chifre : " + b + c + a);
        System.out.println("quatriemme chifre : " + b + a + c);
        System.out.println( "cinquiemme chifre : "+ c + b + a);
        System.out.println("sixiemme chifre : " + c + a + b);

    }
}
