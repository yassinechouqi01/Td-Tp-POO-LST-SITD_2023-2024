package TP.models;

import java.util.ArrayList;
import TP.gestion.Basedd;
public class DEpartement {

    private int id;
    private String intitule;
    private ENseignant chef;
    ArrayList<FIliere> filieres = new ArrayList<FIliere>();

    public DEpartement() {
    }

    public DEpartement(String intitule, ENseignant chef) {
        this.intitule = intitule;
        this.chef = chef;
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

    public ArrayList<FIliere> getFilieres() {
        return filieres;
    }

    public void setFilieres(ArrayList<FIliere> filieres) {
        this.filieres = filieres;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DEpartement{id=").append(id);
        sb.append(", intitule='").append(intitule).append('\'');
        if (chef != null) {
            sb.append(", chef=").append(chef.getId());
        } else {
            sb.append(", chef=null");
        }
        sb.append('}');
        return sb.toString();
    }
}
