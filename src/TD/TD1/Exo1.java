package TD.TD1;

import java.util.Scanner;

public class Exo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez la première valeur : ");
        double valeur1 = scanner.nextDouble();

        System.out.println("Entrez la deuxième valeur : ");
        double valeur2 = scanner.nextDouble();

        System.out.println("Entrez la troisième valeur : ");
        double valeur3 = scanner.nextDouble();

//        double maximum = trouverMaximum(valeur1, valeur2, valeur3);

        double max = valeur1;

        if(valeur2 > max ){
            if(valeur3 > max){
                max = valeur3;
            }
            else {
                max = valeur2;
            }
        }else {
            max = valeur1;
        }
        System.out.println("Le maximum des trois valeurs est : " + max);

        scanner.close();
    }

//    private static double trouverMaximum(double a, double b, double c) {
//        // Utilisation de la fonction Math.max pour trouver le maximum
//        return Math.max(Math.max(a, b), c);
//    }
}
