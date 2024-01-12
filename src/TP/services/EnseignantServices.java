package TP.services;

import TP.models.DEpartement;
import TP.models.ENseignant;

import java.util.ArrayList;

public class EnseignantServices {

    public static ENseignant addEns(String nom, String prenom, String email, String grade, DEpartement dept){
        return  new ENseignant();
    }

    public static ENseignant updateEns(int id, String nom, String prenom, String email, String grade, DEpartement dept){
        return  new ENseignant();
    }
    public static ArrayList<ENseignant> deleteEnsById(int id){
        return  DB.enseignants;
    }

    public static ENseignant getEnsById(int id){
        for (ENseignant enseignant : DB.enseignants) {
            if (enseignant.getId() == id) return  enseignant;
        }
        return  new ENseignant();
    }

    public static ArrayList<ENseignant> getAllEns(){
        return  DB.enseignants;
    }
}
