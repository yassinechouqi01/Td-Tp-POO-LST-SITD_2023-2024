package TD.TD3;

public class Exo5 {
    public static void main(String [] args){
        Vehicule v1 = new Vehicule(5);
        System.out.println(v1.toString());;

        Moto m1 = new Moto(1);

    }
}
class Vehicule{
    private  int nbPassager;

    public Vehicule(int n){
        this.nbPassager = n;
    }

    @Override
    public String toString() {
        return "Vehicule est de nbr de passage = " + getNbPassager();
    }

    public int getNbPassager() {
        return nbPassager;
    }

    public void setNbPassager(int nbPassager) {
        this.nbPassager = nbPassager;
    }
}

class Moto extends Vehicule{
    private int nbrRoues = 2;
    public Moto(int n) {
        super(n);
    }
    public Moto(int n, int nbrRoues) {
        super(n);
        this.nbrRoues = nbrRoues;
    }

}

class Avion extends Vehicule{
    private int nbrMoteur;
    public Avion(int nbP){
        super(nbP);
    }
    public Avion(int nbP, int nbM){
        super(nbP);
        this.nbrMoteur = nbM;
    }
}
class Triporteur extends Moto{
    private int nbrTriport;
    public Triporteur(int nbP){
        super(nbP);
    }
    public Triporteur(int nbP, int nbT){
        super(nbP);
        this.nbrTriport = nbT;
    }
}
