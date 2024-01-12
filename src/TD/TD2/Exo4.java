package TD.TD2;

public class Exo4 {

    public static void main(String[] args) {
        Temps T1 = new Temps(15);
        Temps T2 = new Temps(17,55);
        Temps T3 = new Temps(16,60,50);
        System.out.println("l'heure avant la modification : " + T1.getHeur());
        T1.ajouterHeures(4);
        System.out.println("l'heur apres la modification : "+ T1.getHeur());
        System.out.println();

        System.out.println("Le temps T2 avant : " + T2.toString());
        T2.ajouterMinutes(45);
        System.out.println("Le temps T2 apres : " + T2.toString());
        System.out.println();

        System.out.println("Le temps T3 avant : " + T3.toString());
        T3.ajouterSecondes(40);
        T3.ajouterMinutes(30);
        System.out.println("Le temps T3 apres : " + T3.toString());

    }
}
class Temps {
    private int  heur ;
    private int  minute ;
    private int  seconde ;
    public Temps() {

    }
    public Temps(int heur) {
        this.heur = heur;
    }
    public Temps(int heur , int minute) {
        this(heur);
        this.minute = minute;
    }
    public Temps(int heur , int minute ,int secondes) {
        this(heur,minute);
        this.seconde = secondes;
    }
    public Temps(Temps time) {
        this.heur = time.getHeur();
        this.minute = time.getMinute();
        this.seconde = time.getSeconde();
    }
    public int getHeur() {
        return heur;
    }
    public void setHeur(int heur) {
        this.heur = heur;
    }
    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }
    public int getSeconde() {
        return seconde;
    }
    public void setSeconde(int seconde) {
        this.seconde = seconde;
    }
    public void ajouterHeures(int heures){
        int totalHeurs ;
        totalHeurs = this.heur + heures;
        setHeur(totalHeurs);
    }
    public void ajouterMinutes(int minutes){
        int totalHeurs,totalMinuts ;
        totalMinuts = this.minute + minutes;
        totalHeurs = this.heur + (totalMinuts / 60);
        totalMinuts = totalMinuts % 60;
        setMinute(totalMinuts);
        setHeur(totalHeurs);
    }
    public void ajouterSecondes(int secondes){
        int totalHeurs ,totalMinuts ,totalSeconds ;
        totalSeconds = this.seconde + secondes;
        totalMinuts = this.minute + (totalSeconds / 60);
        totalHeurs = this.heur + (totalMinuts / 60);
        totalMinuts = totalMinuts % 60;
        totalSeconds = totalSeconds % 60;
        setSeconde(totalSeconds);
        setMinute(totalMinuts);
        setHeur(totalHeurs);
    }
    @Override
    public String toString() {
        return "Temps est de : " + "heur=" + this.heur + ", minute=" + this.minute + ", seconde=" + this.seconde + '.';
    }
}
