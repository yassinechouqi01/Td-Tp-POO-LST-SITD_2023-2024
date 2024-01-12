package TD.TD2;

public class Exo3 {

    public static void main(String[] args) {
        Livre Lv1 = new Livre("hello...");

        Livre Lv2 = new Livre ("This life","ME_Auteur");

        System.out.println("Titre de Livre 1: " + Lv1.getTitre());
        System.out.println("Titre de Livre 2: " + Lv2.getTitre());
        System.out.println("Auteur de Livre 2: " + Lv2.getAuteur());

    }
}
class Livre {
    private String titre ;
    private String auteur ;
    private double prix;
    private int annee;
    public Livre (){

    }
    public Livre (String titre){
        this.titre = titre ;
    }
    public Livre (String titre , String auteur ){
        this (titre);
        this.auteur = auteur;
    }
    public Livre (String titre , String auteur , double prix ){
        this (titre,auteur);
        this.prix = prix;
    }
    public Livre (String titre , String auteur , double prix , int annee ){
        this (titre,auteur,prix);
        this.annee = annee;
    }
    public Livre (Livre MonLivre){
        this.titre = MonLivre.getTitre();
        this.auteur = MonLivre.getAuteur();
        this.prix = MonLivre.getPrix();
        this.annee = MonLivre.getAnnee();
    }
    public String getTitre() {
        return titre;
    }
    public void setTitre(String titre) {
        this.titre = titre;
    }
    public String getAuteur() {
        return auteur;
    }
    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }
    public double getPrix() {
        return prix;
    }
    public void setPrix(double prix) {
        this.prix = prix;
    }
    public int getAnnee() {
        return annee;
    }
    public void setAnnee(int annee) {
        this.annee = annee;
    }
    @Override
    public String toString() {
        return "Mon Livre est de : {" + "titre=" + this.titre + ", auteur=" + this.auteur + ", prix=" + this.prix + ", annee=" + this.annee + '}';
    }
}

