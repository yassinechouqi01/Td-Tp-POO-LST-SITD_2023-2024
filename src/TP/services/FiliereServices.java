package TP.services;

import TP.models.DEpartement;
import TP.models.ENseignant;
import TP.models.FIliere;

import java.util.ArrayList;

public class FiliereServices {

    public static FIliere addFiliere(String intitule, ENseignant chef, DEpartement dept) {
        return new FIliere(intitule, chef, dept);
    }

    public static FIliere updateFiliere(int id, String intitule, ENseignant chef, DEpartement dept){
        FIliere filiere = getFiliereById(id);
        if (filiere != null) {
            filiere.setIntitule(intitule);
            filiere.setChef(chef);
            filiere.setDept(dept);
        }
        return filiere;
    }

    public static ArrayList<FIliere> deleteFiliereById(int id){
        FIliere filiere = getFiliereById(id);
        if (filiere != null) {
            DB.filieres.remove(filiere);
        }
        return DB.filieres;
    }

    public static FIliere getFiliereById(int id){
        for (FIliere filiere : DB.filieres) {
            if (filiere.getId() == id) return filiere;
        }
        return null;
    }

    public static ArrayList<FIliere> getAllFiliere(){
        return DB.filieres;
    }
}
