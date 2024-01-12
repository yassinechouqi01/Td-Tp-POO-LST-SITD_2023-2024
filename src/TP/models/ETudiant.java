package TP.models;

import java.util.ArrayList;

public class ETudiant {

    private int id;
    private String nom;
    private String prenom;
    private String email;
    private int apogee;
    private FIliere filiere;
    ArrayList<NOte> notes = new ArrayList<NOte>();



    public ETudiant() {
    }

    public ETudiant(String nom, String prenom, String email, int apogee, FIliere filiere) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.apogee = apogee;
        this.filiere = filiere;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getApogee() {
        return apogee;
    }

    public void setApogee(int apogee) {
        this.apogee = apogee;
    }

    public FIliere getFiliere() {
        return filiere;
    }

    public void setFiliere(FIliere filiere) {
        this.filiere = filiere;
    }

    public ArrayList<NOte> getNotes() {
        return notes;
    }

    public void setNotes(ArrayList<NOte> notes) {
        this.notes = notes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
