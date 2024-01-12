package TP.services;

import TP.models.DEpartement;
import TP.models.ENseignant;
import TP.models.FIliere;

import java.util.ArrayList;

public class DepartementServices {
    public static DEpartement addDept(String intitule, ENseignant chef, FIliere... filieres) {
        DEpartement departement = new DEpartement();
        departement.setIntitule(intitule);
        departement.setId(DB.getDeptId());



        // Associate filieres with the department
        if (filieres.length > 0) {
            for (FIliere filiere : filieres) {
                departement.getFilieres().add(filiere);
            }
        }

        DB.departements.add(departement);


        return departement;
    }


    public static DEpartement updateDept(int id , String intitule, ENseignant... chef){
        for (DEpartement departement : DB.departements) {
            if (departement.getId() == id) {
                departement.setIntitule(intitule);
                if (chef.length > 0){
                    departement.setChef(chef[0]);
                }
                return departement;
            }
        }

        return  new DEpartement();
    }
    public static ArrayList<DEpartement>  deleteDeptById(int id){
        DB.departements.remove(getDeptById(id));
        return DB.departements ;
    }

    public static DEpartement getDeptById(int id){
        for (DEpartement departement : DB.departements) {
            if (departement.getId() == id) return  departement;
        }
        return  new DEpartement();
    }

    public static ArrayList<DEpartement> getAllDept(){

        return  DB.departements;
    }
    public static boolean isTeacherProfile(ENseignant enseignant) {

        return "prof".equalsIgnoreCase(enseignant.getGrade());
    }
}
