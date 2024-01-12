package TD.TD1;

import java.util.Scanner;

public class Exo19 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Entrez un nombre décimal : ");
        int nbr = in.nextInt();
//      //lire le nombre décimal
//      int nbr = sc.nextInt();
//      String str = Integer.toBinaryString(nbr);
//      System.out.println("Le nombre binaire est : "+str);
//    }

        int N=32;
        int B[] = new int[N];
        int originalNbr = nbr;
        int index = 0;

//       out: for(int i = 0 ; i < N; i++){
//            if(nbr > 0){
//                T[i] = nbr % 2;
//                nbr  = nbr / 2;
//            }
//            else {
//                break out;
//            }
//        }

        while(nbr > 0){
            B[index] = nbr % 2;
            nbr  = nbr / 2;
            index++;
        }


//    int[] T = new int[index];
//    for(int i = 0 ; i < index; i++){
//        T[i] = B[i];
//    }
//        System.out.print("la representation binaire de "+ originalNbr + " est : ");
//        for(int i = T.length-1 ; i >= 0; i-- ){
//            System.out.print(""+T[i]);
//        }
//        System.out.println("");


        System.out.print("la representation binaire de "+ originalNbr + " est : ");
        for(int i = index-1 ; i >= 0; i-- ){

            System.out.print(""+B[i]);
        }
        System.out.println("");

    }
}
