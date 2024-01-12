package TD.TD1;

import java.util.Scanner;

public class Exo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez la valeur de a : ");
        double a = scanner.nextDouble();

        System.out.println("Entrez la valeur de b : ");
        double b = scanner.nextDouble();

        System.out.println("Entrez la valeur de c : ");
        double c = scanner.nextDouble();

        double disc = b * b - 4 * a * c;

        if (disc > 0) {
            double s1 = (-b + Math.sqrt(disc)) / (2 * a);
            double s2 = (-b - Math.sqrt(disc)) / (2 * a);
            System.out.println("Les solutions de l'équation sont : " + s1 + " et " + s2);
        } else if (disc == 0) {
            double s = -b / (2 * a);
            System.out.println("L'équation a une solution double : " + s);
        } else {
            System.out.println("L'équation n'a pas de solutions réelles.");
        }
    }
}
