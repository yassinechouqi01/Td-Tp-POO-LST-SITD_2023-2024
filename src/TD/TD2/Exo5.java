package TD.TD2;

public class Exo5 {

    public static void main(String[] args) {

        System.out.println("Rectangle 1:");
        Rectangle r1 = new Rectangle();
        System.out.println("Les valeurs " + r1.toString());
        System.out.println("Périmètre: " + r1.perimetre());
        System.out.println("Aire: " + r1.aire());
        r1.isCarre();

        System.out.println("\nRectangle 2:");
        Rectangle r2 = new Rectangle(4, 3);
        System.out.println("Les valeurs " + r2.toString());
        System.out.println("Périmètre: " + r2.perimetre());
        System.out.println("Aire: " + r2.aire());
        r2.isCarre();

        System.out.println("\nRectangle 3:");
        Rectangle r3 = new Rectangle(2, 2);
        System.out.println("Les valeurs " + r3.toString());
        System.out.println("Périmètre: " + r3.perimetre());
        System.out.println("Aire: " + r3.aire());
        r3.isCarre();

        System.out.println("\nRectangle 4:");
        Rectangle r4 = new Rectangle(-2, 6);
        System.out.println("Les valeurs " + r4.toString());
        System.out.println("Périmètre: " + r4.perimetre());
        System.out.println("Aire: " + r4.aire());
        r4.isCarre();
    }
}
class Rectangle{
    private double largeur;
    private double longueur;
    public Rectangle() {
        this(1, 1);
        System.out.println("on utilise les valeurs par default '1', '1' ");
    }
    public Rectangle(double longueur, double largeur) {
        setLargeur(largeur);
        setLongueur(longueur);
    }
    public Rectangle(Rectangle rect){
        this.largeur = rect.getLargeur();
        this.longueur = rect.getLongueur();
    }
    //    public Rectangle(Rectangle rect) {
//        this(rect.longueur, rect.largeur);
//    }
    public double getLargeur() {
        return largeur;
    }
    public void setLargeur(double largeur) {
        if(largeur > 0 ){
            this.largeur = largeur;
        }else{
            System.out.println("Les valeurs doit etre positive,La valeur par défaut '1' sera utilisée Pour la Largeur.");
            this.largeur = 1;
        }
    }
    public double getLongueur() {
        return longueur;
    }
    public void setLongueur(double longueur) {
        if(longueur > 0 ){
            this.longueur = longueur;
        }else{
            System.out.println("Les valeurs doit etre positive,La valeur par défaut '1' sera utilisée Pour la Longueur.");
            this.longueur = 1;
        }
    }
    public double perimetre(){
        return 2 * (this.longueur + this.largeur);
    }
    public double aire(){
        return this.longueur * this.largeur;
    }
    public void isCarre(){
        if(this.longueur == this.largeur){
            System.out.println("Yes,is Carre ");
        }else{
            System.out.println("No,is not Carre");
        }
    }
    @Override
    public String toString() {
        return "de Rectangle sont : " + "largeur = " + largeur + ", longueur = " + longueur + '.';
    }
}

