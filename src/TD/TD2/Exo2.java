package TD.TD2;

import java.util.Scanner;

public class Exo2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        CordonnnePoint P1 = new CordonnnePoint(3.0, 4.0);

        System.out.println("Coordonnées de P1 : (" + P1.getAbscisse() + ", " + P1.getOrdonnee() + ")");

        double normeP1 = P1.Norme();
        System.out.println("Norme de P1 : " + normeP1);

        System.out.println("Hello/.......");

        System.out.println("nouvelle valeure pour P1: ");
        System.out.println("L'abscisses : ");
        double nvAbs = in.nextDouble();

        System.out.println("L'ordonnee : ");
        double nvOrd = in.nextDouble();

        P1.setAbscisse(nvAbs);
        P1.setOrdonnee(nvOrd);
        System.out.println("Nouvelles coordonnées de P1 : (" + P1.getAbscisse() + ", " + P1.getOrdonnee() + ")");
    }
}

class CordonnnePoint {
    private double abscisse;
    private double ordonnee;
    public CordonnnePoint(){
        this.abscisse = 0;
        this.ordonnee = 0;
    }
    public CordonnnePoint(double abscisse, double ordonnee) {
        this.abscisse = abscisse;
        this.ordonnee = ordonnee;
    }
    public double getAbscisse() {
        return abscisse;
    }
    public void setAbscisse(double abscisse) {
        this.abscisse = abscisse;
    }
    public double getOrdonnee() {
        return ordonnee;
    }
    public void setOrdonnee(double ordonnee) {
        this.ordonnee = ordonnee;
    }
    public double Norme(){
        return Math.sqrt((this.abscisse * this.abscisse) + (this.ordonnee * this.ordonnee));
    }
}
