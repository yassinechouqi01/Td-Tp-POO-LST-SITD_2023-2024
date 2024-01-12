package TP.models;

public class MOdule {
    private int id;
    private String intitule;
    private ENseignant chef;
    private FIliere filiere;

    public MOdule() {
    }

    public MOdule(String intitule, ENseignant chef, FIliere filiere) {
        this.intitule = intitule;
        this.chef = chef;
        this.filiere = filiere;
    }

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public ENseignant getChef() {
        return chef;
    }

    public void setChef(ENseignant chef) {
        this.chef = chef;
    }

    public FIliere getFiliere() {
        return filiere;
    }

    public void setFiliere(FIliere filiere) {
        this.filiere = filiere;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
