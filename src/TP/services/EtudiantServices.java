package TP.services;

import TP.models.ETudiant;
import TP.models.FIliere;

import java.util.ArrayList;

public class EtudiantServices {

    public static ETudiant addEtd(String nom, String prenom, String email, int apogee, FIliere filiere){
        return new ETudiant(nom, prenom, email, apogee, filiere);
    }

    public static ETudiant updateEtd(int id, String nom, String prenom, String email, int apogee, FIliere filiere){
        ETudiant etudiant = getEtdById(id);
        if (etudiant != null) {
            etudiant.setNom(nom);
            etudiant.setPrenom(prenom);
            etudiant.setEmail(email);
            etudiant.setApogee(apogee);
            etudiant.setFiliere(filiere);
        }
        return etudiant;
    }

    public static ArrayList<ETudiant> deleteEtdById(int id){
        ETudiant etudiant = getEtdById(id);
        if (etudiant != null) {
            DB.etudiants.remove(etudiant);
        }
        return DB.etudiants;
    }

    public static ETudiant getEtdById(int id){
        for (ETudiant etudiant : DB.etudiants) {
            if (etudiant.getId() == id) return etudiant;
        }
        return null;
    }

    public static ArrayList<ETudiant> getAllEtd(){
        return DB.etudiants;
    }
}
