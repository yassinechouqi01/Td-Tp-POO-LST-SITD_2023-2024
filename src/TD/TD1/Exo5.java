package TD.TD1;

import java.util.Scanner;

public class Exo5 {
    public static void main(String[] args){
        Scanner in = new Scanner (System.in);
        int hr;
        System.out.println("Donner L'heur :" );
        hr = in.nextInt();
        char ch;
        System.out.println("donner votre choix : ");
        System.out.println("Pour Francais saisir # 'f' ");
        System.out.println("Pour Anglais saisir # 'a' ");
        ch = in.next().charAt(0);
        switch(ch){
            case 'f' -> {
                if(hr<18 && hr>0)
                    System.out.println("Bonjour ");
                if(hr<22 && hr>18)
                    System.out.println("Bonsoir");
                if(hr>22)
                    System.out.println("Bonne nuit");
            }
            case 'a' -> {
                if(hr<18 && hr>0)
                    System.out.println("Good Morning");

                if(hr<22 && hr>18)
                    System.out.println("Good Evening ");

                if(hr>22)
                    System.out.println("Good Night");
            }
            default -> System.out.println("Enter a valid caracter ,Try agian.");
        }
    }
}
